package fr.cg95.cvq.service.request.civil.impl;

import java.util.Arrays;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.civil.CivilStatusCertificateRequest;
import fr.cg95.cvq.business.request.civil.CscFormatActeType;
import fr.cg95.cvq.business.request.civil.CscMotifType;
import fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType;
import fr.cg95.cvq.business.request.civil.CscTypeDemandeurType;
import fr.cg95.cvq.service.request.condition.EqualityChecker;
import fr.cg95.cvq.service.request.condition.EqualityListChecker;
import fr.cg95.cvq.service.request.impl.RequestService;

public class CivilStatusCertificateRequestService extends RequestService {

    @Override
    public void init() {
        CivilStatusCertificateRequest.conditions.put("formatActe", new EqualityChecker(CscFormatActeType.SANS_FILIATION.name()));
        CivilStatusCertificateRequest.conditions.put("motif", new EqualityChecker(CscMotifType.AUTRE.name()));
        CivilStatusCertificateRequest.conditions.put("typeDemandeur", 
                new EqualityListChecker(Arrays.asList("estParticulier="+CscTypeDemandeurType.PARTICULIER.name(),"estAdministration="+CscTypeDemandeurType.ADMINISTRATION.name(),
                        "estJuridique="+CscTypeDemandeurType.NOTAIRE.name(),"estJuridique="+CscTypeDemandeurType.AVOCAT.name())));
        CivilStatusCertificateRequest.conditions.put("informationsParticulier.qualiteDemandeurParticulier",
                new EqualityListChecker(Arrays.asList(CscQualiteDemandeurType.AUTRE_LIEN_PARENTE.name(),CscQualiteDemandeurType.AUTRE_CAS.name())));
        CivilStatusCertificateRequest.conditions.put("informationsAdministration.qualiteMandataireAdministration",
                new EqualityListChecker(Arrays.asList(CscQualiteDemandeurType.AUTRE_LIEN_PARENTE.name(), CscQualiteDemandeurType.AUTRE_CAS.name())));
        CivilStatusCertificateRequest.conditions.put("informationsJuridique.qualiteMandataireJuridique",
                new EqualityListChecker(Arrays.asList(CscQualiteDemandeurType.AUTRE_LIEN_PARENTE.name(),CscQualiteDemandeurType.AUTRE_CAS.name())));
    }

    @Override
    public boolean accept(Request request) {
        return request instanceof CivilStatusCertificateRequest;
    }

    @Override
    public Request getSkeletonRequest() {
        return new CivilStatusCertificateRequest();
    }

}
