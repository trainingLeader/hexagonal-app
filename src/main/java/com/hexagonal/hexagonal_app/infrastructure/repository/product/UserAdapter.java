package com.hexagonal.hexagonal_app.infrastructure.repository.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexagonal.hexagonal_app.application.service.product.UserService;
import com.hexagonal.hexagonal_app.domain.entities.User;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserAdapter implements UserService {
    private List<User> users;

    
    public UserAdapter() {
        this.users = new ArrayList<>();
        users.add(new User(1L,"Carlos","Patiño"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter( usr -> usr.getId().equals(id) ).findFirst();
    }
}
