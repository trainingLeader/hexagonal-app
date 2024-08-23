package com.hexagonal.hexagonal_app.infrastructure.repository.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexagonal.hexagonal_app.application.service.product.IProductservice;
import com.hexagonal.hexagonal_app.domain.entities.Product;

public class ProductAdapter implements IProductservice {

    @Autowired
    private Productrepository productrepository;
    

    @Override
    public Optional<Product> findById(Long id) {
        return productrepository.findById(id);
    }

    @Override
    public List<Product> getAll() {
        return productrepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productrepository.save(product);
    }
}
