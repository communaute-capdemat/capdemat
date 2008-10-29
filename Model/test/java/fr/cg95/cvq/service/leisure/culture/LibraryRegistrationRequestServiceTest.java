package fr.cg95.cvq.service.leisure.culture;

import fr.cg95.cvq.business.users.*;
import fr.cg95.cvq.business.request.*;
import fr.cg95.cvq.business.authority.*;
import fr.cg95.cvq.business.document.*;
import fr.cg95.cvq.business.social.*;
import fr.cg95.cvq.business.leisure.culture.*;
import fr.cg95.cvq.exception.*;
import fr.cg95.cvq.security.SecurityContext;
import fr.cg95.cvq.service.document.IDocumentService;
import fr.cg95.cvq.service.document.IDocumentTypeService;
import fr.cg95.cvq.service.leisure.culture.ILibraryRegistrationRequestService;
import fr.cg95.cvq.util.Critere;

import fr.cg95.cvq.testtool.ServiceTestCase;
import fr.cg95.cvq.testtool.TestUtils;
import fr.cg95.cvq.testtool.BusinessObjectsFactory;

import fr.cg95.cvq.xml.leisure.culture.LibraryRegistrationRequestDocument;

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
public class LibraryRegistrationRequestServiceTest extends ServiceTestCase {

    protected ILibraryRegistrationRequestService iLibraryRegistrationRequestService;

    protected void onSetUp() throws Exception {
    	super.onSetUp();
        ConfigurableApplicationContext cac = getContext(getConfigLocations());
        iLibraryRegistrationRequestService = 
            (ILibraryRegistrationRequestService) cac.getBean(StringUtils.uncapitalize("LibraryRegistrationRequest") + "Service");
    }

    protected LibraryRegistrationRequest fillMeARequest() throws CvqException {

        LibraryRegistrationRequest request = new LibraryRegistrationRequest();
              request.setRegistrationNumber("RegistrationNumber");
                request.setParentalAuthorization(Boolean.valueOf(true));
                    request.setRulesAndRegulationsAcceptance(Boolean.valueOf(true));
    
        // Means Of Contact
        MeansOfContact meansOfContact = iMeansOfContactService.getMeansOfContactByType(
                    MeansOfContactEnum.EMAIL);
        request.setMeansOfContact(meansOfContact);
        
        LibraryRegistrationRequestFeeder.feed(request);
        
        return request;
    }
        	
    protected void completeValidateAndDelete(LibraryRegistrationRequest request) 
    	throws CvqException, java.io.IOException {
    	
        // add a document to the request
        ///////////////////////////////

        Document doc = new Document();
        doc.setEcitizenNote("Ma carte d'identitÃ© !");
        doc.setDepositOrigin(DepositOrigin.ECITIZEN);
        doc.setDepositType(DepositType.PC);
        doc.setHomeFolderId(request.getHomeFolder().getId());
        doc.setIndividualId(request.getRequester().getId());
        doc.setDocumentType(iDocumentTypeService.getDocumentTypeById(IDocumentTypeService.IDENTITY_RECEIPT_TYPE));
        Long documentId = iDocumentService.create(doc);
        iLibraryRegistrationRequestService.addDocument(request.getId(), documentId);
        Set documentsSet =
            iLibraryRegistrationRequestService.getAssociatedDocuments(request.getId());
        Assert.assertEquals(documentsSet.size(), 1);

        // FIXME : test list of pending / in-progress registrations
        Critere testCrit = new Critere();
        testCrit.setAttribut(Request.SEARCH_BY_REQUESTER_LASTNAME);
        testCrit.setComparatif(Critere.EQUALS);
        testCrit.setValue(request.getRequester().getLastName());
        Set testCritSet = new HashSet();
        testCritSet.add(testCrit);
        Set allRequests = iRequestService.get(testCritSet, null, false);
        Assert.assertNotNull(allRequests);

        // close current session and re-open a new one
        continueWithNewTransaction();
        
        SecurityContext.setCurrentSite(localAuthorityName,
                                        SecurityContext.BACK_OFFICE_CONTEXT);
        SecurityContext.setCurrentAgent(agentNameWithCategoriesRoles);
        iLibraryRegistrationRequestService.complete(request.getId());
        iLibraryRegistrationRequestService.validate(request.getId());

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
        iLibraryRegistrationRequestService.delete(request.getId());
    }


