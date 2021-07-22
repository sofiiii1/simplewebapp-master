package com.mastery.java.task.dto;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import com.mastery.java.task.dto.Employee;

public class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee emp = new Employee();
        emp.setEmployeeId(rs.getLong("employeeId"));
        emp.setFirstName(rs.getString("firstName"));
        emp.setLastName(rs.getString("lastName"));
        emp.setDepartmentName(rs.getString("deprtmentName"));
        emp.setJobTitle(rs.getString("jobTitle"));
        emp.setDateOfBirth(rs.getDate("dateOfBirth"));
        return emp;
    }

}
