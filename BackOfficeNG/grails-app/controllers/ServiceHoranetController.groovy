import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.RequestState;
import fr.cg95.cvq.business.users.Adult;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.exception.CvqInvalidTransitionException;
import fr.cg95.cvq.exception.CvqSignatureException;
import fr.cg95.cvq.external.ExternalServiceBean;
import fr.cg95.cvq.external.IExternalService;
import fr.cg95.cvq.security.PermissionException;
import fr.cg95.cvq.security.SecurityContext;
import fr.cg95.cvq.service.request.IRequestSearchService;
import fr.cg95.cvq.service.request.IRequestWorkflowService;
import fr.cg95.cvq.service.request.external.IRequestExternalService;
import fr.cg95.cvq.service.users.IUserSearchService;
import fr.cg95.cvq.util.logging.impl.Log

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;

class ServiceHoranetController {

    IExternalService externalService
    IRequestExternalService requestExternalService
    IRequestSearchService requestSearchService
    IRequestWorkflowService requestWorkflowService
    IUserSearchService userSearchService;
    def private static final SECRET = "secret"

    def beforeInterceptor = {
        def authorization = request.getHeader("Authorization")
        if (authorization == null) {
            response.setHeader('WWW-Authenticate', 'Basic')
            render(text: 'dd', status: 401)
            return false
        }
        def credentials = StringUtils.split(new String(Base64.decodeBase64(authorization.substring(6).bytes), "8859_1"), ":")
        if (credentials == null || credentials.length < 2
                || !externalService.authenticate(credentials[0], credentials[1])) {
            response.setHeader('WWW-Authenticate', 'Basic')
            render(text: '', status: 401)
            return false
        }
        SecurityContext.setCurrentContext(SecurityContext.EXTERNAL_SERVICE_CONTEXT)
        SecurityContext.setCurrentExternalService(
            externalService.getExternalServiceByLogin(credentials[0]).getLabel())
    }

    def setState = {
        try{
            validateParams(params)
            String note = message(code: 'request.message.stateChangedBy') + ' ' +
                    SecurityContext.getCurrentExternalService() + '.'
            if (params.message != null)
                note += ' ' + message(code: 'request.message.changeReason') + ' ' + params.message

            requestWorkflowService.updateRequestState(params.long('requestId'),
                    RequestState.forString(params.state), note)
            Request rqt = requestSearchService.getById(params.long('requestId'), true);
            Adult adult = userSearchService.getById(rqt.getRequesterId())

            Log.logger(SecurityContext.getCurrentSite().getName())
            .info("CHANGE STATE : [${params.long('requestId')}] to ${RequestState.forString(params.state)} by ${SecurityContext.getCurrentExternalService()}")

            redirect(controller: 'frontofficeRequest', action: 'exit',
                params : ["id" : rqt.getId(),"label" : rqt.getRequestType().label,
                     "temporary" : "false", "requesterLogin" : adult.getLogin()])

        } catch (CvqInvalidTransitionException cite) {
            log.error("Error 403 : " + message(code: cite.message))
            redirect(controller: 'frontofficeHome', action: 'index')
        } catch (PermissionException pe) {
            log.error("Error 403 : " + message(code: pe.message))
            redirect(controller: 'frontofficeHome', action: 'index')
        } catch (CvqSignatureException cse) {
            log.error("Error 500 : " + message(code: cse.message))
            redirect(controller: 'frontofficeHome', action: 'index')
        } catch (CvqException ce) {
            log.error("Error 500 : " + message(code: ce.message))
            redirect(controller: 'frontofficeHome', action: 'index')
        } catch (Exception e) {
            log.error("Error 500 : " + message(code: e.message))
            redirect(controller: 'frontofficeHome', action: 'index')
        }
    }

    def private validateParams (parameters) {
        StringBuffer parametersForHash = new StringBuffer();
        Map<String,String> parametersSorted = new TreeMap<String, String>();
        for(String key : parameters.keySet()){
            if(!key.equals("signature")){
                parametersSorted.put(key, parameters.get(key));
            }
        }
        ExternalServiceBean esb = SecurityContext.getCurrentConfigurationBean()
                .getExternalServiceConfigurationBean().
                getBeanForExternalService(SecurityContext.getCurrentExternalService())
        String secret = (String) esb.getProperty(SECRET)

        if(secret == null || secret.trim().isEmpty()){
            log.error("Error while retrieve secret value");
            throw new CvqException();
        }
        for(String key : parametersSorted.keySet()){
            parametersForHash.append(parametersSorted.get(key).toString() + "+");
        }
        parametersForHash.append(secret);
        try{
            MessageDigest sha1 = MessageDigest.getInstance("SHA1");
            sha1.update(parametersForHash.toString().getBytes("UTF-8"));
            byte[] hash = sha1.digest();
            String hmac = byteArray2Hex(hash);
            if(!hmac.equals(parameters.get("signature"))){
                log.error("Error signature doesn't match to hash");
                throw new CvqSignatureException("Error signature doesn't match to hash");
            }
        } catch (NoSuchAlgorithmException nsae){
            log.error("Error while creating SHA1 object " +message(code: nsae.message));
            throw new CvqException();
        } catch (UnsupportedEncodingException uee) {
            log.error("Error while encoding parameters in UTF-8" +message(code: uee.message));
            throw new CvqException();
        }
        return true;
    }

    def private byteArray2Hex(byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }

}