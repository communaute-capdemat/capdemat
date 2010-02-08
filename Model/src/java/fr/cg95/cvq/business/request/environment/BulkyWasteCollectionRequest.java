
package fr.cg95.cvq.business.request.environment;

import java.io.Serializable;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.xmlbeans.XmlOptions;

import fr.cg95.cvq.business.authority.*;
import fr.cg95.cvq.business.request.*;
import fr.cg95.cvq.business.users.*;
import fr.cg95.cvq.xml.common.RequestType;
import fr.cg95.cvq.xml.common.*;
import fr.cg95.cvq.xml.request.environment.*;

/**
 * Generated class file, do not edit !
 *
 * @hibernate.joined-subclass
 *  table="bulky_waste_collection_request"
 *  lazy="false"
 * @hibernate.joined-subclass-key
 *  column="id"
 */
public class BulkyWasteCollectionRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public BulkyWasteCollectionRequest() {
        super();
      
    }

    @Override
    public final String modelToXmlString() {
        BulkyWasteCollectionRequestDocument object = (BulkyWasteCollectionRequestDocument) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final BulkyWasteCollectionRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        BulkyWasteCollectionRequestDocument bulkyWasteCollectionRequestDoc = BulkyWasteCollectionRequestDocument.Factory.newInstance();
        BulkyWasteCollectionRequestDocument.BulkyWasteCollectionRequest bulkyWasteCollectionRequest = bulkyWasteCollectionRequestDoc.addNewBulkyWasteCollectionRequest();
        super.fillCommonXmlInfo(bulkyWasteCollectionRequest);
        int i = 0;
    
        if (this.collectionAddress != null)
            bulkyWasteCollectionRequest.setCollectionAddress(Address.modelToXml(this.collectionAddress));
      
        i = 0;
        if (bulkyWasteType != null) {
            fr.cg95.cvq.xml.common.LocalReferentialDataType[] bulkyWasteTypeTypeTab = new fr.cg95.cvq.xml.common.LocalReferentialDataType[bulkyWasteType.size()];
            for (LocalReferentialData object : bulkyWasteType) {
              bulkyWasteTypeTypeTab[i++] = LocalReferentialData.modelToXml(object);
            }
            bulkyWasteCollectionRequest.setBulkyWasteTypeArray(bulkyWasteTypeTypeTab);
        }
      
        bulkyWasteCollectionRequest.setOtherWaste(this.otherWaste);
      
        return bulkyWasteCollectionRequestDoc;
    }

    @Override
    public RequestType modelToXmlRequest() {
        BulkyWasteCollectionRequestDocument bulkyWasteCollectionRequestDoc =
            (BulkyWasteCollectionRequestDocument) modelToXml();
        return bulkyWasteCollectionRequestDoc.getBulkyWasteCollectionRequest();
    }

    public static BulkyWasteCollectionRequest xmlToModel(BulkyWasteCollectionRequestDocument bulkyWasteCollectionRequestDoc) {
        BulkyWasteCollectionRequestDocument.BulkyWasteCollectionRequest bulkyWasteCollectionRequestXml = bulkyWasteCollectionRequestDoc.getBulkyWasteCollectionRequest();
        Calendar calendar = Calendar.getInstance();
        List list = new ArrayList();
        BulkyWasteCollectionRequest bulkyWasteCollectionRequest = new BulkyWasteCollectionRequest();
        bulkyWasteCollectionRequest.fillCommonModelInfo(bulkyWasteCollectionRequest, bulkyWasteCollectionRequestXml);
    
        if (bulkyWasteCollectionRequestXml.getCollectionAddress() != null)
            bulkyWasteCollectionRequest.setCollectionAddress(Address.xmlToModel(bulkyWasteCollectionRequestXml.getCollectionAddress()));
      
        List<fr.cg95.cvq.business.request.LocalReferentialData> bulkyWasteTypeList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>(bulkyWasteCollectionRequestXml.sizeOfBulkyWasteTypeArray());
        for (LocalReferentialDataType object : bulkyWasteCollectionRequestXml.getBulkyWasteTypeArray()) {
            bulkyWasteTypeList.add(fr.cg95.cvq.business.request.LocalReferentialData.xmlToModel(object));
        }
        bulkyWasteCollectionRequest.setBulkyWasteType(bulkyWasteTypeList);
      
        bulkyWasteCollectionRequest.setOtherWaste(bulkyWasteCollectionRequestXml.getOtherWaste());
      
        return bulkyWasteCollectionRequest;
    }

  
    private fr.cg95.cvq.business.users.Address collectionAddress;

    public final void setCollectionAddress(final fr.cg95.cvq.business.users.Address collectionAddress) {
        this.collectionAddress = collectionAddress;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="collection_address_id"
        *  class="fr.cg95.cvq.business.users.Address"
      
    */
    public final fr.cg95.cvq.business.users.Address getCollectionAddress() {
        return this.collectionAddress;
    }
  
    private List<fr.cg95.cvq.business.request.LocalReferentialData> bulkyWasteType;

    public final void setBulkyWasteType(final List<fr.cg95.cvq.business.request.LocalReferentialData> bulkyWasteType) {
        this.bulkyWasteType = bulkyWasteType;
    }

    /**
 
        * @hibernate.list
        *  inverse="false"
        *  lazy="false"
        *  cascade="all"
        *  table="bulky_waste_collection_request_bulky_waste_type"
        * @hibernate.key
        *  column="bulky_waste_collection_request_id"
        * @hibernate.list-index
        *  column="bulky_waste_type_index"
        * @hibernate.many-to-many
        *  column="bulky_waste_type_id"
        *  class="fr.cg95.cvq.business.request.LocalReferentialData"
      
    */
    public final List<fr.cg95.cvq.business.request.LocalReferentialData> getBulkyWasteType() {
        return this.bulkyWasteType;
    }
  
    private String otherWaste;

    public final void setOtherWaste(final String otherWaste) {
        this.otherWaste = otherWaste;
    }

    /**
 
        * @hibernate.property
        *  column="other_waste"
        
      
    */
    public final String getOtherWaste() {
        return this.otherWaste;
    }
  
}
