package com.aexp.esi.esiapi.dao;

import com.aexp.esi.esiapi.controller.CorpStratFlag;
import com.aexp.esi.esiapi.controller.CorpStratFlagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CorpStratFlagRepository{

        @Autowired
        private JdbcTemplate jdbcTemplate;

        @Transactional(readOnly=true)
        public List<CorpStratFlag> findAll() {
            return jdbcTemplate.query("select * from corp_strat_flag", new CorpStratFlagMapper());
        }
}
