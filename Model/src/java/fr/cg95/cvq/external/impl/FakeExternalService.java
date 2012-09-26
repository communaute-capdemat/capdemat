package fr.cg95.cvq.external.impl;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.jaxen.JaxenException;
import org.jaxen.XPath;
import org.jaxen.dom.DOMXPath;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import fr.capwebct.modules.payment.schema.fam.FamilyAccountsResponseDocument;
import fr.cg95.cvq.business.payment.ExternalAccountItem;
import fr.cg95.cvq.business.payment.ExternalDepositAccountItem;
import fr.cg95.cvq.business.payment.ExternalDepositAccountItemDetail;
import fr.cg95.cvq.business.payment.ExternalInvoiceItem;
import fr.cg95.cvq.business.payment.ExternalInvoiceItemDetail;
import fr.cg95.cvq.business.payment.ExternalTicketingContractItem;
import fr.cg95.cvq.business.payment.PurchaseItem;
import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.users.Adult;
import fr.cg95.cvq.business.users.Child;
import fr.cg95.cvq.business.users.Individual;
import fr.cg95.cvq.exception.CvqConfigurationException;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.exception.CvqRemoteException;
import fr.cg95.cvq.external.ExternalServiceBean;
import fr.cg95.cvq.external.ExternalServiceUtils;
import fr.cg95.cvq.external.IExternalProviderService;
import fr.cg95.cvq.security.SecurityContext;
import fr.cg95.cvq.service.payment.IPaymentService;
import fr.cg95.cvq.service.request.leisure.external.IActivityRegistrationProviderService;
import fr.cg95.cvq.service.request.school.external.IScholarBusinessProviderService;
import fr.cg95.cvq.util.Pair;

/**
 * A fake implementation of the {@link IExternalProviderService external provider service interface}
 * that is meant to be used for demonstration purposes only.
 *
 * TODO : this service has to be migrated to use the XML schemas APIs 
 * instead of custom XML mapping.
 * 
 * @author bor@zenexity.fr
 */
public class FakeExternalService extends ExternalProviderServiceAdapter implements IScholarBusinessProviderService, IActivityRegistrationProviderService {

    private static Logger logger = Logger.getLogger(FakeExternalService.class);

    private IPaymentService paymentService;
    
    private String label;
    private String testDataDirectory;
    private String xmlDirectory;
    private String consumptionsFile;
    private String accountsFile;
    private String depositAccountDetailsFile;
    private String invoiceDetailsFile;

    public final String sendRequest(XmlObject requestXml) throws CvqException {
        return UUID.randomUUID().toString();
    }

    public final void creditHomeFolderAccounts(final Collection<PurchaseItem> purchaseItems, 
            final String cvqReference, final String bankReference, final Long homeFolderId, 
            String externalHomeFolderId, String externalId, final Date validationDate)
        throws CvqException {

        logger.debug("creditHomeFolderAccounts() Gonna credit home folder " + homeFolderId);
        logger.debug("creditHomeFolderAccounts() for transaction " + cvqReference + " / "
                + bankReference);
    }

