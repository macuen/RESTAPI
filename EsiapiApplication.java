package com.aexp.esi.esiapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.awt.print.Pageable;
import java.util.List;

@SpringBootApplication
public class EsiapiApplication implements CommandLineRunner {
    //to call AccountService class later on
    @Autowired
    private AccountService accountService;
    //main method
    public static void main(String[] args) { SpringApplication.run(EsiapiApplication.class, args); }
    @Override
    public void run(String... args) throws Exception{
    System.out.println("Test");
    }
}
