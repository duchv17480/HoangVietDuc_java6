package com.ph17480.service;

import com.ph17480.entities.Authority;

import java.util.List;

public interface AuthorityService {
    public List<Authority> findAll() ;

    public Authority create(Authority auth) ;

    public void delete(Integer id) ;

    public List<Authority> findAuthoritiesOfAdministrators() ;
}
