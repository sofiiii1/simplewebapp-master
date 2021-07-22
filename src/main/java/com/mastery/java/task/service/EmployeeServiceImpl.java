package com.mastery.java.task.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.mastery.java.task.dto.Employee;
import java.util.List;
import lombok.Data;
import com.mastery.java.task.dao.EmployeeDao;
import com.mastery.java.task.dto.EmployeeMapper;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    EmployeeDao employeeDao;
    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
}
