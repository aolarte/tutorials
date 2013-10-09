package test.dao.impl;

import org.springframework.stereotype.Repository;
import test.dao.IPersonDAO;
import test.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository   //1
public class PersonDAO  implements IPersonDAO {

    @PersistenceContext
    private EntityManager em; //2

    @Override
    public List<Person> findAll() {
        Query query = em.createQuery("SELECT e FROM Person e"); //3
        return (List<Person>) query.getResultList();
    }

}
