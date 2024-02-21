package com.example.hrportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrportal.model.EmployeeModel;

import com.example.hrportal.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo repo;

    public EmployeeModel create(EmployeeModel mod) {
        return repo.save(mod);
    }

    public List<EmployeeModel> read() {
        return repo.findAll();
    }

    public EmployeeModel getDetailsById(int id) {
        return repo.findById(id).orElse(null);
    }

    public String delete(int id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }

    public EmployeeModel update(int id, EmployeeModel mod) {
        EmployeeModel model = repo.findById(id).orElse(null);
        if (model != null) {
            model.setEmp_name(mod.getEmp_name());
            repo.save(model);
            return model;
        } else
            return mod;

    }

    public String deletAll() {
        repo.deleteAll();
        return "Deleted All Records";
    }

}
