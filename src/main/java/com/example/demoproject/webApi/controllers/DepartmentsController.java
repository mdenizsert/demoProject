package com.example.demoproject.webApi.controllers;

import com.example.demoproject.business.abstracts.DepartmentService;
import com.example.demoproject.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsController {

    private DepartmentService departmentService;

    @Autowired
    public DepartmentsController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/getAll")
    public List<Department> getAll() {
        return departmentService.getAll();
    }

    @PostMapping("/add")
    public void add(Department department) {
        this.departmentService.add(department);
    }
    @DeleteMapping("/delete")
    public void delete(int id) {
        this.departmentService.delete(id);
    }
    @PutMapping("/update")
    public void update(Department department) {
        this.departmentService.update(department);
    }

}
