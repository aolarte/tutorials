package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.dao.IPersonDAO;
import test.model.Person;
import test.service.IPersonService;

import java.util.List;


@Service //1
@Transactional //2
public class PersonService implements IPersonService{

    @Autowired //3
    private IPersonDAO personDAO;

    @Override
    public List<Person> findAll() {
        return personDAO.findAll(); //4
    }

}
