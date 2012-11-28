package fr.capwebct.capdemat.plugins.externalservices.horanet.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.activation.DataHandler;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.axis.Constants;
import org.apache.axis.attachments.AttachmentPart;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.jaxen.JaxenException;
import org.jaxen.XPath;
import org.jaxen.dom.DOMXPath;
import org.jdom.output.XMLOutputter;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.zenexity.booker.ws.WSClient;
import com.zenexity.booker.ws.sitesproduits.ProduitType;
import com.zenexity.booker.ws.sitesproduits.ProduitsType;
import com.zenexity.booker.ws.sitesproduits.SegmentType;
import com.zenexity.booker.ws.sitesproduits.SegmentsType;
import com.zenexity.booker.ws.sitesproduits.SiteType;
import com.zenexity.booker.ws.sitesproduits.SitesProduits;
import com.zenexity.booker.ws.sitesproduits.SitesType;

import fr.cg95.cvq.business.authority.LocalAuthorityResource.Type;
import fr.cg95.cvq.business.payment.ExternalAccountItem;
import fr.cg95.cvq.business.payment.ExternalDepositAccountItem;
import fr.cg95.cvq.business.payment.ExternalDepositAccountItemDetail;
import fr.cg95.cvq.business.payment.ExternalInvoiceItem;
import fr.cg95.cvq.business.payment.ExternalInvoiceItemDetail;
import fr.cg95.cvq.business.payment.ExternalTicketingContractItem;
import fr.cg95.cvq.business.payment.PurchaseItem;
import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.RequestState;
import fr.cg95.cvq.business.request.workflow.event.IWorkflowPostAction;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowCompleteEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowGenericEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowPendingEvent;
import fr.cg95.cvq.business.users.Child;
import fr.cg95.cvq.business.users.HomeFolder;
import fr.cg95.cvq.business.users.Individual;
import fr.cg95.cvq.business.users.external.IndividualMapping;
import fr.cg95.cvq.exception.CvqConfigurationException;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.exception.CvqRemoteException;
import fr.cg95.cvq.external.ExternalServiceBean;
import fr.cg95.cvq.external.impl.ConfigurableExternalProviderServiceAdapter;
import fr.cg95.cvq.security.SecurityContext;
import fr.cg95.cvq.service.authority.ILocalAuthorityRegistry;
import fr.cg95.cvq.service.payment.IPaymentService;
import fr.cg95.cvq.service.request.IRequestSearchService;
import fr.cg95.cvq.service.request.IRequestTypeService;
import fr.cg95.cvq.service.request.IRequestWorkflowService;
import fr.cg95.cvq.service.request.leisure.external.IActivityRegistrationProviderService;
import fr.cg95.cvq.service.users.IUserSearchService;
import fr.cg95.cvq.service.users.external.IExternalHomeFolderService;
import fr.cg95.cvq.util.Pair;
import fr.cg95.cvq.xml.common.RequestType;
import fr.cg95.cvq.xml.common.SchoolType;
/**
 * @author Benoit Orihuela (bor@zenexity.fr)
 */
public class HoranetService extends ConfigurableExternalProviderServiceAdapter implements IActivityRegistrationProviderService {

    private static Logger logger = Logger.getLogger(HoranetService.class);

    private static final String HORANET_CVQ_NS = "http://www.horanet.com/CVQ/";
    private static final String HORANET_CVQ2_NS = "http://www.horanet.com/CVQ2/";
    private static final String HORANET_CVQ3_NS = "http://www.horanet.com/CVQ3/";

    private String label;
    
    private Map<String, ExternalServiceBean> localAuthoritySpecificConfiguration =
        new HashMap<String, ExternalServiceBean>();
    private Map<String, String> globalConfiguration = new HashMap<String, String>();
    
    private String encoding = "ISO-8859-1";

    private Service service;
    private Call call;

    private IUserSearchService userSearchService;
    private IExternalHomeFolderService externalHomeFolderService;
    private ILocalAuthorityRegistry localAuthorityRegistry;
    private IRequestTypeService requestTypeService;
    private IRequestSearchService requestSearchService;

    private WSClient ws;

    /**
     * @fixme use it instead all those ifs and casts !
     */
    private String getNodeAttribute(Node node, String attributeName, String defaultValue) {
        if (node.getAttributes().getNamedItem(attributeName) != null)
            return node.getAttributes().getNamedItem(attributeName).getNodeValue();
        else
            return defaultValue;
    }

    public final String sendRequest(XmlObject requestXml)
        throws CvqException {

        try {
            String SOAP_ACTION_URI = HORANET_CVQ_NS + "AddCanteenRegistrationWithoutCSN";
            service = new Service();

            call = (Call) service.createCall();
            call.setOperationName(new QName(HORANET_CVQ_NS, "AddCanteenRegistrationWithoutCSN"));

            XmlOptions xmlOptions = new XmlOptions();
            xmlOptions.setCharacterEncoding("ISO-8859-1");

            String requestAsString = null;
            try {
                DocumentFragment documentFragment = (DocumentFragment) requestXml.newDomNode();
                Source source = new DOMSource(documentFragment);
                StringWriter stringWriter = new StringWriter();
                Result result = new StreamResult(stringWriter);
                TransformerFactory factory = TransformerFactory.newInstance();
                Transformer transformer = factory.newTransformer();
                transformer.transform(source, result);
                requestAsString = stringWriter.getBuffer().toString();
                requestAsString = requestAsString.substring(requestAsString.indexOf('>') + 1);
            } catch (TransformerConfigurationException e) {
                e.printStackTrace();
            } catch (TransformerException e) {
                e.printStackTrace();
            }
           
            if (requestAsString == null) {
                logger.error("sendRequest() unable to parse request document as a string");
                return "";
            } else {
                logger.debug("sendRequest() sending to Horanet : " + requestAsString);
            }
            
//            ByteArrayDataSource bds = 
//                new ByteArrayDataSource(requestXml.xmlText(xmlOptions), "text/xml; charset=iso-8859-1");
            ByteArrayDataSource bds =
                new ByteArrayDataSource(requestAsString, "text/xml; charset=iso-8859-1");
            DataHandler dhSource = new DataHandler(bds);

            call.setProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY, getConfigurationProperty("login"));
            call.setProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY, getConfigurationProperty("password"));
            call.setProperty(Call.ATTACHMENT_ENCAPSULATION_FORMAT, Call.ATTACHMENT_ENCAPSULATION_FORMAT_DIME);
            call.setProperty(Call.CHARACTER_SET_ENCODING, "ISO-8859-1");

            call.setTargetEndpointAddress(getConfigurationProperty("endPoint"));
            call.setSOAPActionURI(SOAP_ACTION_URI);

            logger.debug("sendRequest() sending to endpoint " + getConfigurationProperty("endPoint"));
            logger.debug("sendRequest() sending on action " + SOAP_ACTION_URI);
            
            call.addParameter(new QName(HORANET_CVQ_NS, "ZipCode"), Constants.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(HORANET_CVQ_NS, "ActivityID"), Constants.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(HORANET_CVQ_NS, "ProcClass"), Constants.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(HORANET_CVQ_NS, "ProcID"), Constants.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(HORANET_CVQ_NS, "FamilyID"), Constants.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(HORANET_CVQ_NS, "School"), Constants.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(HORANET_CVQ_NS, "ChildID"), Constants.XSD_STRING, ParameterMode.IN);

