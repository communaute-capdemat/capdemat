package fr.cg95.cvq.service.request;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.security.PermissionException;
import fr.cg95.cvq.security.SecurityContext;

public class RequestLockServiceTest extends RequestTestCase {

    @Autowired
    protected IRequestLockService requestLockService;
    
    @Test
    public void testRequestLocks() throws CvqException {
        SecurityContext.setCurrentSite(localAuthorityName, SecurityContext.FRONT_OFFICE_CONTEXT);
        SecurityContext.setCurrentEcitizen(fake.responsibleId);

        Long requestId = request.getId();
        Request request;
        // try to lock it with agent method in FO
        try {
            requestLockService.tryToLock(requestId);
            fail("should have been forbidden");
        } catch (PermissionException e) {
            // OK
        } catch (Exception e) {
            fail("should have thrown a PermissionException");
        }
        // lock it with ecitizen method
        requestLockService.lock(requestId);
        request = requestSearchService.getById(requestId, false);
        assertEquals(requestId, request.getId());
        assertTrue(requestLockService.isLockedByCurrentUser(requestId));
        assertFalse(requestLockService.isLocked(requestId));

        // try to lock it in BO
        SecurityContext.setCurrentSite(localAuthorityName, SecurityContext.BACK_OFFICE_CONTEXT);
        SecurityContext.setCurrentAgent(agentNameWithCategoriesRoles);
        requestLockService.tryToLock(requestId);
        // check it couldn't be locked
        assertEquals(requestId, request.getId());
        assertFalse(requestLockService.isLockedByCurrentUser(requestId));
        assertTrue(requestLockService.isLocked(requestId));

        // go back in FO and release request
        SecurityContext.setCurrentSite(localAuthorityName, SecurityContext.FRONT_OFFICE_CONTEXT);
        SecurityContext.setCurrentEcitizen(fake.responsibleId);
        requestLockService.release(requestId);
        // check it was correctly released
        assertFalse(requestLockService.isLockedByCurrentUser(requestId));
        assertFalse(requestLockService.isLocked(requestId));

        // go lock it in BO
        SecurityContext.setCurrentSite(localAuthorityName, SecurityContext.BACK_OFFICE_CONTEXT);
        SecurityContext.setCurrentAgent(agentNameWithCategoriesRoles);
        // try to lock it with ecitizen method in BO
        try {
            requestLockService.lock(requestId);
            fail("should have been forbidden");
        } catch (PermissionException e) {
            // OK
        } catch (Exception e) {
            fail("should have thrown a PermissionException");
        }
        // lock it with correct method
        requestLockService.tryToLock(requestId);
        request = requestSearchService.getById(requestId, false);
        assertEquals(requestId, request.getId());
        assertTrue(requestLockService.isLockedByCurrentUser(requestId));
        assertFalse(requestLockService.isLocked(requestId));
        // go back in FO and try to lock it
        SecurityContext.setCurrentSite(localAuthorityName, SecurityContext.FRONT_OFFICE_CONTEXT);
        SecurityContext.setCurrentEcitizen(fake.responsibleId);
        try {
            requestLockService.lock(requestId);
            fail("should have been forbidden");
        } catch (CvqException e) {
            // OK
        }  catch (Exception e) {
            fail("should have thrown a CvqException");
        }
        // go back in BO and release it
        SecurityContext.setCurrentSite(localAuthorityName, SecurityContext.BACK_OFFICE_CONTEXT);
        SecurityContext.setCurrentAgent(agentNameWithCategoriesRoles);
        requestLockService.release(requestId);
        assertFalse(requestLockService.isLockedByCurrentUser(requestId));
        assertFalse(requestLockService.isLocked(requestId));
    }
}
