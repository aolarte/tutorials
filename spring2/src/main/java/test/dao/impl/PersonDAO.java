package test.dao.impl;

import org.springframework.stereotype.Repository;
import test.dao.IPersonDAO;
import test.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository
public class PersonDAO  implements IPersonDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Person> findAll() {
        Query query = em.createQuery("SELECT e FROM Person e");
        return (List<Person>) query.getResultList();
    }

    public void persist(Person person) {
        em.merge(person); //1
    }

    public Person findById(Long id) {
        return em.find(Person.class,id); //2
    }

}
