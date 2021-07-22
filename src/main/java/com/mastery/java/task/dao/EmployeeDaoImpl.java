package com.mastery.java.task.dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import com.mastery.java.task.dto.EmployeeMapper;
import com.mastery.java.task.dto.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    public EmployeeDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public List<Employee> findAll() {
        return template.query("SELECT e.employee_id, e.first_name,e.last_name, d.department_name, e.job_title, e.gender, e.date_of_birth\n" +
                "FROM department d\n" +
                "INNER JOIN employee e\n" +
                "ON e.department_id=d.department_id\n" +
                "ORDER BY e.employee_id;\n", new EmployeeMapper());
    }



}


