package com.aexp.esi.esiapi.dao;

import com.aexp.esi.esiapi.controller.AccountSE;
import com.aexp.esi.esiapi.controller.AccountSEMapper;
import com.aexp.esi.esiapi.controller.AccountZipCDDa;
import com.aexp.esi.esiapi.controller.AccountZipCDDaMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AccountZipCDDaRepository {

    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly=true)
    public List<AccountZipCDDa> findAll() {
        return jdbcTemplate.query("select * from acct_zip_cd_da", new AccountZipCDDaMapper());
    }
}
