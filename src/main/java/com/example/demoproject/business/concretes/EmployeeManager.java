package com.example.demoproject.business.concretes;

import com.example.demoproject.business.abstracts.EmployeeService;
import com.example.demoproject.dataAccess.abstracts.EmployeeRepository;
import com.example.demoproject.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {


    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeManager(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getByDepartment(int departmentId) {
        return this.employeeRepository.getByDepartment_Id(departmentId);
    }

    @Override
    public List<Employee> getAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public void Add(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public void Update(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public void Delete(int id) {
        this.employeeRepository.deleteById(id);
    }

    @Override
    public Employee getById(int id) {
        return this.employeeRepository.findById(id);
    }
}
