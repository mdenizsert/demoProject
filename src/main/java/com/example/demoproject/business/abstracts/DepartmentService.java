package com.example.demoproject.business.abstracts;

import com.example.demoproject.entities.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAll();
    void add(Department department);
    void delete(int id);
    void update(Department department);
}
