package org.example.config;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("emp")
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setEmpId(9891);
        employee.setEmployeeName("Colin");
        return employee;
    }

    @Bean("Dept")
    public Department getDepartment() {
        return new Department(12, "Admin");
    }

    @Bean
    public Department getDepartment2() {
        return new Department(45, "Civil");
    }
}

