package com.example.authWithSpringboot.service;

import com.example.authWithSpringboot.dto.EmployeeDTO;
import com.example.authWithSpringboot.dto.LoginDTO;
import com.example.authWithSpringboot.payload.LoginResponse;
import org.springframework.stereotype.Service;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);
}
