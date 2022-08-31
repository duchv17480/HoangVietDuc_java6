package com.ph17480.service.impl;

import com.ph17480.entities.Account;
import com.ph17480.entities.Authority;
import com.ph17480.repository.AccountRepository;
import com.ph17480.repository.AuthorityRepository;
import com.ph17480.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    AuthorityRepository authorityRepository;
    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<Authority> findAll() {
        return authorityRepository.findAll();
    }
    @Override
    public Authority create(Authority auth) {
        return authorityRepository.save(auth);
    }
    @Override
    public void delete(Integer id) {
        authorityRepository.deleteById(id);
    }
    @Override
    public List<Authority> findAuthoritiesOfAdministrators() {
        List<Account> accounts = accountRepository.getAdministrators();
        return authorityRepository.authoritiesOf(accounts);
    }
}
