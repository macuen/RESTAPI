package com.aexp.esi.esiapi.dao;

import com.aexp.esi.esiapi.controller.AccountLevelStatusCode;
import com.aexp.esi.esiapi.controller.AccountLevelStatusCodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AccountLevelStatusCodeRepository {

        @Autowired
        private JdbcTemplate jdbcTemplate;

        //Queries for ACCT_LVL_STA_CD
        @Transactional(readOnly=true)
        public List<AccountLevelStatusCode> findAll() {
                return jdbcTemplate.query("select ? from acct_lvl_sta_cd", new Object[]{} , new AccountLevelStatusCodeMapper());
        }
        @Transactional(readOnly=true)
        public List<AccountLevelStatusCode> findBySTA(String dbStatusCD) {
                return jdbcTemplate.query("select * from acct_lvl_sta_cd where sta_cd = ? ", new Object[]{dbStatusCD} , new AccountLevelStatusCodeMapper());
        }
        @Transactional(readOnly=true)
        public List<AccountLevelStatusCode> findByNeg(String negCode) {
                return jdbcTemplate.query("select * from acct_lvl_sta_cd where neg_item_in = ? ", new Object[]{negCode} , new AccountLevelStatusCodeMapper());
        }
        @Transactional(readOnly=true)
        public List<AccountLevelStatusCode> findBySTAandNeg(String dbStatusCD, String negCode) {
                return jdbcTemplate.query("select * from acct_lvl_sta_cd where sta_cd = ? AND neg_item_in = ? ", new Object[]{dbStatusCD, negCode}, new AccountLevelStatusCodeMapper());
        }
        @Transactional(readOnly=true)
        public List<AccountLevelStatusCode> findByGreaterThan(int rtnGreaterThan) {
                return jdbcTemplate.query("select * from acct_lvl_sta_cd where rtn_day_no >= ?", new Object[]{rtnGreaterThan}, new AccountLevelStatusCodeMapper());
        }
        @Transactional(readOnly=true)
        public List<AccountLevelStatusCode> findByLessThan(int rtnLessThan) {
                return jdbcTemplate.query("select * from acct_lvl_sta_cd where rtn_day_no <= ?", new Object[]{rtnLessThan}, new AccountLevelStatusCodeMapper());
        }
        @Transactional(readOnly=true)
        public List<AccountLevelStatusCode> findByField() {
                return jdbcTemplate.query("select * from acct_lvl_sta_cd",new AccountLevelStatusCodeMapper());
        }


    }
