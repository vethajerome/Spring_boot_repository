package com.example.hrportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrportal.model.EmployeeModel;
import com.example.hrportal.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService serv;

    @PostMapping("/post")
    public EmployeeModel postMethod(@RequestBody EmployeeModel model) {

        return serv.create(model);
    }

    @GetMapping("/get")
    public List<EmployeeModel> getAll() {
        return serv.read();
    }

    @GetMapping("/get/{id}")
    public EmployeeModel getById(@PathVariable int id) {
        return serv.getDetailsById(id);
    }

    @PutMapping("/update/{id}")
    public EmployeeModel putMethodName(@PathVariable int id, @RequestBody EmployeeModel mod) {

        return serv.update(id, mod);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return serv.delete(id);
    }

    @DeleteMapping("/delete")
    public String deletAll() {
        return serv.deletAll();
    }
}
