package com.example.authWithSpringboot.controller;
import com.example.authWithSpringboot.dto.EmployeeDTO;
import com.example.authWithSpringboot.dto.LoginDTO;
import com.example.authWithSpringboot.payload.LoginResponse;
import com.example.authWithSpringboot.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        String s = employeeService.addEmployee(employeeDTO);
        return s;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> LoginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}
