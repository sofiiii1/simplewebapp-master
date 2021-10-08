package com.example.crudapplication.repo;

import com.example.crudapplication.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
