package com.example.crudapplication.controllers;

import com.example.crudapplication.models.Employee;
import com.example.crudapplication.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class MainController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title","Crud Application");
        Iterable<Employee> employees=employeeRepository.findAll();
        model.addAttribute("employees",employees);
        return "home";
    }
    @GetMapping("/add")
    public String add(Model model){
        return "/add";
    }
    @PostMapping("/add")
    public String addEmployee(@RequestParam String firstName, @RequestParam String lastName,@RequestParam String department, @RequestParam String jobTitle,@RequestParam String gender, Model model){
        Employee employee=new Employee(firstName,lastName,department,jobTitle,gender);
        employeeRepository.save(employee);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable(value="id") long id, Model model){
        if(!employeeRepository.existsById(id)){
            return "redirect:/";
        }
        Optional<Employee> employee=employeeRepository.findById(id);
        ArrayList<Employee> res=new ArrayList<>();
        employee.ifPresent(res::add);
        model.addAttribute("employee",res);
        return"/edit";
    }
    @PostMapping("/edit/{id}")
    public String editEmployeePost(@PathVariable(value = "id") long id, @RequestParam String firstName, @RequestParam String lastName,@RequestParam String department, @RequestParam String jobTitle,@RequestParam String gender, Model model){
        Employee employee =employeeRepository.findById(id).orElseThrow();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setDepartment(department);
        employee.setJobTitle(jobTitle);
        employee.setGender(gender);
        employeeRepository.save(employee);
        return "redirect:/";
    }
    @PostMapping("/remove/{id}")
    public String removeEmployee(@PathVariable(value = "id") long id, Model model){
        Employee employee =employeeRepository.findById(id).orElseThrow();
        employeeRepository.delete(employee);
        return "redirect:/";
    }
}
