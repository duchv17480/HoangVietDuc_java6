package com.ph17480.service;

import com.ph17480.entities.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    public List<Category> findAll() ;

    public Category findById(String id) ;

    public Category create(Category category) ;

    public Category update(Category category) ;

    public void delete(String id) ;
}
