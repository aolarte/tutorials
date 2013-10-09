package test.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import test.dao.IEmployeeDAO;
import test.model.Employee;

import java.util.List;


@Repository
public class EmployeeDAO implements IEmployeeDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Employee findByUserName(String userName) {
        TypedQuery<Employee> query=em.createQuery("SELECT e FROM Employee e WHERE e.userName=:userName", Employee.class);
        query.setParameter("userName",userName);
        return query.getSingleResult();
    }
}
