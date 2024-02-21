package com.example.hrportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    private String emp_name;
    private String emp_dept;
    private String emp_salary;

    public EmployeeModel() {
    }

    public EmployeeModel(int emp_id, String emp_name, String emp_dept, String emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_dept = emp_dept;
        this.emp_salary = emp_salary;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_dept() {
        return emp_dept;
    }

    public void setEmp_dept(String emp_dept) {
        this.emp_dept = emp_dept;
    }

    public String getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(String emp_salary) {
        this.emp_salary = emp_salary;
    }

}
