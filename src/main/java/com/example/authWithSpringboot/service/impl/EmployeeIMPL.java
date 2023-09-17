package com.example.authWithSpringboot.service.impl;

import com.example.authWithSpringboot.dto.EmployeeDTO;
import com.example.authWithSpringboot.dto.LoginDTO;
import com.example.authWithSpringboot.entity.Employee;
import com.example.authWithSpringboot.payload.LoginResponse;
import com.example.authWithSpringboot.repo.EmployeeRepo;
import com.example.authWithSpringboot.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class EmployeeIMPL implements EmployeeService {

   // @Autowired
    private final EmployeeRepo employeeRepo;

   // @Autowired
    private  final PasswordEncoder passwordEncoder;

    public EmployeeIMPL(EmployeeRepo employeeRepo, PasswordEncoder passwordEncoder) {
        this.employeeRepo = employeeRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(
          employeeDTO.getEmployeeId(),
          employeeDTO.getEmployeeName(),
          employeeDTO.getEmail(),

          this.passwordEncoder.encode(employeeDTO.getPassword()));

        employeeRepo.save(employee);

        return employee.getEmployeeName();

    }

    @Override
    public LoginResponse loginEmployee(LoginDTO loginDTO) {
        String msg = "";
        Employee employee1 = employeeRepo.findByEmail(loginDTO.getEmail());
        if(employee1 != null){
            String password = loginDTO.getPassword();
            String encodedPassword = employee1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);

            if (isPwdRight) {
                Optional<Employee> employee = employeeRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);

                if (employee.isPresent()) {
                    return new LoginResponse("Login successful", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else{
                    return new LoginResponse("password Not Match", false);
                }
            } else {
                return new LoginResponse("Email Does Not Exits", false);
            }
        }

}
