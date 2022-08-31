package com.ph17480.api;

import com.ph17480.entities.Account;
import com.ph17480.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin("*")
@RestController
@RequestMapping("/rest/accounts")
public class AccountRestController {
    @Autowired
    AccountService accountService;

    @GetMapping
    public List<Account> getAccounts(@RequestParam("admin") Optional<Boolean> admin) {
        if(admin.orElse(false)) {
            return accountService.getAdministrators();
        }
        return accountService.findAll();
    }

    @GetMapping("{username}")
    public Account getOne(@PathVariable("username") String username) {
        return accountService.findById(username);
    }

}
