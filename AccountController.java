package com.aexp.esi.esiapi.controller;

import com.aexp.esi.esiapi.AccountService;
import com.aexp.esi.esiapi.OracleMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/{stCode}")
    public List<OracleMapping> accountList(String stCode){

    List<OracleMapping> oracleMappings = accountService.findAllByStatusCD(stCode, new PageRequest(0,20));
       // oracleMappings.forEach(System.out::println);

        return oracleMappings;
    }
}