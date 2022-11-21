package com.example.demoproject.business.abstracts;

import com.example.demoproject.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getByDepartment(int departmentId);
    List<Employee> getAll();
    void Add(Employee employee);
    void Update(Employee employee);
    void Delete(int id);
    Employee getById(int id);
}
