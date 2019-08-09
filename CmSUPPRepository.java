package com.aexp.esi.esiapi.dao;

import com.aexp.esi.esiapi.controller.CmSUPP;
import com.aexp.esi.esiapi.controller.CmSUPPMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CmSUPPRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly=true)
    public List<CmSUPP> findAll() {
        return jdbcTemplate.query("select * from cm_supp", new CmSUPPMapper());
    }

}
