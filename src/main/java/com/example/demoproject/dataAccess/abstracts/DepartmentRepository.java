package com.example.demoproject.dataAccess.abstracts;

import com.example.demoproject.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
