package com.example.demoproject.dataAccess.abstracts;

import com.example.demoproject.entities.Employee;
import com.example.demoproject.entities.dtos.EmployeeWithDepartmentDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> getByDepartment_Id(int departmentId);
    Employee findById(int id);
}
