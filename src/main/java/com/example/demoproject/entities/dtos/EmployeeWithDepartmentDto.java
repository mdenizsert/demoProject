package com.example.demoproject.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeWithDepartmentDto {
    private int id;
    private String employeeName;
    private String categoryName;
}
