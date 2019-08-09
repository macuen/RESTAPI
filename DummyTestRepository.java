package com.aexp.esi.esiapi.dao;

import com.aexp.esi.esiapi.OracleMapping;
import com.aexp.esi.esiapi.controller.DummyTest;
import com.aexp.esi.esiapi.controller.DummyTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class DummyTestRepository
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly=true)
    public List<DummyTest> findAll() {

        return jdbcTemplate.query("select * from dummy_test", new DummyTestMapper());
    }
//
//    @Transactional(readOnly = true)
//    public List<DummyTest> findByStatusCD
}