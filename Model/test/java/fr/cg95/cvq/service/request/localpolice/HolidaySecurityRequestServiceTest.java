package fr.cg95.cvq.service.request.localpolice;

import fr.cg95.cvq.business.users.*;
import fr.cg95.cvq.business.request.*;
import fr.cg95.cvq.business.authority.*;
import fr.cg95.cvq.business.document.*;
import fr.cg95.cvq.business.request.localpolice.*;
import fr.cg95.cvq.exception.*;
import fr.cg95.cvq.security.SecurityContext;
import fr.cg95.cvq.service.document.IDocumentService;
import fr.cg95.cvq.service.document.IDocumentTypeService;
import fr.cg95.cvq.service.request.localpolice.IHolidaySecurityRequestService;
import fr.cg95.cvq.util.Critere;

import fr.cg95.cvq.testtool.ServiceTestCase;
import fr.cg95.cvq.testtool.TestUtils;
import fr.cg95.cvq.testtool.BusinessObjectsFactory;

import fr.cg95.cvq.xml.request.localpolice.HolidaySecurityRequestDocument;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.ConfigurableApplicationContext;

import junit.framework.Assert;

import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;

/**
 * Generated by Velocity if not present, can be edited safely !
 */
public class HolidaySecurityRequestServiceTest extends ServiceTestCase {

    protected IHolidaySecurityRequestService iHolidaySecurityRequestService;

    protected void onSetUp() throws Exception {
    	super.onSetUp();
        ConfigurableApplicationContext cac = getContext(getConfigLocations());
        iHolidaySecurityRequestService = 
            (IHolidaySecurityRequestService) cac.getBean(StringUtils.uncapitalize("HolidaySecurityRequest") + "Service");
    }

    protected HolidaySecurityRequest fillMeARequest() throws CvqException {

        HolidaySecurityRequest request = new HolidaySecurityRequest();
            if ("OtherContactLastName".length() > 38)
        request.setOtherContactLastName("OtherContactLastName".substring(0, 38));
      else
        request.setOtherContactLastName("OtherContactLastName");
                  if ("OtherContactFirstName".length() > 38)
        request.setOtherContactFirstName("OtherContactFirstName".substring(0, 38));
      else
        request.setOtherContactFirstName("OtherContactFirstName");
                request.setLight(Boolean.valueOf(true));
            request.setAbsenceEndDate(new Date());
              if ("OtherContactPhone".length() > 10)
        request.setOtherContactPhone("OtherContactPhone".substring(0, 10));
      else
        request.setOtherContactPhone("OtherContactPhone");
                request.setRulesAndRegulationsAcceptance(Boolean.valueOf(true));
              if ("AlertPhone".length() > 10)
        request.setAlertPhone("AlertPhone".substring(0, 10));
      else
        request.setAlertPhone("AlertPhone");
                request.setAlarm(Boolean.valueOf(true));
                            Address OtherContactAddress = BusinessObjectsFactory.gimmeAdress("1", "Unit test address", "Paris", "75012");
            request.setOtherContactAddress(OtherContactAddress);
    	                request.setAbsenceStartDate(new Date());
  
        // Means Of Contact
        MeansOfContact meansOfContact = iMeansOfContactService.getMeansOfContactByType(
                    MeansOfContactEnum.EMAIL);
        request.setMeansOfContact(meansOfContact);
        
        HolidaySecurityRequestFeeder.feed(request);
        
        return request;
    }
        	
    protected void completeValidateAndDelete(HolidaySecurityRequest request) 
    	throws CvqException, java.io.IOException {
    	
        // add a document to the request
        ///////////////////////////////

        Document doc = new Document();
        doc.setEcitizenNote("Ma carte d'identitÃ© !");
        doc.setDepositOrigin(DepositOrigin.ECITIZEN);
        doc.setDepositType(DepositType.PC);
        doc.setHomeFolderId(request.getHomeFolderId());
        doc.setIndividualId(request.getRequesterId());
        doc.setDocumentType(iDocumentTypeService.getDocumentTypeById(IDocumentTypeService.IDENTITY_RECEIPT_TYPE));
        Long documentId = iDocumentService.create(doc);
        iHolidaySecurityRequestService.addDocument(request.getId(), documentId);
        Set documentsSet =
            iHolidaySecurityRequestService.getAssociatedDocuments(request.getId());
        Assert.assertEquals(documentsSet.size(), 1);

        // FIXME : test list of pending / in-progress registrations
        Critere testCrit = new Critere();
        testCrit.setAttribut(Request.SEARCH_BY_HOME_FOLDER_ID);
        testCrit.setComparatif(Critere.EQUALS);
        testCrit.setValue(request.getHomeFolderId());
        Set testCritSet = new HashSet();
        testCritSet.add(testCrit);
        Set allRequests = iRequestService.get(testCritSet, null, false);
        Assert.assertNotNull(allRequests);

        // close current session and re-open a new one
        continueWithNewTransaction();
        
        SecurityContext.setCurrentSite(localAuthorityName,
                                        SecurityContext.BACK_OFFICE_CONTEXT);
        SecurityContext.setCurrentAgent(agentNameWithCategoriesRoles);
        iHolidaySecurityRequestService.complete(request.getId());
        iHolidaySecurityRequestService.validate(request.getId());

        // close current session and re-open a new one
        continueWithNewTransaction();
        
        byte[] generatedCertificate = iRequestService.getCertificate(request.getId(),
                                                                     RequestState.PENDING);

        if (generatedCertificate == null)
            fail("No certificate found");
            
        //     Write tele-service xml data file
        File xmlFile = File.createTempFile("tmp" + request.getId(), ".xml");
        FileOutputStream xmlFos = new FileOutputStream(xmlFile);
        xmlFos.write(iRequestService.getById(request.getId()).modelToXmlString().getBytes());

        File file = File.createTempFile("tmp" + request.getId(), ".pdf");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(generatedCertificate);

        // close current session and re-open a new one
        continueWithNewTransaction();
        
        // delete request
        iHolidaySecurityRequestService.delete(request.getId());
    }

