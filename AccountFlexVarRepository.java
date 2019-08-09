package com.aexp.esi.esiapi.dao;


import com.aexp.esi.esiapi.controller.AccountFlexVarMapper;
import com.aexp.esi.esiapi.controller.AccountFlexVariables;
import com.aexp.esi.esiapi.controller.AccountLevelStatusCode;
import com.aexp.esi.esiapi.controller.AccountLevelStatusCodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AccountFlexVarRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly=true)
    public List<AccountFlexVariables> findAll() {
        return jdbcTemplate.query("select * from acct_flex_variables", new AccountFlexVarMapper());
    }


}
