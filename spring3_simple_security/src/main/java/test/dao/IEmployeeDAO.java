package test.dao;

import test.model.Employee;


public interface IEmployeeDAO {

    Employee findByUserName(String userName);
}
