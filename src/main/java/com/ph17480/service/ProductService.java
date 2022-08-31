package com.ph17480.service;

import com.ph17480.entities.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll() ;

    public Product findById(Integer id) ;

    public List<Product> findByCategoryId(String cid) ;

    public Product create(Product product) ;

    public Product update(Product product) ;

    public void delete(Integer id) ;
}
