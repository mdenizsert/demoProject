package com.example.demoproject.business.concretes;

import com.example.demoproject.business.abstracts.DepartmentService;
import com.example.demoproject.dataAccess.abstracts.DepartmentRepository;
import com.example.demoproject.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentManager implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentManager(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }



    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public void add(Department department) {
        this.departmentRepository.save(department);
    }

    @Override
    public void delete(int id) {
        this.departmentRepository.deleteById(id);
    }

    @Override
    public void update(Department department) {
        this.departmentRepository.save(department);
    }
}
