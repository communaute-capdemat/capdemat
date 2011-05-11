
package fr.cg95.cvq.business.request.civil;

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
import fr.cg95.cvq.xml.request.civil.*;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 */
public class CivilStatusCertificateRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = CivilStatusCertificateRequestData.conditions;

    @AssertValid(message = "")
    private CivilStatusCertificateRequestData civilStatusCertificateRequestData;

    public CivilStatusCertificateRequest(RequestData requestData, CivilStatusCertificateRequestData civilStatusCertificateRequestData) {
        super(requestData);
        this.civilStatusCertificateRequestData = civilStatusCertificateRequestData;
    }

    public CivilStatusCertificateRequest() {
        super();
        this.civilStatusCertificateRequestData = new CivilStatusCertificateRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("acte", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("informations", stepState);
        
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
    public CivilStatusCertificateRequestData getSpecificData() {
        return civilStatusCertificateRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(CivilStatusCertificateRequestData civilStatusCertificateRequestData) {
        this.civilStatusCertificateRequestData = civilStatusCertificateRequestData;
    }

    @Override
    public final String modelToXmlString() {
        CivilStatusCertificateRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final CivilStatusCertificateRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        CivilStatusCertificateRequestDocument civilStatusCertificateRequestDoc = CivilStatusCertificateRequestDocument.Factory.newInstance();
        CivilStatusCertificateRequestDocument.CivilStatusCertificateRequest civilStatusCertificateRequest = civilStatusCertificateRequestDoc.addNewCivilStatusCertificateRequest();
        super.fillCommonXmlInfo(civilStatusCertificateRequest);
        int i = 0;
        
        civilStatusCertificateRequest.setCommentaire(getCommentaire());
      
        if (getComplementTypeActe() != null)
            civilStatusCertificateRequest.setComplementTypeActe(getComplementTypeActe().modelToXml());
      
        date = getDateEvenement();
        if (date != null) {
            calendar.setTime(date);
            civilStatusCertificateRequest.setDateEvenement(calendar);
        }
      
        if (getFormatActe() != null)
            civilStatusCertificateRequest.setFormatActe(fr.cg95.cvq.xml.request.civil.CscFormatActeType.Enum.forString(getFormatActe().getLegacyLabel()));
      
        if (getInformationsAdministration() != null)
            civilStatusCertificateRequest.setInformationsAdministration(getInformationsAdministration().modelToXml());
      
        if (getInformationsJuridique() != null)
            civilStatusCertificateRequest.setInformationsJuridique(getInformationsJuridique().modelToXml());
      
        if (getInformationsParticulier() != null)
            civilStatusCertificateRequest.setInformationsParticulier(getInformationsParticulier().modelToXml());
      
        if (getMotif() != null)
            civilStatusCertificateRequest.setMotif(fr.cg95.cvq.xml.request.civil.CscMotifType.Enum.forString(getMotif().getLegacyLabel()));
      
        civilStatusCertificateRequest.setNomTitulaireActe(getNomTitulaireActe());
      
        if (getNombreActes() != null)
            civilStatusCertificateRequest.setNombreActes(new BigInteger(getNombreActes().toString()));
      
        civilStatusCertificateRequest.setPrecisionAutreMotif(getPrecisionAutreMotif());
      
        civilStatusCertificateRequest.setPrenomsTitulaireActe(getPrenomsTitulaireActe());
      
        if (getTypeActe() != null)
            civilStatusCertificateRequest.setTypeActe(fr.cg95.cvq.xml.request.civil.CscTypeActeType.Enum.forString(getTypeActe().getLegacyLabel()));
      
        if (getTypeDemandeur() != null)
            civilStatusCertificateRequest.setTypeDemandeur(fr.cg95.cvq.xml.request.civil.CscTypeDemandeurType.Enum.forString(getTypeDemandeur().getLegacyLabel()));
      
        return civilStatusCertificateRequestDoc;
    }

    @Override
    public final CivilStatusCertificateRequestDocument.CivilStatusCertificateRequest modelToXmlRequest() {
        return modelToXml().getCivilStatusCertificateRequest();
    }

    public static CivilStatusCertificateRequest xmlToModel(CivilStatusCertificateRequestDocument civilStatusCertificateRequestDoc) {
        CivilStatusCertificateRequestDocument.CivilStatusCertificateRequest civilStatusCertificateRequestXml = civilStatusCertificateRequestDoc.getCivilStatusCertificateRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        CivilStatusCertificateRequest civilStatusCertificateRequest = new CivilStatusCertificateRequest();
        civilStatusCertificateRequest.fillCommonModelInfo(civilStatusCertificateRequest, civilStatusCertificateRequestXml);
        
        civilStatusCertificateRequest.setCommentaire(civilStatusCertificateRequestXml.getCommentaire());
      
        if (civilStatusCertificateRequestXml.getComplementTypeActe() != null)
            civilStatusCertificateRequest.setComplementTypeActe(CscrComplementTypeActe.xmlToModel(civilStatusCertificateRequestXml.getComplementTypeActe()));
      
        calendar = civilStatusCertificateRequestXml.getDateEvenement();
        if (calendar != null) {
            civilStatusCertificateRequest.setDateEvenement(calendar.getTime());
        }
      
        if (civilStatusCertificateRequestXml.getFormatActe() != null)
            civilStatusCertificateRequest.setFormatActe(fr.cg95.cvq.business.request.civil.CscFormatActeType.forString(civilStatusCertificateRequestXml.getFormatActe().toString()));
        else
            civilStatusCertificateRequest.setFormatActe(fr.cg95.cvq.business.request.civil.CscFormatActeType.getDefaultCscFormatActeType());
      
        if (civilStatusCertificateRequestXml.getInformationsAdministration() != null)
            civilStatusCertificateRequest.setInformationsAdministration(CscrInformationsAdministration.xmlToModel(civilStatusCertificateRequestXml.getInformationsAdministration()));
      
        if (civilStatusCertificateRequestXml.getInformationsJuridique() != null)
            civilStatusCertificateRequest.setInformationsJuridique(CscrInformationsJuridique.xmlToModel(civilStatusCertificateRequestXml.getInformationsJuridique()));
      
        if (civilStatusCertificateRequestXml.getInformationsParticulier() != null)
            civilStatusCertificateRequest.setInformationsParticulier(CscrInformationsParticulier.xmlToModel(civilStatusCertificateRequestXml.getInformationsParticulier()));
      
        if (civilStatusCertificateRequestXml.getMotif() != null)
            civilStatusCertificateRequest.setMotif(fr.cg95.cvq.business.request.civil.CscMotifType.forString(civilStatusCertificateRequestXml.getMotif().toString()));
        else
            civilStatusCertificateRequest.setMotif(fr.cg95.cvq.business.request.civil.CscMotifType.getDefaultCscMotifType());
      
        civilStatusCertificateRequest.setNomTitulaireActe(civilStatusCertificateRequestXml.getNomTitulaireActe());
      
        civilStatusCertificateRequest.setNombreActes(civilStatusCertificateRequestXml.getNombreActes());
      
        civilStatusCertificateRequest.setPrecisionAutreMotif(civilStatusCertificateRequestXml.getPrecisionAutreMotif());
      
        civilStatusCertificateRequest.setPrenomsTitulaireActe(civilStatusCertificateRequestXml.getPrenomsTitulaireActe());
      
        if (civilStatusCertificateRequestXml.getTypeActe() != null)
            civilStatusCertificateRequest.setTypeActe(fr.cg95.cvq.business.request.civil.CscTypeActeType.forString(civilStatusCertificateRequestXml.getTypeActe().toString()));
        else
            civilStatusCertificateRequest.setTypeActe(fr.cg95.cvq.business.request.civil.CscTypeActeType.getDefaultCscTypeActeType());
      
        if (civilStatusCertificateRequestXml.getTypeDemandeur() != null)
            civilStatusCertificateRequest.setTypeDemandeur(fr.cg95.cvq.business.request.civil.CscTypeDemandeurType.forString(civilStatusCertificateRequestXml.getTypeDemandeur().toString()));
        else
            civilStatusCertificateRequest.setTypeDemandeur(fr.cg95.cvq.business.request.civil.CscTypeDemandeurType.getDefaultCscTypeDemandeurType());
      
        return civilStatusCertificateRequest;
    }

    @Override
    public CivilStatusCertificateRequest clone() {
        CivilStatusCertificateRequest clone = new CivilStatusCertificateRequest(getRequestData().clone(), civilStatusCertificateRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("acte", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("informations", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("validation", stepState);
        
        return clone;
    }

  
    public final void setCommentaire(final String commentaire) {
        civilStatusCertificateRequestData.setCommentaire(commentaire);
    }

    
    public final String getCommentaire() {
        return civilStatusCertificateRequestData.getCommentaire();
    }
  
    public final void setComplementTypeActe(final fr.cg95.cvq.business.request.civil.CscrComplementTypeActe complementTypeActe) {
        civilStatusCertificateRequestData.setComplementTypeActe(complementTypeActe);
    }

    
    public final fr.cg95.cvq.business.request.civil.CscrComplementTypeActe getComplementTypeActe() {
        return civilStatusCertificateRequestData.getComplementTypeActe();
    }
  
    public final void setDateEvenement(final java.util.Date dateEvenement) {
        civilStatusCertificateRequestData.setDateEvenement(dateEvenement);
    }

    
    public final java.util.Date getDateEvenement() {
        return civilStatusCertificateRequestData.getDateEvenement();
    }
  
    public final void setFormatActe(final fr.cg95.cvq.business.request.civil.CscFormatActeType formatActe) {
        civilStatusCertificateRequestData.setFormatActe(formatActe);
    }

    
    public final fr.cg95.cvq.business.request.civil.CscFormatActeType getFormatActe() {
        return civilStatusCertificateRequestData.getFormatActe();
    }
  
    public final void setInformationsAdministration(final fr.cg95.cvq.business.request.civil.CscrInformationsAdministration informationsAdministration) {
        civilStatusCertificateRequestData.setInformationsAdministration(informationsAdministration);
    }

    
    public final fr.cg95.cvq.business.request.civil.CscrInformationsAdministration getInformationsAdministration() {
        return civilStatusCertificateRequestData.getInformationsAdministration();
    }
  
    public final void setInformationsJuridique(final fr.cg95.cvq.business.request.civil.CscrInformationsJuridique informationsJuridique) {
        civilStatusCertificateRequestData.setInformationsJuridique(informationsJuridique);
    }

    
    public final fr.cg95.cvq.business.request.civil.CscrInformationsJuridique getInformationsJuridique() {
        return civilStatusCertificateRequestData.getInformationsJuridique();
    }
  
    public final void setInformationsParticulier(final fr.cg95.cvq.business.request.civil.CscrInformationsParticulier informationsParticulier) {
        civilStatusCertificateRequestData.setInformationsParticulier(informationsParticulier);
    }

    
    public final fr.cg95.cvq.business.request.civil.CscrInformationsParticulier getInformationsParticulier() {
        return civilStatusCertificateRequestData.getInformationsParticulier();
    }
  
    public final void setMotif(final fr.cg95.cvq.business.request.civil.CscMotifType motif) {
        civilStatusCertificateRequestData.setMotif(motif);
    }

    
    public final fr.cg95.cvq.business.request.civil.CscMotifType getMotif() {
        return civilStatusCertificateRequestData.getMotif();
    }
  
    public final void setNomTitulaireActe(final String nomTitulaireActe) {
        civilStatusCertificateRequestData.setNomTitulaireActe(nomTitulaireActe);
    }

    
    public final String getNomTitulaireActe() {
        return civilStatusCertificateRequestData.getNomTitulaireActe();
    }
  
    public final void setNombreActes(final java.math.BigInteger nombreActes) {
        civilStatusCertificateRequestData.setNombreActes(nombreActes);
    }

    
    public final java.math.BigInteger getNombreActes() {
        return civilStatusCertificateRequestData.getNombreActes();
    }
  
    public final void setPrecisionAutreMotif(final String precisionAutreMotif) {
        civilStatusCertificateRequestData.setPrecisionAutreMotif(precisionAutreMotif);
    }

    
    public final String getPrecisionAutreMotif() {
        return civilStatusCertificateRequestData.getPrecisionAutreMotif();
    }
  
    public final void setPrenomsTitulaireActe(final String prenomsTitulaireActe) {
        civilStatusCertificateRequestData.setPrenomsTitulaireActe(prenomsTitulaireActe);
    }

    
    public final String getPrenomsTitulaireActe() {
        return civilStatusCertificateRequestData.getPrenomsTitulaireActe();
    }
  
    public final void setTypeActe(final fr.cg95.cvq.business.request.civil.CscTypeActeType typeActe) {
        civilStatusCertificateRequestData.setTypeActe(typeActe);
    }

    
    public final fr.cg95.cvq.business.request.civil.CscTypeActeType getTypeActe() {
        return civilStatusCertificateRequestData.getTypeActe();
    }
  
    public final void setTypeDemandeur(final fr.cg95.cvq.business.request.civil.CscTypeDemandeurType typeDemandeur) {
        civilStatusCertificateRequestData.setTypeDemandeur(typeDemandeur);
    }

    
    public final fr.cg95.cvq.business.request.civil.CscTypeDemandeurType getTypeDemandeur() {
        return civilStatusCertificateRequestData.getTypeDemandeur();
    }
  
}
