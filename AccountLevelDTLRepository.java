package com.aexp.esi.esiapi.dao;

import com.aexp.esi.esiapi.controller.AccountFlexVarMapper;
import com.aexp.esi.esiapi.controller.AccountFlexVariables;
import com.aexp.esi.esiapi.controller.AccountLevelDTL;
import com.aexp.esi.esiapi.controller.AccountLevelDTLMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AccountLevelDTLRepository {

        @Autowired
        private JdbcTemplate jdbcTemplate;

        @Transactional(readOnly=true)
        public List<AccountLevelDTL> findAll() {
            return jdbcTemplate.query("select * from acct_lvl_dtl", new AccountLevelDTLMapper());
        }





}
