package com.hexagonal.hexagonal_app.infrastructure.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.hexagonal.hexagonal_app.application.service.product.UserService;
import com.hexagonal.hexagonal_app.domain.entities.User;
import com.hexagonal.hexagonal_app.infrastructure.models.exception.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class AppController {

    @Autowired
    private UserService service;

    @GetMapping("/app")
    public String index(){
        int valor = 100/0;
        return "Ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id") Long id) {
        User user = service.findById(id).orElseThrow(() -> new UserNotFoundException("Error el usuario no existe!"));
        System.out.println(user.getLastname());
        return user;
    }
}
