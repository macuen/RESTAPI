package com.aexp.esi.esiapi.dao;

import com.aexp.esi.esiapi.controller.AuthTransHistory;
import com.aexp.esi.esiapi.controller.AuthTransHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class AuthTransHistoryRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly=true)
    public List<AuthTransHistory> findAll() {
        return jdbcTemplate.query("select * from auth_trans_hist", new AuthTransHistoryMapper());
    }
}