    public final Map<Date, String> getConsumptions(final Long key, 
            final Date dateFrom, final Date dateTo) throws CvqException {

        logger.debug("getConsumptionsByRequest() request " + key);
        logger.debug("getConsumptionsByRequest() from " + dateFrom);
        logger.debug("getConsumptionsByRequest() to " + dateTo);

        try {
            Map<Date, String> results = new LinkedHashMap<Date, String>();
            String pathToFile = testDataDirectory + xmlDirectory + "/" + consumptionsFile;
            File file = new File(pathToFile);
            Document consumptionXMLDocument = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder().parse(file);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
            XPath xpath = new DOMXPath("//events/event");
            List eventNodes = xpath.selectNodes(consumptionXMLDocument);
            for (int i = 0; i < eventNodes.size(); i++) {
                Node event = (Node) eventNodes.get(i);
                NamedNodeMap attributes = event.getAttributes();
                Node dateNode = attributes.getNamedItem("event-date");
                Node labelNode = attributes.getNamedItem("event-label3");
                Date eventDate = simpleDateFormat.parse(dateNode.getNodeValue());
                logger.debug("adding label " + labelNode.getNodeValue() 
                        + " with date " + eventDate);
                results.put(eventDate, labelNode.getNodeValue());
            }

            return results;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final Map<String, List<ExternalAccountItem> > getAccountsByHomeFolder(final Long homeFolderId, 
            String externalHomeFolderId, String externalId) throws CvqException {
        
        String pathToFile = testDataDirectory + xmlDirectory + "/" + accountsFile;
        File file = new File(pathToFile);
        logger.debug("getAccountsByHomeFolder() gonna parse file " + file);
        try {
            FamilyAccountsResponseDocument familyDocument = FamilyAccountsResponseDocument.Factory.parse(file);
            Map<String, List<ExternalAccountItem> > externalAccounts = 
                ExternalServiceUtils.parseFamilyDocument(familyDocument, getLabel());
            
            String supportedBroker = paymentService.getAllBrokers().keySet().iterator().next();
            for (ExternalAccountItem eai :
                externalAccounts.get(IPaymentService.EXTERNAL_TICKETING_ACCOUNTS)) {
                eai.setSupportedBroker(supportedBroker);
                // manually insert subject id as the currently logged in user
                ExternalTicketingContractItem etci = (ExternalTicketingContractItem) eai;
                etci.setSubjectId(SecurityContext.getCurrentUserId());
            }
            for (ExternalAccountItem eai :
                externalAccounts.get(IPaymentService.EXTERNAL_DEPOSIT_ACCOUNTS)) {
                eai.setSupportedBroker(supportedBroker);
            }
            for (ExternalAccountItem eai :
                externalAccounts.get(IPaymentService.EXTERNAL_INVOICES)) {
                eai.setSupportedBroker(supportedBroker);
            }
            return externalAccounts;
        } catch (XmlException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void loadDepositAccountDetails(ExternalDepositAccountItem edai) throws CvqException {
        logger.debug("loadDepositAccountDetails()");

        try {

            String pathToFile = testDataDirectory + xmlDirectory + "/" + depositAccountDetailsFile;
            File file = new File(pathToFile);
            logger.debug("loadDepositAccountDetails() got file " + file);
            Document depositAccountDetailsDocument = 
                DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");
            XPath xpath = new DOMXPath("//accountDetails[@account-id='" 
                    + edai.getExternalItemId() + "']/accountDetail");
            List accountDetailNodes = xpath.selectNodes(depositAccountDetailsDocument);
            for (int i = 0; i < accountDetailNodes.size(); i ++) {
                Node accountDetailNode = (Node) accountDetailNodes.get(i);
                ExternalDepositAccountItemDetail edaiDetail =
                    new ExternalDepositAccountItemDetail();
                edaiDetail.setExternalDepositAccountItem(edai);
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
                        }
                    }
                }
                edai.addAccountDetail(edaiDetail);
            }
        } catch (RemoteException re) {
            throw new CvqRemoteException("Failed to connect to Horanet Service" + re.getMessage());
        } catch (SAXException saxe) {
            throw new CvqRemoteException("Failed to parse The schoolCanteen Registration to send to Horanet" + saxe.getMessage());
        } catch (IOException ioe) {
            throw new CvqRemoteException("Failed to parse The schoolCanteen Registration to send to Horanet" + ioe.getMessage());
        } catch (JaxenException jaxe) {
            throw new CvqRemoteException("Failed to parse consumption XML file" + jaxe.getMessage());
        } catch (ParseException pe) {
            throw new CvqRemoteException("Failed to parse Dates" + pe.getMessage());
        } catch (ParserConfigurationException pce) {
            throw new CvqException("Erreur de configuration XML dans l'envoi de doc Horanet: " + pce.getMessage());
        }
    }


    public void loadInvoiceDetails(ExternalInvoiceItem eii) throws CvqException {
        logger.debug("loadInvoiceDetails()");

        try {

            String pathToFile = testDataDirectory + xmlDirectory + "/" + invoiceDetailsFile;
            File file = new File(pathToFile);
            logger.debug("loadInvoiceDetails() got file " + file);
            Document invoiceDetailsDocument = 
                DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

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
        } catch (RemoteException re) {
            throw new CvqRemoteException("Failed to connect to external service" 
                    + re.getMessage());
        } catch (SAXException saxe) {
            throw new CvqRemoteException("Failed to parse data from external service" 
                    + saxe.getMessage());
        } catch (IOException ioe) {
            throw new CvqRemoteException("Failed to parse data from external service" 
                    + ioe.getMessage());
        } catch (JaxenException jaxe) {
            throw new CvqRemoteException("Failed to parse data from external service" 
                    + jaxe.getMessage());
        } catch (ParserConfigurationException pce) {
            throw new CvqException("Erreur de configuration XML dans l'envoi de doc Horanet: " + pce.getMessage());
        }
    }

    public final void checkConfiguration(final ExternalServiceBean externalServiceBean, String localAuthorityName)
            throws CvqConfigurationException {
    }

    public final String helloWorld() throws CvqException {
        return "Hello World";
    }

    public final void setXmlDirectory(final String xmlDirectory) {
        this.xmlDirectory = xmlDirectory;
    }

    public final void setConsumptionsFile(final String consumptionsFile) {
        this.consumptionsFile = consumptionsFile;
    }

    public void setAccountsFile(final String accountsFile) {
        this.accountsFile = accountsFile;
    }

    public void setTestDataDirectory(String testDataDirectory) {
        this.testDataDirectory = testDataDirectory;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public final void setDepositAccountDetailsFile(String depositAccountDetailsFile) {
        this.depositAccountDetailsFile = depositAccountDetailsFile;
    }

    public final void setInvoiceDetailsFile(String invoiceDetailsFile) {
        this.invoiceDetailsFile = invoiceDetailsFile;
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

    public Map<String, Object> loadExternalInformations(XmlObject requestXml)
        throws CvqException {
        return Collections.emptyMap();
    }

    public void setPaymentService(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public Map<String, String> getSites(Individual individual) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("ID0", "Espace Nautique Jean Vauchère — Colomiers");
        map.put("ID1", "Cinéma — Colomiers");
        return map;
    }

    @Override
    public Map<String, Map<String, String>> getSchools(Child child) {
        Map<String, Map<String, String>> result = new HashMap<String, Map<String,String>>();
        
        Map<String, String> schoolSectors = new HashMap<String, String>();
        schoolSectors.put("0001", "École élémentaire Jean Moulin");
        schoolSectors.put("0002", "École élémentaire Lamartine");
        
        Map<String, String> schoolDerogs = new HashMap<String, String>();
        schoolDerogs.put("0003", "École élémentaire Condorcet");
        schoolDerogs.put("0004", "École élémentaire Jean Mermoz");
        schoolDerogs.put("0005", "École élémentaire Jules Ferry");
        schoolDerogs.put("0006", "École élémentaire Simon Bolivar");
        schoolDerogs.put("0007", "École élémentaire Diderot");
        
        result.put("schoolSectors", schoolSectors);
        result.put("schoolDerogs", schoolDerogs);

        return result;
    }

    @Override
    public Map<String, String> getHolidayCamps(Request request, Child child) {
        Map<String, String> result = new HashMap<String, String>();
        
        result.put("0001", "Centre de séjours Cévennes");
        result.put("0002", "Centre de séjours Auvergne");
        result.put("0003", "Centre de séjours Savoie");
        
        return result;
    }

    @Override
    public Map<String, String> getLeisureCenters(Request request, Child child) {
        Map<String, String> result = new HashMap<String, String>();
        
        result.put("0001", "Centre de loisirs Le Relais des Enfants");
        result.put("0002", "Centre de loisirs Les Cévennes ");
        result.put("0003", "Centre de loisirs Les Lutins");
        
        return result;
    }

    @Override
    public Map<String, String> getTransportLines(Request request, Child child) {
        Map<String, String> result = new HashMap<String, String>();
        
        result.put("0001", "Baillargues");
        result.put("0004", "Gignac");
        result.put("0002", "Perols");
        result.put("0003", "Villeneuve les Maguelone");
        
        return result;
    }

    @Override
    public Map<String, String> getTransportStops(Request request, Child child, String lineId) {
        Map<String, String> result = new HashMap<String, String>();
        
        result.put("0001", "Antigone");
        result.put("0004", "Port Marianne");
        result.put("0002", "Beaux Arts");
        result.put("0003", "Hopitaux Facultés");

        return result;
    }

    @Override
    public Map<String, String> getLeisureCenterTransportLines(Request request, Child child) {
        Map<String, String> result = new HashMap<String, String>();

        result.put("0001", "Romainville");
        result.put("0004", "Magonty");

        return result;
    }

    @Override
    public Map<String, String> getLeisureCenterTransportStops(Request request, Child child, String lineId) {
        Map<String, String> result = new HashMap<String, String>();

        result.put("0001", "Maison de la nature");
        result.put("0004", "Palavas");
        result.put("0002", "Camargues");

        return result;
    }

    @Override
    public Map<Pair<String, String>, LinkedHashMap<Pair<String, String>, Object>> loadAccountExternalInformations(Long homefolderId) throws CvqException {
      Map<Pair<String, String>, LinkedHashMap<Pair<String, String>, Object>> infos = new HashMap<Pair<String, String>, LinkedHashMap<Pair<String, String>, Object>>();

      LinkedHashMap<Pair<String, String>, String> dataList = new LinkedHashMap<Pair<String, String>, String>();
      dataList.put(new Pair<String, String>("0id1", "Montant subvention"), "125.00€");
      dataList.put(new Pair<String, String>("0id2", "Valide jusqu'au"), "14 Mai 2014");

      LinkedHashMap<Pair<String, String>, Object> socialData = new LinkedHashMap<Pair<String, String>, Object>();
      socialData.put(new Pair<String, String>("1id1", "Allocations familiales"), "Votre dossier a été mis à jour le <strong>07 Décembre 2013</strong> avec de nouveaux documents.");
      socialData.put(new Pair<String, String>("1id2", "Demande MDPH pour Emilie Durand (#6416)"), dataList);

      infos.put(new Pair<String, String>("social", "Social"), socialData);


      LinkedHashMap<Pair<String, String>, Object> envData = new LinkedHashMap<Pair<String, String>, Object>();
      envData.put(new Pair<String, String>("2id1", "Consomation d'eau de Novembre 2013"), "<img src='http://www.consospy.fr/image/statistiques_par_mois_date_anniverssaire_consommation_eau2.jpg' width=800/>");
      envData.put(new Pair<String, String>("2id2", "Consomation d'eau de Octobre 2013"), "<img src='http://www.consospy.fr/image/statistiques_par_mois_date_anniverssaire_consommation_eau2.jpg' width=800/>");
      envData.put(new Pair<String, String>("2id3", "Consomation d'eau de Septembre 2013"), "<img src='http://www.consospy.fr/image/statistiques_par_mois_date_anniverssaire_consommation_eau2.jpg' width=800/>");
      String htmlData = "<style type='text/css'>"+
                "table.gridtable {"+
                "font-family: verdana,arial,sans-serif;"+
                "font-size:11px;"+
                "color:#333333;"+
                "border-width: 1px;"+
                "border-color: #666666;"+
                "border-collapse: collapse;"+
                "}"+
                "table.gridtable th {"+
                "border-width: 1px;"+
                "padding: 8px;"+
                "border-style: solid;"+
                "border-color: #666666;"+
                "background-color: #dedede;"+
                "}"+
                "table.gridtable td {"+
                "border-width: 1px;"+
                "padding: 8px;"+
                "border-style: solid;"+
                "border-color: #666666;"+
                "background-color: #ffffff;"+
                "}"+
                "</style>"+
                "<table class='gridtable'>"+
                "<tr><th>Mois</th><th>Consomation</th></tr>"+
                "<tr><td>Janvier</td><td>245,54</td></tr>"+
                "<tr><td>Février</td><td>179,20</td></tr>"+
                "<tr><td>Mars</td><td>223,80</td></tr>"+
                "<tr><td>Avril</td><td>188,78</td></tr>"+
                "<tr><td>Mai</td><td>245,12</td></tr>"+
                "<tr><td>Juillet</td><td>201,77</td></tr>"+
                "<tr><td>Août</td><td>213,39</td></tr>"+
                "</table>";


      if(htmlData.startsWith("<![CDATA["))
        htmlData = htmlData.substring(9, htmlData.length()-3);
      envData.put(new Pair<String, String>("2id4", "Résumé de la consomation de Janvier à Juin 2013"), htmlData);
      infos.put(new Pair<String, String>("environment", "Environnement"), envData);

      return infos;
    }

    @Override
    public String getRedirectUrl (Request request) {
        return "http://FakeRedirect";
    }

    @Override
    public Boolean canGetRedirectUrl(Request request) {
        String rqtLabel = request.getRequestType().getLabel();
        ExternalServiceBean esb = SecurityContext.getCurrentConfigurationBean().getExternalServiceConfigurationBean().getBeanForExternalService(getLabel());

        List<String> prop = (List<String>) esb.getProperty("RequestCanGetRedirectUrl");

        return prop != null && !prop.isEmpty() && prop.contains(rqtLabel);
    }

    @Override
    public Map<String, Map<String, String>> getSiteProduit(Long requestId, Long userId) {
        Map <String, Map<String, String>> m = new HashMap<String,Map<String, String>>();
        Map<String, String> sites= new HashMap<String, String>();
        Map<String, String> act1= new HashMap<String, String>();
        Map<String, String> act2= new HashMap<String, String>();
        sites.put("idSite1", "labelSite1");
        sites.put("idSite2", "labelSite2");
        m.put("sites",sites);
        act1.put("idact1", "labelact1");
        act1.put("idact2", "labelact2");
        m.put("idSite1", act1);
        act2.put("idact3", "labelact3");
        act2.put("idact4", "labelact4");
        m.put("idSite2", act2);
        return m;
    }

    @Override
    public List<Map<String, String>> getSegments(Individual individual,
            String siteId,
            String productId) {

        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        if (siteId.equals("ID0")) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("id", "ID0");
            map.put("label", "Les lundis de 13h30 à 14h30");
            list.add(map);
            map = new HashMap<String, String>();
            map.put("id", "ID1");
            map.put("label", "Les samedis de 15h à 16h");
            list.add(map);
            map = new HashMap<String, String>();
            map.put("id", "ID2");
            map.put("label", "Les samedis de 16h45 à 17h45");
            list.add(map);
        }
        return list;
    }

    @Override
    public List<Map<String, String>> getProducts(Individual individual,
                                                 String siteId) {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        if (siteId.equals("ID0")) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("id", "ID0");
            map.put("label", "Aquagym");
            map.put("type", "1");
            list.add(map);
            map = new HashMap<String, String>();
            map.put("id", "ID1");
            map.put("label", "Aquabiking");
            map.put("type", "0");
            list.add(map);
            if (individual instanceof Adult) {
                map = new HashMap<String, String>();
                map.put("id", "ID2");
                map.put("label", "Natation synchronisée");
                map.put("type", "0");
                list.add(map);
            }
        }
        return list;
    }

}
