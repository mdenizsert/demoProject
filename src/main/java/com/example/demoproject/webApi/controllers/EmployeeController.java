package com.example.demoproject.webApi.controllers;

import com.example.demoproject.business.abstracts.EmployeeService;
import com.example.demoproject.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getbydepartmentid")
    public List<Employee> getByDepartmentId(int id) {
        return employeeService.getByDepartment(id);
    }

    @GetMapping("/getAll")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Employee employee) {
         this.employeeService.Add(employee);
    }

    @PutMapping("/update")
    public void update(Employee employee) {
        this.employeeService.Update(employee);
    }

    @DeleteMapping("/delete")
    public void delete(int id) {
        this.employeeService.Delete(id);
    }
}
