package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.EmployeeType;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employeee {
    private Integer id;
    private EmployeeType employeeType;
    private Integer userId;
    private String password;
}