    public void testWithHomeFolderPojo()
    		throws CvqException, CvqObjectNotFoundException,
                java.io.FileNotFoundException, java.io.IOException {

         SecurityContext.setCurrentSite(localAuthorityName,
                                        SecurityContext.FRONT_OFFICE_CONTEXT);

         // create a vo card request (to create home folder and associates)
         CreationBean cb = gimmeAnHomeFolder();

         Long voCardRequestId = cb.getRequestId();
         String proposedLogin = cb.getLogin();

         SecurityContext.setCurrentEcitizen(proposedLogin);

         // get the home folder id
         HomeFolder homeFolder = iHomeFolderService.getById(cb.getHomeFolderId());
         Assert.assertNotNull(homeFolder);
         Long homeFolderId = homeFolder.getId();
         Assert.assertNotNull(homeFolderId);

         // fill and create the request
         //////////////////////////////

         HolidaySecurityRequest request = fillMeARequest();
         HolidaySecurityRequestFeeder.setSubject(request, homeFolder);
         
         // FIXME : parameters list handling
         Long requestId =
              iHolidaySecurityRequestService.create(request, homeFolderResponsible.getId());

         HolidaySecurityRequest requestFromDb =
        	 	(HolidaySecurityRequest) iHolidaySecurityRequestService.getById(requestId);
         Assert.assertEquals(requestId, requestFromDb.getId());
         Assert.assertNotNull(requestFromDb.getRequesterId());
         
         completeValidateAndDelete(requestFromDb);

         HomeFolder homeFolderAfterDelete = iHomeFolderService.getById(homeFolderId);
         Assert.assertNotNull(homeFolderAfterDelete);
         Assert.assertNotNull(homeFolderAfterDelete.getHomeFolderResponsible());
         
         SecurityContext.resetCurrentSite();
    }


    public void testWithoutHomeFolder()
        throws CvqException, CvqObjectNotFoundException,
               java.io.FileNotFoundException, java.io.IOException {

	      if (!iHolidaySecurityRequestService.supportUnregisteredCreation())
	         return;

	      startTransaction();
	
        SecurityContext.setCurrentSite(localAuthorityName,
                                        SecurityContext.FRONT_OFFICE_CONTEXT);
        
        HolidaySecurityRequest request = fillMeARequest();

        Address address = BusinessObjectsFactory.gimmeAdress("12", "Rue d'Aligre", "Paris", "75012");
        Adult requester =
            BusinessObjectsFactory.gimmeAdult(TitleType.MISTER, "LASTNAME", "requester", address,
                                              FamilyStatusType.MARRIED);
        requester.setPassword("requester");
        requester.setAdress(address);
        HolidaySecurityRequestFeeder.setSubject(request, null);

        HolidaySecurityRequestDocument requestDoc = 
            (HolidaySecurityRequestDocument) request.modelToXml();
        Long requestId =
             iHolidaySecurityRequestService.create(request, requester.getId());
        
        // close current session and re-open a new one
        continueWithNewTransaction();
        
        // start testing request creation
        /////////////////////////////////

        HolidaySecurityRequest requestFromDb =
            (HolidaySecurityRequest) iHolidaySecurityRequestService.getById(requestId);
        Assert.assertEquals(requestId, requestFromDb.getId());
        Assert.assertNotNull(requestFromDb.getRequesterId());
        
        Long homeFolderId = requestFromDb.getHomeFolderId();
        Long requesterId = requestFromDb.getRequesterId();

        // close current session and re-open a new one
        continueWithNewTransaction();
        
        completeValidateAndDelete(requestFromDb);
        
        // close current session and re-open a new one
        continueWithNewTransaction();
        
        try {
            iHomeFolderService.getById(homeFolderId);
            fail("should not have found home folder");
        } catch (CvqObjectNotFoundException confe) {
            // great, that was expected
        }
        try {
            iAdultService.getById(requesterId);
            fail("should not have found requester");
        } catch (CvqObjectNotFoundException confe) {
            // great, that was expected
        }

        SecurityContext.resetCurrentSite();
        
        commitTransaction();
    }
}
