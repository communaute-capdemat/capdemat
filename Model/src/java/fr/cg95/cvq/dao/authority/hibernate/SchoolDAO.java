package fr.cg95.cvq.dao.authority.hibernate;

import java.util.List;

import org.hibernate.Criteria;

import fr.cg95.cvq.business.authority.School;
import fr.cg95.cvq.dao.authority.ISchoolDAO;
import fr.cg95.cvq.dao.jpa.JpaTemplate;
import fr.cg95.cvq.dao.hibernate.HibernateUtil;
import fr.cg95.cvq.util.Critere;

/**
 * The "School" service Hibernate implementation. This class is responsible for
 * data access logic functions
 * 
 * @author bor@zenexity.fr
 */
public class SchoolDAO extends JpaTemplate<School,Long> implements ISchoolDAO {

    public School findByName(final String name) {
        Criteria crit = HibernateUtil.getSession().createCriteria(School.class);
        crit.add(Critere.compose("name", name, Critere.EQUALS));
        return (School) crit.uniqueResult();
    }

    @SuppressWarnings("unchecked")
    public List<School> listAll() {
        return (List<School>)HibernateUtil.getSession()
            .createQuery("from School as school").list();
    }

    @Override
    public List<School> getActive() {
        return (List<School>)HibernateUtil.getSession().createQuery("from School as s where s.active = true").list();
    }
}
