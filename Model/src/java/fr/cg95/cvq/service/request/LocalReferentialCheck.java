package fr.cg95.cvq.service.request;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import net.sf.oval.Validator;
import net.sf.oval.configuration.annotation.AbstractAnnotationCheck;
import net.sf.oval.context.FieldContext;
import net.sf.oval.context.OValContext;
import net.sf.oval.exception.OValException;
import fr.cg95.cvq.business.request.LocalReferentialData;
import fr.cg95.cvq.business.request.LocalReferentialType;
import fr.cg95.cvq.exception.CvqException;

public class LocalReferentialCheck extends AbstractAnnotationCheck<LocalReferential> {

    private static final long serialVersionUID = 1L;

    private static ILocalReferentialService localReferentialService;

    @Override
    public boolean isSatisfied(Object validatedObject, Object valueToValidate, OValContext context,
        Validator validator) throws OValException {
        if (valueToValidate == null) return false;
        LocalReferentialType type = null;
        try {
            type = localReferentialService.getLocalReferentialDataByName(StringUtils.capitalize(
                ((FieldContext)context).getField().getName()));
        } catch (CvqException e) {
            // why would this happen ?
            return false;
        }
        List<LocalReferentialData> datas = (List<LocalReferentialData>) valueToValidate;
        if (datas.size() > 1 && !type.getEntriesSupportMultiple()) return false;
        for (LocalReferentialData data : datas) {
            if (data.getName() == null) continue;
            if (type.getEntryByKey(data.getName()) == null) return false;
        }
        return true;
    }

    public static void setLocalReferentialService(
        ILocalReferentialService localReferentialService) {
        LocalReferentialCheck.localReferentialService = localReferentialService;
    }
}