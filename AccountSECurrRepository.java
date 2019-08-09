package com.aexp.esi.esiapi.dao;

import com.aexp.esi.esiapi.controller.AccountSE;
import com.aexp.esi.esiapi.controller.AccountSECurr;
import com.aexp.esi.esiapi.controller.AccountSECurrMapper;
import com.aexp.esi.esiapi.controller.AccountSEMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AccountSECurrRepository {

    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly=true)
    public List<AccountSECurr> findAll() {
        return jdbcTemplate.query("select * from acct_se_curr", new AccountSECurrMapper());
    }
}
