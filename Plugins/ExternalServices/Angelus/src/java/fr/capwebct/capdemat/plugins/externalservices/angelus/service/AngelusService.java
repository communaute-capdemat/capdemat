package fr.capwebct.capdemat.plugins.externalservices.angelus.service;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.xmlbeans.XmlObject;

import fr.cg95.cvq.business.payment.ExternalAccountItem;
import fr.cg95.cvq.business.payment.ExternalDepositAccountItem;
import fr.cg95.cvq.business.payment.ExternalInvoiceItem;
import fr.cg95.cvq.business.payment.PurchaseItem;
import fr.cg95.cvq.exception.CvqConfigurationException;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.external.ExternalServiceBean;
import fr.cg95.cvq.external.impl.ExternalProviderServiceAdapter;

import fr.cg95.cvq.util.Pair;

public class AngelusService extends ExternalProviderServiceAdapter {

    @Override
    public String sendRequest(XmlObject requestXml) throws CvqException {
        return "";
    }

    @Override
    public Map<Date, String> getConsumptions(Long key, Date dateFrom, Date dateTo) throws CvqException {
        return Collections.emptyMap();
    }

    @Override
    public Map<String, List<ExternalAccountItem>> getAccountsByHomeFolder(Long homeFolderId, String externalHomeFolderId, String externalId) throws CvqException {
        return Collections.emptyMap();
    }

    @Override
    public void loadDepositAccountDetails(ExternalDepositAccountItem edai) throws CvqException {

    }

    @Override
    public void loadInvoiceDetails(ExternalInvoiceItem eii) throws CvqException {

    }

    @Override
    public void creditHomeFolderAccounts(Collection<PurchaseItem> purchaseItems, String cvqReference, String bankReference, Long homeFolderId, String externalHomeFolderId, String externalId, Date validationDate) throws CvqException {

    }

    @Override
    public void checkConfiguration(ExternalServiceBean externalServiceBean, String localAuthorityName) throws CvqConfigurationException {
        // TODO Auto-generated method stub
    }

    @Override
    public String helloWorld() throws CvqException {
        return "";
    }

    private String label;

    @Override
     public String getLabel() {
         return label;
     }

     public void setLabel(String label) {
         this.label = label;
     }

    @Override
    public boolean supportsConsumptions() {
        return false;
    }

    @Override
    public boolean handlesTraces() {
        return false;
    }

    @Override
    public List<String> checkExternalReferential(XmlObject requestXml) {
        return Collections.emptyList();
    }

    @Override
    public Map<String, Object> loadExternalInformations(XmlObject requestXml) throws CvqException {
        return Collections.emptyMap();
    }
    
    @Override
    public Map<Pair<String, String>, LinkedHashMap<Pair<String, String>, Object>> loadAccountExternalInformations(Long homefolderId) throws CvqException {
      return null;
    }
}
