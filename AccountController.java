package com.aexp.esi.esiapi.controller;

//import com.aexp.esi.esiapi.AccountService;

import com.aexp.esi.esiapi.OracleMapping;
import com.aexp.esi.esiapi.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class AccountController {

    //FOR TABLE DUMMY_TEST
    @Autowired
    public DummyTestRepository dummyTestRepository;

    public OracleMapping oracleMapping;

    @PostMapping(path = "/getAccounts", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<DummyTest> createOracleMapping() throws SQLException {

        return dummyTestRepository.findAll();
    }

    //FOR TABLE ACCT_LVL_STA_CD
    @Autowired
    private AccountLevelStatusCodeRepository accountLevelStatusCodeRepository;


    @PostMapping(path = "/{getAccStaLvlStaCd}", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<AccountLevelStatusCode> create2OracleMapping(@RequestBody OracleMapping oracleMapping) throws SQLException {

        if (oracleMapping.getTableName().equals("ACCT_LVL_STA_CD")) {

            if (oracleMapping.getRtnGreaterThan() != 0) {
                return accountLevelStatusCodeRepository.findByGreaterThan(oracleMapping.getRtnGreaterThan());
            } else if (oracleMapping.getRtnLessThan() != 0) {
                return accountLevelStatusCodeRepository.findByLessThan(oracleMapping.getRtnLessThan());
            } else if (oracleMapping.getDbStatusCD() != null && oracleMapping.getNegCode() == null) {
                return accountLevelStatusCodeRepository.findBySTA(oracleMapping.getDbStatusCD());
            } else if (oracleMapping.getNegCode() != null && oracleMapping.getDbStatusCD() == null) {
                return accountLevelStatusCodeRepository.findByNeg(oracleMapping.getNegCode());
            }
            return accountLevelStatusCodeRepository.findBySTAandNeg(oracleMapping.getDbStatusCD(), oracleMapping.getNegCode());
        }
        return accountLevelStatusCodeRepository.findBySTAandNeg(oracleMapping.getDbStatusCD(), oracleMapping.getNegCode());
    }

}



