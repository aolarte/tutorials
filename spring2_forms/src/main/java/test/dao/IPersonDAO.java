package test.dao;

import test.model.Person;

import java.util.List;


public interface IPersonDAO {
    List<Person> findAll();

    void persist(Person person);

    Person findById(Long id);
}
