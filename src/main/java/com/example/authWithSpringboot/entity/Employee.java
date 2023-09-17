package com.example.authWithSpringboot.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    @Column( length = 255,nullable = false)
    private String employeeName;

    @Column( length = 255,nullable = false)
    private String email;

    @Column( length = 255,nullable = false)
    private String password;

//
//    public Employee(int employeeid, String employeename, String email, String password) {
//        this.employeeid = employeeid;
//        this.employeename = employeename;
//        this.email = email;
//        this.password = password;
//    }
//
//    public Employee() {
//    }
//
//    public int getEmployeeid() {
//        return employeeid;
//    }
//
//    public void setEmployeeid(int employeeid) {
//        this.employeeid = employeeid;
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
//        return "Employee{" +
//                "employeeid=" + employeeid +
//                ", employeename='" + employeename + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}
