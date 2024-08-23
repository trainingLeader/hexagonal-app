package com.hexagonal.hexagonal_app.infrastructure.outport;

import java.util.List;

public interface Entittyrepository {

    public <T> T save(T reg);

    public <T> T getById(String id, Class<T> classEntity);
    
    public <T> List<T> getAll(Class<T> classEntity);
    
}
