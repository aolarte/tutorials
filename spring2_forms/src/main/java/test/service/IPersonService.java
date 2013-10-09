package test.service;

import test.model.Person;

import java.util.List;


public interface IPersonService {

      List<Person> findAll();

    void persist(Person person);

    Person findById(Long id);
}
