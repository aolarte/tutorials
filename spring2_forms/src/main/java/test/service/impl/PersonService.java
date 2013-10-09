package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.dao.IPersonDAO;
import test.model.Person;
import test.service.IPersonService;

import java.util.List;


@Service
@Transactional
public class PersonService implements IPersonService{

    @Autowired
    private IPersonDAO personDAO;

    @Override
    public List<Person> findAll() {
        return personDAO.findAll();
    }

    @Override
    public Person findById(Long id) {
        return personDAO.findById(id);
    }

    @Override
    public void persist(Person person) {
        personDAO.persist(person);
    }
}