            call.setReturnType(XMLType.AXIS_VOID);
            call.addAttachmentPart(dhSource);

            logger.debug("sendRequest() calling HoraNet");

            RequestType request = (RequestType) requestXml;

            // FIXME : Horanet could/should extract school from XML
            String schoolName = "";
            try {
                Method getSchoolMethod = request.getClass().getMethod("getSchool");
                SchoolType school = (SchoolType) getSchoolMethod.invoke(request);
                if (school != null)
                    schoolName = school.getName();
            } catch (Exception e) {
                // so this request object has no school property
                // that's not a problem
                logger.debug("sendRequest() no school property for request " + request);
            }

            // extract child information iff request's subject is of type child
            Long subjectId = null;
            if (request.getSubject() != null && request.getSubject().getChild() != null) {
                subjectId = request.getSubject().getChild().getId();
            }
            String childId = subjectId != null ? String.valueOf(subjectId) : "";
            call.invoke(new Object[] {
                    SecurityContext.getCurrentSite().getPostalCode(),
                    request.getRequestTypeLabel(),
                    request.getRequestTypeLabel(),
                    Long.toString(request.getId()),
                    Long.toString(request.getHomeFolder().getId()),
                    schoolName,
                    childId
            });

            logger.debug("sendRequest() request has been sent to Horanet");
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + e.getMessage());
        }

        return null;
    }

    @Override
    public final void creditHomeFolderAccounts(final Collection purchaseItems, final String cvqReference,
            final String bankReference, final Long homeFolderId, String externalHomeFolderId, String externalId, final Date validationDate)
        throws CvqException {

        try {
            String SOAP_ACTION_URI = HORANET_CVQ_NS + "CreditAccount2";

            service = new Service();
            call = (Call) service.createCall();
            call.setReturnType(org.apache.axis.Constants.XSD_ANY);
            call.setOperationName(new QName(HORANET_CVQ_NS, "CreditAccount2"));
            call.setProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY, getConfigurationProperty("login"));
            call.setProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY, getConfigurationProperty("password"));
            call.setProperty(Call.ATTACHMENT_ENCAPSULATION_FORMAT, Call.ATTACHMENT_ENCAPSULATION_FORMAT_DIME);
            call.setTargetEndpointAddress(getConfigurationProperty("endPoint"));
            call.setSOAPActionURI(SOAP_ACTION_URI);

            int total = 0;
            for (Iterator i = purchaseItems.iterator(); i.hasNext();) {
                PurchaseItem purchaseItem = (PurchaseItem) i.next();
                total = total + purchaseItem.getAmount().intValue();
            }

            HomeFolder homeFolder = userSearchService.getHomeFolderById(homeFolderId);
            String xmlPayment = null;
            try {
                xmlPayment = paymentToXml(purchaseItems, cvqReference, 
                        bankReference, homeFolder, validationDate);
                logger.debug("creditHomeFolderAccounts() got XML payment " + xmlPayment);
            } catch (IOException ioe) {
                logger.error("creditHomeFolderAccounts() Error while preparing XML payment"
                        + ioe.getMessage());
                throw new CvqException("Error while preparing XML payment");
            }

            AttachmentPart attachement = new AttachmentPart();
            attachement.setContent(xmlPayment, "text/xml; charset=iso-8859-1");

            call.addParameter(new QName(HORANET_CVQ_NS, "ZipCode"), Constants.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(HORANET_CVQ_NS, "FamilyID"), Constants.XSD_STRING, ParameterMode.IN);
            call.setReturnType(Constants.XSD_ANY);
            call.addAttachmentPart(attachement);

            call.invoke(new Object[] {
                            SecurityContext.getCurrentSite().getPostalCode(),
                            homeFolder.getId().toString()
                        });

        } catch (ServiceException se) {
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + se.getMessage());
        } catch (RemoteException re) {
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + re.getMessage());
        } catch (Exception pe) {
            pe.printStackTrace();
            throw new CvqRemoteException("Failed to generate XML attachment : " + pe.getMessage());
        }
    }

    public final Map<Date, String> getConsumptions(Long key,
            final Date dateFrom, final Date dateTo)
        throws CvqException {

        String SOAP_ACTION_URI = HORANET_CVQ2_NS + "GetChildTransactions2";
        Map<Date, String> results = new LinkedHashMap<Date, String>();
        try {

            service = new Service();
            call = (Call) service.createCall();
            call.setReturnType(org.apache.axis.Constants.XSD_ANY);
            call.setOperationName(new QName(HORANET_CVQ2_NS, "GetChildTransactions2"));
            call.setProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY, getConfigurationProperty("login"));
            call.setProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY, getConfigurationProperty("password"));
            call.setTargetEndpointAddress(getConfigurationProperty("endPoint2"));
            call.setSOAPActionURI(SOAP_ACTION_URI);

            call.addParameter(new QName(HORANET_CVQ2_NS, "ZipCode"), Constants.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(HORANET_CVQ2_NS, "ProcID"), Constants.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(HORANET_CVQ2_NS, "start_search"), Constants.XSD_DATE, ParameterMode.IN);
            call.addParameter(new QName(HORANET_CVQ2_NS, "end_search"), Constants.XSD_DATE, ParameterMode.IN);

            logger.debug("getConsumptionsByRequest() Proc ID : " + key.toString());

            call.invoke(new Object[] {
                            SecurityContext.getCurrentSite().getPostalCode(),
                            key.toString(),
                            dateFrom,
                            dateTo
                        });

            if (call.getResponseMessage() == null) {
                logger.warn("getConsumptionsByRequest() received an empty response");
                return results;
            }
            Iterator attachements = call.getResponseMessage().getAttachments();
            AttachmentPart attachmentPart = (AttachmentPart) attachements.next();
            byte[] data = new byte[attachmentPart.getSize()];
            ((InputStream) attachmentPart.getContent()).read(data);
            logger.debug("getConsumptionsByRequest() got : " + new String(data, encoding));
            InputSource inputSource =
                new InputSource((InputStream) attachmentPart.getContent());
            inputSource.setEncoding(encoding);
            Document consumptionXMLDocument =
                DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputSource);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
            XPath xpath = new DOMXPath("//events/event");
            List eventNodes = xpath.selectNodes(consumptionXMLDocument);
            for (int i = 0; i < eventNodes.size(); i ++) {
                Node event = (Node) eventNodes.get(i);
                NamedNodeMap attributes = event.getAttributes();
                Node dateNode = attributes.getNamedItem("event-date");
                Node labelNode = attributes.getNamedItem("event-label4");
                Date eventDate = simpleDateFormat.parse(dateNode.getNodeValue());
                logger.debug("adding label " + labelNode.getNodeValue()
                             + " with date " + eventDate);
                if (results.get(eventDate) != null && results.get(eventDate) != labelNode.getNodeValue()) {
                    Calendar calendar = new GregorianCalendar();
                    calendar.setTime(eventDate);
                    calendar.add(Calendar.SECOND, 1);
                    results.put(calendar.getTime(), labelNode.getNodeValue());
                } else { 
                    results.put(eventDate, labelNode.getNodeValue());
                }
            }
        } catch (ServiceException se) {
            logger.error("getConsumptionsByRequest() unable to get consumptions for request " 
                    + key, se);
        } catch (RemoteException re) {
            logger.error("getConsumptionsByRequest() unable to get consumptions for request " 
                    + key, re);
        } catch (SAXException saxe) {
            logger.error("getConsumptionsByRequest() unable to get consumptions for request " 
                    + key, saxe);
        } catch (IOException ioe) {
            logger.error("getConsumptionsByRequest() unable to get consumptions for request " 
                    + key, ioe);
        } catch (SOAPException soape) {
            logger.error("getConsumptionsByRequest() unable to get consumptions for request " 
                    + key, soape);
        } catch (JaxenException jaxe) {
            logger.error("getConsumptionsByRequest() unable to get consumptions for request " 
                    + key, jaxe);
        } catch (ParseException pe) {
            logger.error("getConsumptionsByRequest() unable to get consumptions for request " 
                    + key, pe);
        } catch (ParserConfigurationException pce) {
            logger.error("getConsumptionsByRequest() unable to get consumptions for request " 
                    + key, pce);
        }

        return results;
    }

    private final Document getHomeFolderAccountsDocument(final Long homeFolderId)
        throws CvqException {
        
        String SOAP_ACTION_URI = HORANET_CVQ_NS + "GetFamilyAccounts";

        try {
            service = new Service();
            call = (Call) service.createCall();
            call.setReturnType(org.apache.axis.Constants.XSD_ANY);
            call.setOperationName(new QName(HORANET_CVQ_NS, "GetFamilyAccounts"));
            call.setProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY, getConfigurationProperty("login"));
            call.setProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY, getConfigurationProperty("password"));
            call.setTargetEndpointAddress(getConfigurationProperty("endPoint"));
            call.setSOAPActionURI(SOAP_ACTION_URI);

            call.addParameter(new QName(HORANET_CVQ_NS, "ZipCode"), 
                    Constants.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(HORANET_CVQ_NS, "FamilyID"), 
                    Constants.XSD_STRING, ParameterMode.IN);

            HomeFolder currentHomeFolder = userSearchService.getHomeFolderById(homeFolderId);

            call.invoke(new Object[] {
                            SecurityContext.getCurrentSite().getPostalCode(),
                            currentHomeFolder.getId().toString()
                        });

            // Horanet often fails to return a valid response (even an empty one)
            // so prevent NPEs from jumping over
            if (call.getResponseMessage() == null) {
                logger.warn("getHomeFolderAccountsDocument() Horanet returned a null response for home folder "
                        + homeFolderId);
                throw new CvqRemoteException("Impossible de remonter les éléments de facturation du service distant");
            }
            Iterator attachements = call.getResponseMessage().getAttachments();
            AttachmentPart attachmentPart = (AttachmentPart) attachements.next();
            byte[] data = new byte[attachmentPart.getSize()];
            ((InputStream) attachmentPart.getContent()).read(data);
            logger.debug("getHomeFolderAccounts() got : " + new String(data, encoding));
            InputSource inputSource =
                new InputSource((InputStream) attachmentPart.getContent());
            inputSource.setEncoding(encoding);
            Document accountsXMLDocument =
                DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputSource);

            return accountsXMLDocument;
            
        } catch (ServiceException se) {
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + se.getMessage());
        } catch (RemoteException re) {
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + re.getMessage());
        } catch (SAXException saxe) {
            throw new CvqException("Failed to parse received data : " + saxe.getMessage());
        } catch (IOException ioe) {
            throw new CvqRemoteException("Failed to read received data : " + ioe.getMessage());
        } catch (SOAPException soape) {
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + soape.getMessage());
        } catch (ParserConfigurationException pce) {
            throw new CvqException("Failed to parse received data : " + pce.getMessage());
        }
    }
    
    public final Map<String, List<ExternalAccountItem> > getAccountsByHomeFolder(final Long homeFolderId, String externalHomeFolderId, String externalId) 
        throws CvqException {

        Map<String, List<ExternalAccountItem> > results = 
            new HashMap<String, List<ExternalAccountItem> >();
        try {
            Document accountsXMLDocument = getHomeFolderAccountsDocument(homeFolderId);
            SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");

            //régie
            XPath xpath = new DOMXPath("//regie");
            List regieElements = (List) xpath.evaluate(accountsXMLDocument);
            List<ExternalAccountItem> bills = new ArrayList<ExternalAccountItem>();
            List<ExternalAccountItem> depositAccounts = new ArrayList<ExternalAccountItem>();
            List<ExternalAccountItem> ticketingAccounts = new ArrayList<ExternalAccountItem>();

            for (Iterator k = regieElements.iterator(); k.hasNext();) {
                Node nodeRegieElem = (Node) k.next();
                NodeList nodeList= nodeRegieElem.getChildNodes();
                NamedNodeMap regieAttr = nodeRegieElem.getAttributes();
                String regie =  regieAttr.getNamedItem("regielabel").getNodeValue();
                List billList = new ArrayList();
                List accountList = new ArrayList();
                List childList = new ArrayList();
                for(int j=0;j< nodeList.getLength();j++){
                    if(nodeList.item(j).getNodeName().equals("bills")){
                        billList.add(nodeList.item(j));
                    }
                    if(nodeList.item(j).getNodeName().equals("accounts")){
                        accountList.add(nodeList.item(j));
                    }
                    if(nodeList.item(j).getNodeName().equals("contracts")){
                        childList.add(nodeList.item(j));
                    }
                }
                NodeList billElements = null;
                if(billList.size() >= 1){
                    billElements = (NodeList) billList.get(0);
                }
                NodeList accountElements = null;
                if(accountList.size() >= 1){
                    accountElements = (NodeList) accountList.get(0);
                }
                NodeList childElements = null;
                if(childList.size() >= 1){
                    childElements = (NodeList) childList.get(0);
                }

                // deposit accounts
                for (int h=0; h< accountElements.getLength(); h++) {
                    Node node = (Node) accountElements.item(h);
                    String accountId = node.getAttributes().getNamedItem("account-id").getNodeValue();
                    String accountValue = node.getAttributes().getNamedItem("account-value").getNodeValue();
                    Date accountDate = 
                        simpleDateFormat.parse(node.getAttributes().getNamedItem("account-date").getNodeValue());
                    String label = node.getAttributes().getNamedItem("account-label").getNodeValue();

                    ExternalDepositAccountItem edai = 
                        new ExternalDepositAccountItem(label, Double.parseDouble(accountValue), 
                                getLabel(), accountId, accountDate, Double.parseDouble(accountValue),
                                regie);
                    depositAccounts.add(edai);
                }

                //  bill accounts
                for (int h=0; h< billElements.getLength(); h++) {
                    Node node = (Node) billElements.item(h);
                    NamedNodeMap nodeAttrs = node.getAttributes();
                    String billId = nodeAttrs.getNamedItem("bill-id").getNodeValue();
                    String billAmount = nodeAttrs.getNamedItem("bill-value").getNodeValue();
                    Date billIssueDate =
                        simpleDateFormat.parse(nodeAttrs.getNamedItem("bill-date").getNodeValue());
                    Date billExpirationDate = null;
                    if (nodeAttrs.getNamedItem("bill-date-expiration") != null)
                        billExpirationDate =
                            simpleDateFormat.parse(nodeAttrs.getNamedItem("bill-date-expiration").getNodeValue());
                    Date billPaymentDate = null;
                    if (nodeAttrs.getNamedItem("bill-date-payment") != null)
                        billPaymentDate =
                            simpleDateFormat.parse(nodeAttrs.getNamedItem("bill-date-payment").getNodeValue());
                    String label = nodeAttrs.getNamedItem("bill-label").getNodeValue();
                    String billPayed = "0";
                    if (nodeAttrs.getNamedItem("bill-payed") != null)
                        billPayed = nodeAttrs.getNamedItem("bill-payed").getNodeName();
                    Boolean isPayed = Boolean.FALSE;
                    if (billPayed.equals("1"))
                        isPayed = true;

                    ExternalInvoiceItem eii =
                        new ExternalInvoiceItem(label, Double.valueOf(billAmount),
                                Double.valueOf(billAmount), getLabel(), billId, billIssueDate,
                                billExpirationDate, billPaymentDate, isPayed, regie);

                    bills.add(eii);
                }

                //  contracts accounts
                for (int h=0; h< childElements.getLength(); h++) {
                    Node node = (Node) childElements.item(h);
                    NamedNodeMap nodeAttrs = node.getAttributes();
                    String card = nodeAttrs.getNamedItem("child-card").getNodeValue();
                    String childCsn = null;
                    if (nodeAttrs.getNamedItem("child-csn") != null)
                        childCsn = nodeAttrs.getNamedItem("child-csn").getNodeValue();
                    String childId = nodeAttrs.getNamedItem("child-id").getNodeValue();

                    Child child = userSearchService.getChildById(new Long(childId));
                    if (child == null) {
                        logger.error("getHomeFolderAccounts() could not find child with id : " + childId);
                        continue;
                    }

                    NodeList contractsNodes = node.getChildNodes();
                    for (int j = 0; j < contractsNodes.getLength(); j++) {
                        Node contractNode = contractsNodes.item(j);
                        if (contractNode.getNodeName() != null
                                && contractNode.getNodeName().equals("contract")) {

                            String contractId = 
                                contractNode.getAttributes().getNamedItem("contract-id").getNodeValue();
                            String contractValue = 
                                contractNode.getAttributes().getNamedItem("contract-value").getNodeValue();
                            String contractLabel = 
                                contractNode.getAttributes().getNamedItem("contract-label").getNodeValue();
                            Date contractDate = 
                                simpleDateFormat.parse(contractNode.getAttributes().getNamedItem("contract-date").getNodeValue());
                            int buyPrice = 
                                Integer.parseInt(contractNode.getAttributes().getNamedItem("buy-price").getNodeValue());
                            int minBuy = 
                                Integer.parseInt(contractNode.getAttributes().getNamedItem("min-buy").getNodeValue());
                            int maxBuy = 
                                Integer.parseInt(contractNode.getAttributes().getNamedItem("max-buy").getNodeValue());

                            ExternalTicketingContractItem etci = 
                                new ExternalTicketingContractItem(contractLabel, 
                                        null, getLabel(), contractId, child.getId(),
                                        Double.valueOf(buyPrice), Integer.valueOf(minBuy), 
                                        Integer.valueOf(maxBuy), null, contractDate, 
                                        Integer.valueOf(contractValue), regie);
                            if (childCsn != null)
                                etci.addExternalServiceSpecificData("child-csn", childCsn);
                            
                            ticketingAccounts.add(etci);
                        }
                    }
                }

            }
            results.put(IPaymentService.EXTERNAL_INVOICES, bills);
            results.put(IPaymentService.EXTERNAL_DEPOSIT_ACCOUNTS, depositAccounts);
            results.put(IPaymentService.EXTERNAL_TICKETING_ACCOUNTS, ticketingAccounts);

        } catch (JaxenException jaxe) {
            throw new CvqException("Failed to parse received data : " + jaxe.getMessage());
        } catch (ParseException pe) {
            throw new CvqException("Failed to parse received data : " + pe.getMessage());
        }
        
        return results;
    }

    public final void loadDepositAccountDetails(ExternalDepositAccountItem edai)
        throws CvqException {
        
        logger.debug("loadDepositAccountDetails()");

        String SOAP_ACTION_URI = HORANET_CVQ3_NS + "GetAccountDetails";
        try {

            service = new Service();
            call = (Call) service.createCall();
            call.setReturnType(org.apache.axis.Constants.XSD_ANY);
            call.setOperationName(new QName(HORANET_CVQ3_NS, "GetAccountDetails"));
            call.setProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY, getConfigurationProperty("login"));
            call.setProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY, getConfigurationProperty("password"));
            call.setTargetEndpointAddress(getConfigurationProperty("endPoint3"));
            call.setSOAPActionURI(SOAP_ACTION_URI);

            call.addParameter(new QName(HORANET_CVQ3_NS, "AccountID"), 
                    Constants.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(HORANET_CVQ3_NS, "start_search"), 
                    Constants.XSD_DATE, ParameterMode.IN);
            call.addParameter(new QName(HORANET_CVQ3_NS, "end_search"), 
                    Constants.XSD_DATE, ParameterMode.IN);

            logger.debug("loadDepositAccountDetails() Account Id : " + edai.getExternalItemId());

            // hardcoded three months range
            // change that when it is needed
            Date dateTo = new Date();
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(dateTo);
            calendar.add(Calendar.MONTH, -3);
            
            call.invoke(new Object[] {
                            edai.getExternalItemId(),
                            calendar.getTime(),
                            dateTo
                        });

            if (call.getResponseMessage() == null || call.getResponseMessage().getAttachments() == null
                    || !call.getResponseMessage().getAttachments().hasNext())
                return;
            Iterator attachements = call.getResponseMessage().getAttachments();
            AttachmentPart attachmentPart = (AttachmentPart) attachements.next();
            byte[] data = new byte[attachmentPart.getSize()];
            ((InputStream) attachmentPart.getContent()).read(data);
            logger.debug("loadDepositAccountDetails() got : " + new String(data, encoding));
            InputSource inputSource =
                new InputSource((InputStream) attachmentPart.getContent());
            inputSource.setEncoding(encoding);
            Document depositAccountDetailsDocument =
                DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputSource);

            // clear existing details
            if (edai.getAccountDetails() != null)
                edai.getAccountDetails().clear();
            
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");
            XPath xpath = new DOMXPath("//accountDetails/accountDetail");
            List accountDetailNodes = xpath.selectNodes(depositAccountDetailsDocument);
            for (int i = 0; i < accountDetailNodes.size(); i ++) {
                Node accountDetailNode = (Node) accountDetailNodes.get(i);
                ExternalDepositAccountItemDetail edaiDetail =
                    new ExternalDepositAccountItemDetail();
                NodeList accountDetailChildren = accountDetailNode.getChildNodes();
                for (int j = 0; j < accountDetailChildren.getLength(); j++) {
                    Node childNode = accountDetailChildren.item(j);
                    if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                        if (childNode.getNodeName().equals("date")) {
                            edaiDetail.setDate(simpleDateFormat.parse(childNode.getTextContent()));
                        } else if (childNode.getNodeName().equals("holder-name")){
                            edaiDetail.setHolderName(childNode.getTextContent());
                        } else if (childNode.getNodeName().equals("holder-surname")) {
                            edaiDetail.setHolderSurname(childNode.getTextContent());
                        } else if (childNode.getNodeName().equals("value")) {
                            edaiDetail.setValue(Integer.valueOf(childNode.getTextContent()));
                        } else if (childNode.getNodeName().equals("payment-type")) {
                            edaiDetail.setPaymentType(childNode.getTextContent());
                        } else if (childNode.getNodeName().equals("payment-id")) {
                            edaiDetail.setPaymentId(childNode.getTextContent());
                        } else if (childNode.getNodeName().equals("payment-ack")) {
                            edaiDetail.setBankReference(childNode.getTextContent());
                        }
                    }
                }
                edai.addAccountDetail(edaiDetail);
            }
        } catch (ServiceException se) {
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + se.getMessage());
        } catch (RemoteException re) {
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + re.getMessage());
        } catch (SAXException saxe) {
            throw new CvqException("Failed to parse received data : " + saxe.getMessage());
        } catch (IOException ioe) {
            throw new CvqRemoteException("Failed to read received data : " + ioe.getMessage());
        } catch (SOAPException soape) {
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + soape.getMessage());
        } catch (JaxenException jaxe) {
            throw new CvqException("Failed to parse received data : " + jaxe.getMessage());
        } catch (ParseException pe) {
            throw new CvqException("Failed to parse received data : " + pe.getMessage());
        } catch (ParserConfigurationException pce) {
            throw new CvqException("Failed to parse received data : " + pce.getMessage());
        }
    }
    

    public void loadInvoiceDetails(ExternalInvoiceItem eii) throws CvqException {
        logger.debug("loadInvoiceDetails()");

        String SOAP_ACTION_URI = HORANET_CVQ3_NS + "GetInvoiceDetails";
        try {

            service = new Service();
            call = (Call) service.createCall();
            call.setReturnType(org.apache.axis.Constants.XSD_ANY);
            call.setOperationName(new QName(HORANET_CVQ3_NS, "GetInvoiceDetails"));
            call.setProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY, getConfigurationProperty("login"));
            call.setProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY, getConfigurationProperty("password"));
            call.setTargetEndpointAddress(getConfigurationProperty("endPoint3"));
            call.setSOAPActionURI(SOAP_ACTION_URI);

            call.addParameter(new QName(HORANET_CVQ3_NS, "InvoiceId"), 
                    Constants.XSD_STRING, ParameterMode.IN);

            logger.debug("loadInvoiceDetails() Account Id : " + eii.getExternalItemId());

            call.invoke(new Object[] {
                    eii.getExternalItemId()
            });

            if (call.getResponseMessage() == null || call.getResponseMessage().getAttachments() == null
                    || !call.getResponseMessage().getAttachments().hasNext())
                return;
            Iterator attachements = call.getResponseMessage().getAttachments();
            AttachmentPart attachmentPart = (AttachmentPart) attachements.next();
            byte[] data = new byte[attachmentPart.getSize()];
            ((InputStream) attachmentPart.getContent()).read(data);
            logger.debug("loadInvoiceDetails() got : " + new String(data, encoding));
            InputSource inputSource =
                new InputSource((InputStream) attachmentPart.getContent());
            inputSource.setEncoding(encoding);
            Document invoiceDetailsDocument = 
                DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputSource);

            if (eii.getInvoiceDetails() != null)
                eii.getInvoiceDetails().clear();
            
            XPath xpath = new DOMXPath("//invoiceDetails[@invoice-id='" 
                    + eii.getExternalItemId() + "']/invoiceDetail");
            List invoiceDetailNodes = xpath.selectNodes(invoiceDetailsDocument);
            for (int i = 0; i < invoiceDetailNodes.size(); i ++) {
                Node invoiceDetailNode = (Node) invoiceDetailNodes.get(i);
                ExternalInvoiceItemDetail eiiDetail =
                    new ExternalInvoiceItemDetail();
                NodeList invoiceDetailChildren = invoiceDetailNode.getChildNodes();
                for (int j = 0; j < invoiceDetailChildren.getLength(); j++) {
                    Node childNode = invoiceDetailChildren.item(j);
                    if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                        if (childNode.getNodeName().equals("label")) {
                            eiiDetail.setLabel(childNode.getTextContent());
                        } else if (childNode.getNodeName().equals("child-name")){
                            eiiDetail.setSubjectName(childNode.getTextContent());
                        } else if (childNode.getNodeName().equals("child-surname")) {
                            eiiDetail.setSubjectSurname(childNode.getTextContent());
                        } else if (childNode.getNodeName().equals("value")) {
                            eiiDetail.setValue(Integer.valueOf(childNode.getTextContent()));
                        } else if (childNode.getNodeName().equals("quantity")) {
                            eiiDetail.setQuantity(new BigDecimal(childNode.getTextContent()));
                        } else if (childNode.getNodeName().equals("unit-price")) {
                            eiiDetail.setUnitPrice(Integer.valueOf(childNode.getTextContent()));
                        }
                    }
                }
                eii.addInvoiceDetail(eiiDetail);
            }
        } catch (ServiceException se) {
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + se.getMessage());
        } catch (RemoteException re) {
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + re.getMessage());
        } catch (SAXException saxe) {
            throw new CvqException("Failed to parse received data : " + saxe.getMessage());
        } catch (IOException ioe) {
            throw new CvqRemoteException("Failed to read received data : " + ioe.getMessage());
        } catch (SOAPException soape) {
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + soape.getMessage());
        } catch (JaxenException jaxe) {
            throw new CvqException("Failed to parse received data : " + jaxe.getMessage());
        } catch (ParserConfigurationException pce) {
            throw new CvqException("Failed to parse received data : " + pce.getMessage());
        }
    }

    @Override
    public final void checkConfiguration(final ExternalServiceBean externalServiceBean, String localAuthorityName)
        throws CvqConfigurationException {

        if (externalServiceBean.getProperty("endPoint") == null
                || externalServiceBean.getProperty("endPoint2") == null
                || externalServiceBean.getProperty("endPoint3") == null
                || externalServiceBean.getProperty("login") == null
                || externalServiceBean.getProperty("password") == null)
            throw new CvqConfigurationException("Missing one of the required configuration parameters : "
                    + " endPoint, endPoint2, endPoint3, login or password");

        localAuthoritySpecificConfiguration.put(localAuthorityName, externalServiceBean);
    }

    /**
     * Simple hello word method to test connectivity with Horanet remote service
     * @todo could be used at service startup to check configuration parameters
     */
    public final String helloWorld() throws CvqException {
        try {
            String SOAP_ACTION_URI = HORANET_CVQ2_NS + "HelloWorld";
            service = new Service();
            call = (Call) service.createCall();

            call.setReturnType(org.apache.axis.Constants.XSD_STRING);
            call.setOperationName(new QName(HORANET_CVQ_NS, "HelloWorld"));
            call.setProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY, getConfigurationProperty("login"));
            call.setProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY, getConfigurationProperty("password"));
            call.setTargetEndpointAddress(getConfigurationProperty("endPoint"));
            call.setSOAPActionURI(SOAP_ACTION_URI);

            return call.invoke(new Object[] {}).toString();
        } catch (ServiceException se) {
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + se.getMessage());
        } catch (RemoteException re) {
            throw new CvqRemoteException("Failed to connect to Horanet service : " 
                    + re.getMessage());
        }
    }

    /**
     * Only used by Horanet service : do not use for newer external services.
     * 
     *  Newer external services have to use XML schemas instead.
     */
    private String paymentToXml(final Collection<PurchaseItem> purchaseItems, 
            final String cvqReference, final String bankReference, final HomeFolder homeFolder, 
            final Date validationDate) 
        throws IOException {
        
        int total = 0;
        for (PurchaseItem purchaseItem : purchaseItems) {
            total = total + purchaseItem.getAmount().intValue();
        }

        // build XML attachment
        // TODO : use XMLBeans to generate all that shit according to BankTransaction.xsd
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");
        org.jdom.Document document = new org.jdom.Document();
        org.jdom.Element rootNode = new org.jdom.Element("bank-transaction");
        rootNode.setAttribute("version", "1.0");
        org.jdom.Element payment = new org.jdom.Element("payment");
        payment.setAttribute("payment-date", simpleDateFormat.format(validationDate));
        payment.setAttribute("payment-amount", total + "");
        payment.setAttribute("payment-ack", bankReference);
        payment.setAttribute("cvq-ack", cvqReference);
        rootNode.addContent(payment);
        org.jdom.Element family = new org.jdom.Element("family");
        family.setAttribute("id", homeFolder.getId().toString());
        family.setAttribute("zip", SecurityContext.getCurrentSite().getPostalCode());
        rootNode.addContent(family);
        org.jdom.Element accounts = new org.jdom.Element("accounts");
        rootNode.addContent(accounts);
        document.setRootElement(rootNode);
        for (Iterator i = purchaseItems.iterator(); i.hasNext();) {
            ExternalAccountItem eai = (ExternalAccountItem) i.next();
            org.jdom.Element account = new org.jdom.Element("account");
            account.setAttribute("account-id", eai.getExternalItemId());
            // FIXME : should not be needed
//            if (eai.getRequestId() != null)
//                account.setAttribute("request-id", eai.getRequestId().toString());
            if (eai instanceof ExternalDepositAccountItem) {
                ExternalDepositAccountItem edai = (ExternalDepositAccountItem) eai;
                account.setAttribute("account-old-value", edai.getOldValue().intValue() + "");
                account.setAttribute("account-old-value-date", 
                        simpleDateFormat.format(edai.getOldValueDate()));
                account.setAttribute("account-new-value", 
                        String.valueOf(edai.getOldValue().intValue() 
                                + edai.getAmount().intValue()));
                // FIX for HoraNet that wants a quantity and price attribute even
                // when it has no sense
                account.setAttribute("qantity", "0");
                account.setAttribute("price", "0");
            } else if (eai instanceof ExternalTicketingContractItem) {
                ExternalTicketingContractItem etci = (ExternalTicketingContractItem) eai;
                // FIX for HoraNet that wants accounts related values even
                // when it has no sense
//                account.setAttribute("account-old-value", "0");
//                account.setAttribute("account-old-value-date", 
//                        simpleDateFormat.format(new Date()));
//                account.setAttribute("account-new-value", "0");
                account.setAttribute("qantity", etci.getQuantity() + "");
                account.setAttribute("price", etci.getUnitPrice().intValue() + "");
                account.setAttribute("child-id", String.valueOf(etci.getSubjectId()));
            }
            account.setAttribute("amount", String.valueOf(eai.getAmount().intValue()));
            accounts.addContent(account);
        }
        StringWriter stringWriter = new StringWriter();
        XMLOutputter outputter = new XMLOutputter();
        outputter.getFormat().setEncoding(encoding);
        outputter.output(document, stringWriter);
        stringWriter.close();
        logger.debug("paymentsToXml() Preparing to send : " + stringWriter.toString());
        
        return stringWriter.toString();
    }

    public String getConfigurationProperty(String propertyName) {
        String propertySpecificValue = (String)
            localAuthoritySpecificConfiguration.get(SecurityContext.getCurrentSite().getName()).getProperty(propertyName); 
        return propertySpecificValue != null ? propertySpecificValue : globalConfiguration.get(propertyName);
    }

    public void setUserSearchService(IUserSearchService userSearchService) {
        this.userSearchService = userSearchService;
    }

    public void setWs(WSClient ws) {
        this.ws = ws;
    }

    public void setLocalAuthorityRegistry(ILocalAuthorityRegistry localAuthorityRegistry) {
        this.localAuthorityRegistry = localAuthorityRegistry;
    }

    public void setExternalHomeFolderService(IExternalHomeFolderService externalHomeFolderService) {
        this.externalHomeFolderService = externalHomeFolderService;
    }

    public void setRequestTypeService(IRequestTypeService requestTypeService) {
        this.requestTypeService = requestTypeService;
    }

    public void setRequestSearchService(IRequestSearchService requestSearchService) {
        this.requestSearchService = requestSearchService;
    }

    public void setLoggerMailService(ILoggerMailService loggerMailService) {
        this.loggerMailService = loggerMailService;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean supportsConsumptions() {
        return true;
    }

    public boolean handlesTraces() {
        return false;
    }

    public List<String> checkExternalReferential(final XmlObject requestXml) {
        return new ArrayList<String>(0);
    }

    @Override
    public Map<Pair<String, String>, LinkedHashMap<Pair<String, String>, Object>> loadAccountExternalInformations(Long homefolderId) throws CvqException {
      return null;
    }

    @Override
    public Boolean canGetRedirectUrl(Request request) {
        String rqtLabel = request.getRequestType().getLabel();
        ExternalServiceBean esb = SecurityContext.getCurrentConfigurationBean().getExternalServiceConfigurationBean().getBeanForExternalService(getLabel());

        List<String> prop = (List<String>) esb.getProperty("RequestCanGetRedirectUrl");

        return prop != null && !prop.isEmpty() && prop.contains(rqtLabel);
    }

    public Map<String, Object> loadExternalInformations(XmlObject requestXml)
        throws CvqException {
        return Collections.emptyMap();
    }

    /**
     * If the individual has done a MSRR, return the request ID as a string.
     * Return an empty string otherwise.
     *
     * @param individual
     * @return the ID, as a string.
     */
    @SuppressWarnings("deprecation")
    private String getMSRRId(Individual individual) {
        fr.cg95.cvq.business.request.RequestType msrrType;
        try {
            msrrType = requestTypeService.getRequestTypeByLabel("Music School Registration");
        } catch (CvqException ce) {
            return "";
        }
        List<Request> msrrList = requestSearchService.find( "requestType = ? and subjectId = ?"
                                                          , msrrType
                                                          , individual.getId()
                                                          , RequestState.VALIDATED);
        return (msrrList.size() > 0) ? msrrList.get(0).getId().toString() : "";
    }

    public Map<String, Map<String, String>> getSiteProduit(Long requestId, Long userId) {
        SortedMap<String, Map<String, String>> map = new TreeMap<String, Map<String, String>>();
        SortedMap<String, String> mapSite = new TreeMap<String, String>();
        SortedMap<String, String> mapProduct = new TreeMap<String, String>();
        try {
            String postalCode = SecurityContext.getCurrentSite().getPostalCode();
            Individual individual = userSearchService.getById(userId);
            String msrrId = getMSRRId(individual);
            IndividualMapping mapping = externalHomeFolderService.getIndividualMapping(individual,
                    label);
            String externalCapDematId = (mapping != null) ? mapping.getExternalCapDematId() : "";
            SitesProduits sitesproduits;
            try {
                logger.debug("getSites(): call Horanet with:\n" + "- postal code \"" + postalCode
                        + "\"\n" + "- request msrrId  \"" + msrrId + "\"\n"
                        + "- mapping \"" + externalCapDematId + "\"");
                sitesproduits = ws.getSitesProduits(postalCode, msrrId,
                        externalCapDematId, getConfigurationProperty("endPoint3")).get();
            } catch (Exception e) {
                throw new Exception("getSites(): Horanet call failed.", e);
            }
            SitesType sitestype;
            try {
                sitestype = sitesproduits.getSites();
            } catch (NullPointerException npe) {
                throw new Exception("getSites(): WSClient library returned a null object; "
                        + "probably Horanet's fault.");
            }
            List<SiteType> sites = sitestype.getSite();
            for (SiteType site : sites) {
                mapSite.put(site.getIdSite(), site.getLibelleSite());
                ProduitsType produitsType = site.getProduits();
                List<ProduitType> produits = produitsType.getProduit();
                mapProduct = new TreeMap<String, String>();
                for (ProduitType produit : produits) {
                    mapProduct.put(produit.getIdProduit(), produit.getLibelleProduit());
                }
                map.put(site.getIdSite(), mapProduct);
            }
            map.put("sites", mapSite);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
        }
        logger.debug("getSites(): return " + mapSite.size() + " sites et " + mapProduct.size()
                + " products.");
        return map;
    }

    public String getRedirectUrl(Request request) {
        String postalCode = SecurityContext.getCurrentSite().getPostalCode();
        Individual individual = userSearchService.getById(request.getSubjectId());
        String msrrId = getMSRRId(individual);
        IndividualMapping mapping = externalHomeFolderService.getIndividualMapping(individual,
                label);
        String externalCapDematId = (mapping != null) ? mapping.getExternalCapDematId() : "";
        com.zenexity.booker.ws.urlparametres.List list;
        String url = null;
        try {
            String siteId = null;
            String productId = null;
            Method getSiteId;
            Method getProductId;
            getSiteId = request.getSpecificData().getClass().getMethod("getIdSite");
            siteId = (String) getSiteId.invoke(request.getSpecificData());
            getProductId = request.getSpecificData().getClass().getMethod("getIdProduit");
            productId = (String) getProductId.invoke(request.getSpecificData());
            File css = localAuthorityRegistry.getLocalAuthorityResourceFile(Type.CSS, "cssFo",
                    false);
            String cssContent = localAuthorityRegistry.getFileContent(css);
            String cssProperties = cssContent;
            String cssMenuColor = cssProperties.substring(
                    cssProperties.indexOf("cssMenuColor: #") + 15,
                    cssProperties.indexOf("cssMenuColor: #") + 21);
            String cssMenuHoverColor = cssProperties.substring(
                    cssProperties.indexOf("cssMenuHoverColor: #") + 20,
                    cssProperties.indexOf("cssMenuHoverColor: #") + 26);
            String cssBodyColor = cssProperties.substring(
                    cssProperties.indexOf("cssBodyColor: #") + 15,
                    cssProperties.indexOf("cssBodyColor: #") + 21);
            logger.debug("getUrlParameters(): call Horanet with:\n" + "- postal code \""
                    + postalCode + "\"\n" + "- siteId \"" + siteId + "\"\n" + "- productId \""
                    + productId + "\"\n" + "- request id \"" + msrrId + "  " + request.getId().toString() + "\"\n"
                    + "- mapping \"" + externalCapDematId + "- cssMenuColor \"" + cssMenuColor
                    + "\"\n" + "- cssMenuHoverColor \"" + cssMenuHoverColor + "\"\n"
                    + "- cssBodyColor \"" + cssBodyColor + "\"");
            list = ws.getUrlParametres( postalCode, siteId, productId, msrrId,
                    request.getId().toString(), externalCapDematId, externalCapDematId,
                    cssMenuColor, cssMenuHoverColor, cssBodyColor, getConfigurationProperty("endPoint3")).get();
            try {
                url = list.getWebsite().getUrl();
            } catch (NullPointerException npe) {
                throw new Exception("getRedirectUrl(): WSClient library returned a null object; "
                        + "probably Horanet's fault.");
            }
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
        }
        return url;
    }

    private boolean sendRequestOnState(WorkflowGenericEvent wfEvent) throws CvqException {
        String requestTypeLabel = requestExternalService.getRequestPayload(
                wfEvent.getRequest(), this).getRequestTypeLabel();
        ExternalServiceBean esb = SecurityContext.getCurrentConfigurationBean()
                .getExternalServiceConfigurationBean().getBeanForExternalService(getLabel());
        String sendStates = (String) esb.getProperty(requestTypeLabel);
        if (sendStates != null && !sendStates.trim().isEmpty()) {
            List<String> states = Arrays.asList(sendStates.split(","));
            if (states.contains(wfEvent.getClass().getSimpleName())) {
                return true;
            }else{
                return false;
            }
        }else{
            return wfEvent.getClass().getSimpleName().equals("WorkflowCompleteEvent");
        }
    }

    @Override
    public void visit(final WorkflowPendingEvent wfEvent) throws CvqException {

        try {
            if(sendRequestOnState(wfEvent)){
              checkExtReferentialAndSendRequest(wfEvent.getRequest());
            }else{
                return;
            }
        } catch (Exception e) {
            return;
        }

        wfEvent.setWorkflowPostAction(new IWorkflowPostAction() {

          @Override
          public String getExecutor() { return getLabel(); }

          @Override
          public void execute(IRequestWorkflowService requestWorkflowService) {
              try {
                  requestWorkflowService.updateRequestState(wfEvent.getRequest().getId(), RequestState.EXTINPROGRESS, null);
              } catch (CvqException e) {
                  logger.error(e.getMessage());
              }
          }
      });
    }

    @Override
    public void visit(final WorkflowCompleteEvent wfEvent) throws CvqException {
        try {
            if(sendRequestOnState(wfEvent)){
              checkExtReferentialAndSendRequest(wfEvent.getRequest());
            }else{
                return;
            }
        } catch (Exception e) {
            return;
        }

        wfEvent.setWorkflowPostAction(new IWorkflowPostAction() {

          @Override
          public String getExecutor() { return getLabel(); }

          @Override
          public void execute(IRequestWorkflowService requestWorkflowService) {
              try {
                  requestWorkflowService.updateRequestState(wfEvent.getRequest().getId(), RequestState.EXTINPROGRESS, null);
              } catch (CvqException e) {
                  logger.error(e.getMessage());
              }
          }
      });
    }

    /**
     * Just a convenient method to retrieve products available on a specific site.
     *
     * @param sites a list
     * @param id the site to look for
     * @return products on site.
     * @throws Exception
     */
    private List<ProduitType> retrieveProducts(List<SiteType> sites, String id) throws Exception {
        Iterator<SiteType> it = sites.iterator();
        ProduitsType produitstype = null;
        while (it.hasNext()) {
            SiteType site = it.next();
            if (site.getIdSite().equals(id)) {
                produitstype = site.getProduits();
                break;
            }
        }
        if (produitstype == null && !it.hasNext()) {
            throw new Exception("retrieveProducts(): \"" + id + "\" doesn't match a site ID.");
        }
        return produitstype.getProduit();
    }

    /**
     * Just a convenient method to retrieve segments available for a specific product.
     *
     * @param products a list
     * @param id the product to look for
     * @return segments for the product
     * @throws Exception
     */
    private List<SegmentType> retrieveSegments(List<ProduitType> products, String id) throws Exception {
        Iterator<ProduitType> it = products.iterator();
        SegmentsType segmentstype = null;
        while (it.hasNext()) {
            ProduitType product = it.next();
            if (product.getIdProduit().equals(id)) {
                segmentstype = product.getSegments();
                break;
            }
        }
        if (segmentstype == null && !it.hasNext()) {
            throw new Exception("retrieveSegments(): \"" + id + "\" doesn't match a product ID.");
        }
        return segmentstype.getSegment();
    }

    @Override
    public Map<String, String> getSites(Individual individual) {
        Map<String, String> map = new HashMap<String, String>();

        try {
            String postalCode = SecurityContext.getCurrentSite().getPostalCode();
            String msrrId = getMSRRId(individual);
            IndividualMapping mapping = externalHomeFolderService.getIndividualMapping(individual, label);
            String externalCapDematId = (mapping != null) ? mapping.getExternalCapDematId() : "";

            SitesProduits sitesproduits;
            try {
                logger.debug( "getSites(): call Horanet with:\n"
                            + "- postal code \"" + postalCode + "\"\n"
                            + "- MSRR ID \"" + msrrId + "\"\n"
                            + "- mapping \"" + externalCapDematId + "\"");
                sitesproduits = ws.getSitesProduits( postalCode
                                                   , msrrId
                                                   , externalCapDematId
                                                   , getConfigurationProperty("endPoint3")
                                                   )
                                  .get();
            } catch (Exception e) {
                throw new Exception("getSites(): Horanet call failed.", e);
            }
            SitesType sitestype;
            try {
                sitestype = sitesproduits.getSites();
            } catch (NullPointerException npe) {
                throw new Exception( "getSites(): WSClient library returned a null object; "
                                   + "probably Horanet's fault.");
            }

            List<SiteType> sites = sitestype.getSite();
            for (SiteType site : sites) {
                map.put(site.getIdSite(), site.getLibelleSite());
            }
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
        }
        logger.debug("getSites(): return " + map.size() + " sites.");
        return map;
    }

    @Override
    public List<Map<String, String>> getProducts(Individual individual,
                                                 String siteId) {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();

        try {
            String postalCode = SecurityContext.getCurrentSite().getPostalCode();
            String msrrId = getMSRRId(individual);
            IndividualMapping mapping = externalHomeFolderService.getIndividualMapping(individual, label);
            String externalCapDematId = (mapping != null) ? mapping.getExternalCapDematId() : "";

            SitesProduits sitesproduits;
            try {
                logger.debug( "getSites(): call Horanet with:\n"
                            + "- postal code \"" + postalCode + "\"\n"
                            + "- MSRR ID \"" + msrrId + "\"\n"
                            + "- mapping \"" + externalCapDematId + "\"");
                sitesproduits = ws.getSitesProduits( postalCode
                                                   , msrrId
                                                   , externalCapDematId
                                                   , getConfigurationProperty("endPoint3")
                                                   )
                                  .get();
            } catch (Exception e) {
                throw new Exception("getProducts(): Horanet call failed.", e);
            }
            SitesType sitestype;
            try {
                sitestype = sitesproduits.getSites();
            } catch (NullPointerException npe) {
                throw new Exception( "getProducts(): WSClient library returned a null object; "
                                   + "probably Horanet's fault.");
            }

            List<ProduitType> produits = retrieveProducts(sitestype.getSite(), siteId);

            for (ProduitType produit : produits) {
                Map<String, String> map = new HashMap<String, String>();
                map.put("id", produit.getIdProduit());
                map.put("label", produit.getLibelleProduit());
                map.put("type", produit.getTypeProduit());
                list.add(map);
            }
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
        }
        logger.debug("getProducts(): return " + list.size() + " products.");
        return list;
    }

    @Override
    public List<Map<String, String>> getSegments(Individual individual,
                                                 String siteId,
                                                 String productId) {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();

        try {
            String postalCode = SecurityContext.getCurrentSite().getPostalCode();
            String msrrId = getMSRRId(individual);
            IndividualMapping mapping = externalHomeFolderService.getIndividualMapping(individual, label);
            String externalCapDematId = (mapping != null) ? mapping.getExternalCapDematId() : "";

            SitesProduits sitesproduits;
            try {
                logger.debug( "getSegments(): call Horanet with:\n"
                            + "- postal code \"" + postalCode + "\"\n"
                            + "- MSRR ID \"" + msrrId + "\"\n"
                            + "- mapping \"" + externalCapDematId + "\"\n"
                            + "- product ID \"" + productId + "\"");
                sitesproduits = ws.getSitesProduitsAbonnements( postalCode
                                                              , msrrId
                                                              , externalCapDematId
                                                              , productId
                                                              , getConfigurationProperty("endPoint3")
                                                              )
                                  .get();
            } catch (Exception e) {
                throw new Exception("getSegments(): Horanet call failed.", e);
            }
            SitesType sitestype;
            try {
                sitestype = sitesproduits.getSites();
            } catch (NullPointerException npe) {
                throw new Exception( "getSegments(): WSClient library returned a null object; "
                                   + "probably Horanet's fault.");
            }

            List<ProduitType> products = retrieveProducts(sitestype.getSite(), siteId);
            List<SegmentType> segments = retrieveSegments(products, productId);

            for (SegmentType segment : segments) {
                Map<String, String> map = new HashMap<String, String>();
                map.put("id", segment.getIdSegment());
                map.put("label", "Les " + segment.getNomJour().toLowerCase() + "s"
                               + " de " + segment.getHeureDebut()
                               + " à " + segment.getHeureFin());
                list.add(map);
            }
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
        }
        logger.debug("getSegments(): return " + list.size() + " segments.");
        return list;
    }
}