    public void testWithHomeFolderXml() throws CvqException,
			CvqObjectNotFoundException, java.io.FileNotFoundException,
			java.io.IOException {

        startTransaction();
        
	SecurityContext.setCurrentSite(localAuthorityName,
					SecurityContext.FRONT_OFFICE_CONTEXT);

	// create a vo card request (to create home folder and associates)
	CreationBean cb = gimmeAnHomeFolder();

	Long voCardRequestId = cb.getRequestId();
	String proposedLogin = cb.getLogin();

        // close current session and re-open a new one
        continueWithNewTransaction();
        
	SecurityContext.setCurrentEcitizen(proposedLogin);

	// get the home folder id
	HomeFolder homeFolder = iHomeFolderService.getByRequestId(voCardRequestId);
	Assert.assertNotNull(homeFolder);
	Long homeFolderId = homeFolder.getId();
	Assert.assertNotNull(homeFolderId);

	// fill and create the request
	// ////////////////////////////

	LibraryRegistrationRequest request = fillMeARequest();
	request.setRequester(homeFolder.getHomeFolderResponsible());
        LibraryRegistrationRequestFeeder.setSubject(request, homeFolder);

        Set authorizedSubjects = iLibraryRegistrationRequestService.getAuthorizedSubjects(homeFolderId).keySet();

	LibraryRegistrationRequestDocument requestDoc =
		(LibraryRegistrationRequestDocument) request.modelToXml();
	Long requestId = iLibraryRegistrationRequestService.create(requestDoc.getDomNode());

        // close current session and re-open a new one
        continueWithNewTransaction();
        
        Map newAuthorizedSubjectsMap = iLibraryRegistrationRequestService.getAuthorizedSubjects(homeFolderId);
        if (newAuthorizedSubjectsMap == null) 
            Assert.assertEquals(authorizedSubjects.size(), 1);
        else
            Assert.assertEquals(newAuthorizedSubjectsMap.size(), authorizedSubjects.size() - 1);

	LibraryRegistrationRequest requestFromDb = 
		(LibraryRegistrationRequest) iLibraryRegistrationRequestService.getById(requestId);
	Assert.assertEquals(requestId, requestFromDb.getId());
	Adult requester = requestFromDb.getRequester();
	Assert.assertNotNull(requester);
	Assert.assertNotNull(requestFromDb.getMeansOfContact());
    Assert.assertEquals(requestFromDb.getMeansOfContact().getType(), MeansOfContactEnum.EMAIL);

        // close current session and re-open a new one
        continueWithNewTransaction();
        
	completeValidateAndDelete(requestFromDb);

        // close current session and re-open a new one
        continueWithNewTransaction();
        
        HomeFolder homeFolderAfterDelete = iHomeFolderService.getById(homeFolderId);
        Assert.assertNotNull(homeFolderAfterDelete);
        Assert.assertNotNull(homeFolderAfterDelete.getHomeFolderResponsible());
    }

    public void testWithoutHomeFolder()
        throws CvqException, CvqObjectNotFoundException,
               java.io.FileNotFoundException, java.io.IOException {

	if (!iLibraryRegistrationRequestService.supportUnregisteredCreation())
	    return;

	startTransaction();
	
        SecurityContext.setCurrentSite(localAuthorityName,
                                        SecurityContext.FRONT_OFFICE_CONTEXT);
        
        LibraryRegistrationRequest request = fillMeARequest();

        Address address = BusinessObjectsFactory.gimmeAdress("12", "Rue d'Aligre", "Paris", "75012");
        Adult requester =
            BusinessObjectsFactory.gimmeAdult(TitleType.MISTER, "LASTNAME", "requester", address,
                                              FamilyStatusType.MARRIED);
        requester.setPassword("requester");
        request.setRequester(requester);
        requester.setAdress(address);
        LibraryRegistrationRequestFeeder.setSubject(request, null);

        LibraryRegistrationRequestDocument requestDoc = 
            (LibraryRegistrationRequestDocument) request.modelToXml();
        Long requestId =
             iLibraryRegistrationRequestService.create(requestDoc.getDomNode());
        
        // close current session and re-open a new one
        continueWithNewTransaction();
        
        // start testing request creation
        /////////////////////////////////

        LibraryRegistrationRequest requestFromDb =
            (LibraryRegistrationRequest) iLibraryRegistrationRequestService.getById(requestId);
        Assert.assertEquals(requestId, requestFromDb.getId());
        requester = requestFromDb.getRequester();
        Assert.assertNotNull(requester);
        
        Long homeFolderId = requestFromDb.getHomeFolder().getId();
        Long requesterId = requestFromDb.getRequester().getId();

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
