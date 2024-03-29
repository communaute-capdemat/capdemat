

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

import net.sf.oval.constraint.*;
import fr.cg95.cvq.business.authority.*;
import fr.cg95.cvq.business.request.*;
import fr.cg95.cvq.business.users.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="c_g34_reservation_evenement_request")
public class CG34ReservationEvenementRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public CG34ReservationEvenementRequestData() {
      
    }

    @Override
    public CG34ReservationEvenementRequestData clone() {
        CG34ReservationEvenementRequestData result = new CG34ReservationEvenementRequestData();
        
          
            
        result.setDispositionParticuliere(dispositionParticuliere);
      
          
        
          
            
        result.setIdEvenement(idEvenement);
      
          
        
          
            
        result.setIdPrestation(idPrestation);
      
          
        
          
            
        result.setLabelReservation(labelReservation);
      
          
        
          
            
        List<fr.cg95.cvq.business.request.leisure.CrerReservation> reservationsList = new ArrayList<fr.cg95.cvq.business.request.leisure.CrerReservation>();
        for (CrerReservation object : reservations) {
            reservationsList.add(object.clone());
        }
        result.setReservations(reservationsList);
      
          
        
        return result;
    }

    public final void setId(final Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public final Long getId() {
        return this.id;
    }

  
    
    private String dispositionParticuliere;

    public void setDispositionParticuliere(final String dispositionParticuliere) {
        this.dispositionParticuliere = dispositionParticuliere;
    }

 
    @Column(name="disposition_particuliere"  )
      
    public String getDispositionParticuliere() {
        return this.dispositionParticuliere;
    }
  
    
      @NotNull(
        
        
        profiles = {"reservation"},
        message = "idEvenement"
      )
    
      @NotBlank(
        
        
        profiles = {"reservation"},
        message = "idEvenement"
      )
    
    private String idEvenement;

    public void setIdEvenement(final String idEvenement) {
        this.idEvenement = idEvenement;
    }

 
    @Column(name="id_evenement"  )
      
    public String getIdEvenement() {
        return this.idEvenement;
    }
  
    
      @NotNull(
        
        
        profiles = {"reservation"},
        message = "idPrestation"
      )
    
      @NotBlank(
        
        
        profiles = {"reservation"},
        message = "idPrestation"
      )
    
    private String idPrestation;

    public void setIdPrestation(final String idPrestation) {
        this.idPrestation = idPrestation;
    }

 
    @Column(name="id_prestation"  )
      
    public String getIdPrestation() {
        return this.idPrestation;
    }
  
    
      @NotNull(
        
        
        profiles = {"reservation"},
        message = "labelReservation"
      )
    
      @NotBlank(
        
        
        profiles = {"reservation"},
        message = "labelReservation"
      )
    
    private String labelReservation;

    public void setLabelReservation(final String labelReservation) {
        this.labelReservation = labelReservation;
    }

 
    @Column(name="label_reservation"  )
      
    public String getLabelReservation() {
        return this.labelReservation;
    }
  
    
      @AssertValid(
        
        
        profiles = {"reservation"},
        message = "reservations"
      )
    
      @MinSize(
        
          value = 1,
        
        
        profiles = {"reservation"},
        message = "reservations"
      )
    
    private List<fr.cg95.cvq.business.request.leisure.CrerReservation> reservations;

    public void setReservations(final List<fr.cg95.cvq.business.request.leisure.CrerReservation> reservations) {
        this.reservations = reservations;
    }

 
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @OrderColumn(name="reservations_index")
    @JoinColumn(name="c_g34_reservation_evenement_request_id")
      
    public List<fr.cg95.cvq.business.request.leisure.CrerReservation> getReservations() {
        return this.reservations;
    }
  
}
