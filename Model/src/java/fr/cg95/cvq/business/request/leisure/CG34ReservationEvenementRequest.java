
package fr.cg95.cvq.business.request.leisure;

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
import fr.cg95.cvq.xml.request.leisure.*;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 */
public class CG34ReservationEvenementRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = CG34ReservationEvenementRequestData.conditions;

    @AssertValid(message = "")
    private CG34ReservationEvenementRequestData cG34ReservationEvenementRequestData;

    public CG34ReservationEvenementRequest(RequestData requestData, CG34ReservationEvenementRequestData cG34ReservationEvenementRequestData) {
        super(requestData);
        this.cG34ReservationEvenementRequestData = cG34ReservationEvenementRequestData;
    }

    public CG34ReservationEvenementRequest() {
        super();
        this.cG34ReservationEvenementRequestData = new CG34ReservationEvenementRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("reservation", stepState);
        
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
    public CG34ReservationEvenementRequestData getSpecificData() {
        return cG34ReservationEvenementRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(CG34ReservationEvenementRequestData cG34ReservationEvenementRequestData) {
        this.cG34ReservationEvenementRequestData = cG34ReservationEvenementRequestData;
    }

    @Override
    public final String modelToXmlString() {
        CG34ReservationEvenementRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final CG34ReservationEvenementRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        CG34ReservationEvenementRequestDocument cG34ReservationEvenementRequestDoc = CG34ReservationEvenementRequestDocument.Factory.newInstance();
        CG34ReservationEvenementRequestDocument.CG34ReservationEvenementRequest cG34ReservationEvenementRequest = cG34ReservationEvenementRequestDoc.addNewCG34ReservationEvenementRequest();
        super.fillCommonXmlInfo(cG34ReservationEvenementRequest);
        int i = 0;
        
        cG34ReservationEvenementRequest.setDispositionParticuliere(getDispositionParticuliere());
      
        cG34ReservationEvenementRequest.setIdEvenement(getIdEvenement());
      
        cG34ReservationEvenementRequest.setIdPrestation(getIdPrestation());
      
        cG34ReservationEvenementRequest.setLabelReservation(getLabelReservation());
      
        i = 0;
        if (getReservations() != null) {
            fr.cg95.cvq.xml.request.leisure.CrerReservationType[] reservationsTypeTab = new fr.cg95.cvq.xml.request.leisure.CrerReservationType[getReservations().size()];
            for (CrerReservation object : getReservations()) {
              reservationsTypeTab[i++] = object.modelToXml();
            }
            cG34ReservationEvenementRequest.setReservationsArray(reservationsTypeTab);
        }
      
        return cG34ReservationEvenementRequestDoc;
    }

    @Override
    public final CG34ReservationEvenementRequestDocument.CG34ReservationEvenementRequest modelToXmlRequest() {
        return modelToXml().getCG34ReservationEvenementRequest();
    }

    public static CG34ReservationEvenementRequest xmlToModel(CG34ReservationEvenementRequestDocument cG34ReservationEvenementRequestDoc) {
        CG34ReservationEvenementRequestDocument.CG34ReservationEvenementRequest cG34ReservationEvenementRequestXml = cG34ReservationEvenementRequestDoc.getCG34ReservationEvenementRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        CG34ReservationEvenementRequest cG34ReservationEvenementRequest = new CG34ReservationEvenementRequest();
        cG34ReservationEvenementRequest.fillCommonModelInfo(cG34ReservationEvenementRequest, cG34ReservationEvenementRequestXml);
        
        cG34ReservationEvenementRequest.setDispositionParticuliere(cG34ReservationEvenementRequestXml.getDispositionParticuliere());
      
        cG34ReservationEvenementRequest.setIdEvenement(cG34ReservationEvenementRequestXml.getIdEvenement());
      
        cG34ReservationEvenementRequest.setIdPrestation(cG34ReservationEvenementRequestXml.getIdPrestation());
      
        cG34ReservationEvenementRequest.setLabelReservation(cG34ReservationEvenementRequestXml.getLabelReservation());
      
        List<fr.cg95.cvq.business.request.leisure.CrerReservation> reservationsList = new ArrayList<fr.cg95.cvq.business.request.leisure.CrerReservation>(cG34ReservationEvenementRequestXml.sizeOfReservationsArray());
        for (CrerReservationType object : cG34ReservationEvenementRequestXml.getReservationsArray()) {
            reservationsList.add(fr.cg95.cvq.business.request.leisure.CrerReservation.xmlToModel(object));
        }
        cG34ReservationEvenementRequest.setReservations(reservationsList);
      
        return cG34ReservationEvenementRequest;
    }

    @Override
    public CG34ReservationEvenementRequest clone() {
        CG34ReservationEvenementRequest clone = new CG34ReservationEvenementRequest(getRequestData().clone(), cG34ReservationEvenementRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("reservation", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("validation", stepState);
        
        return clone;
    }

  
    public final void setDispositionParticuliere(final String dispositionParticuliere) {
        cG34ReservationEvenementRequestData.setDispositionParticuliere(dispositionParticuliere);
    }

    
    public final String getDispositionParticuliere() {
        return cG34ReservationEvenementRequestData.getDispositionParticuliere();
    }
  
    public final void setIdEvenement(final String idEvenement) {
        cG34ReservationEvenementRequestData.setIdEvenement(idEvenement);
    }

    
    public final String getIdEvenement() {
        return cG34ReservationEvenementRequestData.getIdEvenement();
    }
  
    public final void setIdPrestation(final String idPrestation) {
        cG34ReservationEvenementRequestData.setIdPrestation(idPrestation);
    }

    
    public final String getIdPrestation() {
        return cG34ReservationEvenementRequestData.getIdPrestation();
    }
  
    public final void setLabelReservation(final String labelReservation) {
        cG34ReservationEvenementRequestData.setLabelReservation(labelReservation);
    }

    
    public final String getLabelReservation() {
        return cG34ReservationEvenementRequestData.getLabelReservation();
    }
  
    public final void setReservations(final List<fr.cg95.cvq.business.request.leisure.CrerReservation> reservations) {
        cG34ReservationEvenementRequestData.setReservations(reservations);
    }

    
    public final List<fr.cg95.cvq.business.request.leisure.CrerReservation> getReservations() {
        return cG34ReservationEvenementRequestData.getReservations();
    }
  
}
