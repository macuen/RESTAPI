package com.aexp.esi.esiapi.dao;

import com.aexp.esi.esiapi.controller.AccountLvlSuptCD;
import com.aexp.esi.esiapi.controller.AccountLvlSuptCDMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AccountLvlSuptRepository {

        @Autowired
        private JdbcTemplate jdbcTemplate;

        @Transactional(readOnly=true)
        public List<AccountLvlSuptCD> findAll() {
            return jdbcTemplate.query("select * from acct_lvl_supt_code", new AccountLvlSuptCDMapper());
        }

}
