package com.mastery.java.task.dto;

import lombok.Data;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;


public class Employee {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String departmentName;
    private String jobTitle;
    private Gender gender;
    private Date dateOfBirth;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public Long getEmployeeID(){
        return employeeId;
    }
    public void setEmployeeId(Long employeeId){
        this.employeeId=employeeId;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getDepartmenName(){
        return departmentName;
    }
    public void setDepartmentName(String departmentName){
        this.departmentName=departmentName;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    public Gender getGender(){
        return gender;
    }
    public void setGender(Gender gender){
        this.gender=gender;
    }
    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
}
