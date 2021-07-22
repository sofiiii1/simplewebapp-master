package com.mastery.java.task.dao;
import java.util.List;
import com.mastery.java.task.dto.Employee;

public interface EmployeeDao {
    List<Employee> findAll();

    /*void insertEmployee(Employee emp);

    void updateEmployee(Employee emp);

    void executeUpdateEmployee(Employee emp);

    public void deleteEmployee(Employee emp);*/

}
