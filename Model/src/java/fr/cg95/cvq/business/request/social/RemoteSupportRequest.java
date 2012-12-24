
package fr.cg95.cvq.business.request.social;

import java.io.Serializable;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.LocalTime;

import net.sf.oval.constraint.AssertValid;
import org.apache.xmlbeans.XmlOptions;
import fr.cg95.cvq.business.authority.*;
import fr.cg95.cvq.business.request.*;
import fr.cg95.cvq.business.request.annotation.*;
import fr.cg95.cvq.business.users.*;
import fr.cg95.cvq.xml.common.*;
import fr.cg95.cvq.xml.request.social.*;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 */
public class RemoteSupportRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = RemoteSupportRequestData.conditions;

    @AssertValid(message = "")
    private RemoteSupportRequestData remoteSupportRequestData;

    public RemoteSupportRequest(RequestData requestData, RemoteSupportRequestData remoteSupportRequestData) {
        super(requestData);
        this.remoteSupportRequestData = remoteSupportRequestData;
    }

    public RemoteSupportRequest() {
        super();
        this.remoteSupportRequestData = new RemoteSupportRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("subject", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("contact", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("document", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("validation", stepState);
        
    }

    /**
     * Reserved for RequestDAO !
     */
    @Override
    public RemoteSupportRequestData getSpecificData() {
        return remoteSupportRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(RemoteSupportRequestData remoteSupportRequestData) {
        this.remoteSupportRequestData = remoteSupportRequestData;
    }

    @Override
    public final String modelToXmlString() {
        RemoteSupportRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final RemoteSupportRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        RemoteSupportRequestDocument remoteSupportRequestDoc = RemoteSupportRequestDocument.Factory.newInstance();
        RemoteSupportRequestDocument.RemoteSupportRequest remoteSupportRequest = remoteSupportRequestDoc.addNewRemoteSupportRequest();
        super.fillCommonXmlInfo(remoteSupportRequest);
        int i = 0;
        
        if (getContactKind() != null)
            remoteSupportRequest.setContactKind(fr.cg95.cvq.xml.request.social.RsrContactKindType.Enum.forString(getContactKind().getLegacyLabel()));
      
        if (getFirstContact() != null)
            remoteSupportRequest.setFirstContact(getFirstContact().modelToXml());
      
        if (getRequestInformation() != null)
            remoteSupportRequest.setRequestInformation(getRequestInformation().modelToXml());
      
        if (getRequestInformationRequestKind() != null)
            remoteSupportRequest.setRequestInformationRequestKind(fr.cg95.cvq.xml.request.social.RsrRequestInformationRequestKindType.Enum.forString(getRequestInformationRequestKind().getLegacyLabel()));
      
        if (getRsrSubject() != null)
            remoteSupportRequest.setRsrSubject(getRsrSubject().modelToXml());
      
        if (getSecondContact() != null)
            remoteSupportRequest.setSecondContact(getSecondContact().modelToXml());
      
        if (getSpouse() != null)
            remoteSupportRequest.setSpouse(getSpouse().modelToXml());
      
        if (getTrustee() != null)
            remoteSupportRequest.setTrustee(getTrustee().modelToXml());
      
        return remoteSupportRequestDoc;
    }

    @Override
    public final RemoteSupportRequestDocument.RemoteSupportRequest modelToXmlRequest() {
        return modelToXml().getRemoteSupportRequest();
    }

    public static RemoteSupportRequest xmlToModel(RemoteSupportRequestDocument remoteSupportRequestDoc) {
        RemoteSupportRequestDocument.RemoteSupportRequest remoteSupportRequestXml = remoteSupportRequestDoc.getRemoteSupportRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        RemoteSupportRequest remoteSupportRequest = new RemoteSupportRequest();
        remoteSupportRequest.fillCommonModelInfo(remoteSupportRequest, remoteSupportRequestXml);
        
        if (remoteSupportRequestXml.getContactKind() != null)
            remoteSupportRequest.setContactKind(fr.cg95.cvq.business.request.social.RsrContactKindType.forString(remoteSupportRequestXml.getContactKind().toString()));
        else
            remoteSupportRequest.setContactKind(fr.cg95.cvq.business.request.social.RsrContactKindType.getDefaultRsrContactKindType());
      
        if (remoteSupportRequestXml.getFirstContact() != null)
            remoteSupportRequest.setFirstContact(RsrContact.xmlToModel(remoteSupportRequestXml.getFirstContact()));
      
        if (remoteSupportRequestXml.getRequestInformation() != null)
            remoteSupportRequest.setRequestInformation(RsrRequestInformation.xmlToModel(remoteSupportRequestXml.getRequestInformation()));
      
        if (remoteSupportRequestXml.getRequestInformationRequestKind() != null)
            remoteSupportRequest.setRequestInformationRequestKind(fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType.forString(remoteSupportRequestXml.getRequestInformationRequestKind().toString()));
        else
            remoteSupportRequest.setRequestInformationRequestKind(fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType.getDefaultRsrRequestInformationRequestKindType());
      
        if (remoteSupportRequestXml.getRsrSubject() != null)
            remoteSupportRequest.setRsrSubject(RsrSubject.xmlToModel(remoteSupportRequestXml.getRsrSubject()));
      
        if (remoteSupportRequestXml.getSecondContact() != null)
            remoteSupportRequest.setSecondContact(RsrSecondContact.xmlToModel(remoteSupportRequestXml.getSecondContact()));
      
        if (remoteSupportRequestXml.getSpouse() != null)
            remoteSupportRequest.setSpouse(RsrSpouse.xmlToModel(remoteSupportRequestXml.getSpouse()));
      
        if (remoteSupportRequestXml.getTrustee() != null)
            remoteSupportRequest.setTrustee(RsrTrustee.xmlToModel(remoteSupportRequestXml.getTrustee()));
      
        return remoteSupportRequest;
    }

    @Override
    public RemoteSupportRequest clone() {
        RemoteSupportRequest clone = new RemoteSupportRequest(getRequestData().clone(), remoteSupportRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("subject", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("contact", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("document", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("validation", stepState);
        
        return clone;
    }

  
    public final void setContactKind(final fr.cg95.cvq.business.request.social.RsrContactKindType contactKind) {
        remoteSupportRequestData.setContactKind(contactKind);
    }

    
    public final fr.cg95.cvq.business.request.social.RsrContactKindType getContactKind() {
        return remoteSupportRequestData.getContactKind();
    }
  
    public final void setFirstContact(final fr.cg95.cvq.business.request.social.RsrContact firstContact) {
        remoteSupportRequestData.setFirstContact(firstContact);
    }

    
    public final fr.cg95.cvq.business.request.social.RsrContact getFirstContact() {
        return remoteSupportRequestData.getFirstContact();
    }
  
    public final void setRequestInformation(final fr.cg95.cvq.business.request.social.RsrRequestInformation requestInformation) {
        remoteSupportRequestData.setRequestInformation(requestInformation);
    }

    
    public final fr.cg95.cvq.business.request.social.RsrRequestInformation getRequestInformation() {
        return remoteSupportRequestData.getRequestInformation();
    }
  
    public final void setRequestInformationRequestKind(final fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType requestInformationRequestKind) {
        remoteSupportRequestData.setRequestInformationRequestKind(requestInformationRequestKind);
    }

    
    public final fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType getRequestInformationRequestKind() {
        return remoteSupportRequestData.getRequestInformationRequestKind();
    }
  
    public final void setRsrSubject(final fr.cg95.cvq.business.request.social.RsrSubject rsrSubject) {
        remoteSupportRequestData.setRsrSubject(rsrSubject);
    }

    
    public final fr.cg95.cvq.business.request.social.RsrSubject getRsrSubject() {
        return remoteSupportRequestData.getRsrSubject();
    }
  
    public final void setSecondContact(final fr.cg95.cvq.business.request.social.RsrSecondContact secondContact) {
        remoteSupportRequestData.setSecondContact(secondContact);
    }

    
    public final fr.cg95.cvq.business.request.social.RsrSecondContact getSecondContact() {
        return remoteSupportRequestData.getSecondContact();
    }
  
    public final void setSpouse(final fr.cg95.cvq.business.request.social.RsrSpouse spouse) {
        remoteSupportRequestData.setSpouse(spouse);
    }

    
    public final fr.cg95.cvq.business.request.social.RsrSpouse getSpouse() {
        return remoteSupportRequestData.getSpouse();
    }
  
    public final void setTrustee(final fr.cg95.cvq.business.request.social.RsrTrustee trustee) {
        remoteSupportRequestData.setTrustee(trustee);
    }

    
    public final fr.cg95.cvq.business.request.social.RsrTrustee getTrustee() {
        return remoteSupportRequestData.getTrustee();
    }
  
}
