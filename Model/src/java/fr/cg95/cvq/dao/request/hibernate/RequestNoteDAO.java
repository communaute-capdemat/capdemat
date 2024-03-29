package fr.cg95.cvq.dao.request.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.type.Type;

import fr.cg95.cvq.business.request.RequestNote;
import fr.cg95.cvq.business.request.RequestNoteType;
import fr.cg95.cvq.dao.jpa.JpaTemplate;
import fr.cg95.cvq.dao.hibernate.HibernateUtil;
import fr.cg95.cvq.dao.request.IRequestNoteDAO;

/**
 * Implementation of the {@link IRequestNoteDAO} interface.
 * 
 * @author bor@zenexity.fr
 */
public class RequestNoteDAO extends JpaTemplate<RequestNote, Long> implements IRequestNoteDAO {

    public List<RequestNote> listByRequestAndType(final Long requestId, RequestNoteType type) {

        StringBuffer sb = new StringBuffer();
        sb.append("from RequestNote as requestNote");

        List<Type> typeList = new ArrayList<Type>();
        List<Object> objectList = new ArrayList<Object>();

        sb.append(" where request_id = ?");
        objectList.add(requestId);
        typeList.add(Hibernate.LONG);

        if (type != null) {
            sb.append(" and type = ?");
            objectList.add(type.toString());
            typeList.add(Hibernate.STRING);
        }

        sb.append(" order by date asc");

        Type[] typeTab = typeList.toArray(new Type[0]);
        Object[] objectTab = objectList.toArray(new Object[0]);

        return HibernateUtil.getSession()
            .createQuery(sb.toString())
            .setParameters(objectTab, typeTab).list();
    }
}
