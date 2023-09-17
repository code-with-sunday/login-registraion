package com.example.authWithSpringboot.dto;

import lombok.Data;


import jdk.jfr.DataAmount;
@Data
public class EmployeeDTO {

    private int employeeId;
    private String employeeName;
    private String email;
    private String password;

//    public EmployeeDTO(int employeeId, String employeeName, String email, String password) {
//        this.employeeId = employeeId;
//        this.employeeName = employeeName;
//        this.email = email;
//        this.password = password;
//    }
//
//    public EmployeeDTO() {
//    }
//
//    public int getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(int employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public String getEmployeename() {
//        return employeename;
//    }
//
//    public void setEmployeename(String employeename) {
//        this.employeename = employeename;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Override
//    public String toString() {
//        return "EmployeeDTO{" +
//                "employeeid=" + employeeId +
//                ", employeename='" + employeename + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}
