package com.ph17480.service;

import com.ph17480.entities.Account;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {
    public List<Account> findAll() ;
    public Account findById(String username) ;
    public List<Account> getAdministrators() ;

}
