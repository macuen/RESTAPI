package com.aexp.esi.esiapi.dao;


import com.aexp.esi.esiapi.controller.PLSTC_LVL_STA_CD;
import com.aexp.esi.esiapi.controller.PLSTC_LVL_STA_CD_Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class PLSTC_LVL_STA_CD_Repo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //Query for PLSTC_LVL_STA_CD
    @Transactional(readOnly=true)
    public List<PLSTC_LVL_STA_CD> findAllPLSC() {
        return jdbcTemplate.query("select * from plstc_lvl_sta_cd", new Object[]{} , new PLSTC_LVL_STA_CD_Mapper());
    }
    @Transactional(readOnly=true)
    public List<PLSTC_LVL_STA_CD> findBySTAPLSC(String dbStatusCD) {
        return jdbcTemplate.query("select * from plstc_lvl_sta_cd where sta_cd = ? ", new Object[]{dbStatusCD} , new PLSTC_LVL_STA_CD_Mapper());
    }
    @Transactional(readOnly=true)
    public List<PLSTC_LVL_STA_CD> findByNegPLSC(String negCode) {
        return jdbcTemplate.query("select * from plstc_lvl_sta_cd where neg_item_in = ? ", new Object[]{negCode} , new PLSTC_LVL_STA_CD_Mapper());
    }
    @Transactional(readOnly=true)
    public List<PLSTC_LVL_STA_CD> findBySTAandNegPLSC(String dbStatusCD, String negCode) {
        return jdbcTemplate.query("select * from plstc_lvl_sta_cd where sta_cd = ? AND neg_item_in = ? ", new Object[]{dbStatusCD, negCode}, new PLSTC_LVL_STA_CD_Mapper());
    }
    @Transactional(readOnly=true)
    public List<PLSTC_LVL_STA_CD> findByGreaterThanPLSC(int rtnGreaterThan) {
        return jdbcTemplate.query("select * from plstc_lvl_sta_cd where rtn_day_no >= ?", new Object[]{rtnGreaterThan}, new PLSTC_LVL_STA_CD_Mapper());
    }
    @Transactional(readOnly=true)
    public List<PLSTC_LVL_STA_CD> findByLessThanPLSC(int rtnLessThan) {
        return jdbcTemplate.query("select * from plstc_lvl_sta_cd where rtn_day_no <= ?", new Object[]{rtnLessThan}, new PLSTC_LVL_STA_CD_Mapper());
    }
    @Transactional(readOnly=true)
    public List<PLSTC_LVL_STA_CD> findByFieldPLSC() {
        return jdbcTemplate.query("select * from plstc_lvl_sta_cd",new PLSTC_LVL_STA_CD_Mapper());
    }
}
