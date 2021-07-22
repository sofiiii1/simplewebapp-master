package com.mastery.java.task.rest;

import com.mastery.java.task.dto.EmployeeMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import javax.annotation.Resource;
import java.util.List;

import com.mastery.java.task.service.EmployeeService;
import com.mastery.java.task.dto.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Resource
    EmployeeService employeeService;

    @GetMapping(value = "/employeeList")
    public List<Employee> getEmployees() {
        return employeeService.findAll();

    }


}
