package com.example.hrportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrportal.model.LoginModel;
import com.example.hrportal.repository.LoginRepo;

@Service
public class LoginService {
    @Autowired
    LoginRepo repo;

    public LoginModel create(LoginModel mod) {
        return repo.save(mod);
    }

    public List<LoginModel> read() {
        return repo.findAll();
    }

    public LoginModel getDetailsById(int id) {
        return repo.findById(id).orElse(null);
    }

    public String delete(int id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }

    public LoginModel update(int id, LoginModel mod) {
        LoginModel model = repo.findById(id).orElse(null);
        if (model != null) {
            model.setUsername(mod.getUsername());
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
