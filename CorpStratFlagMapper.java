package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CorpStratFlagMapper implements RowMapper<CorpStratFlag> {

    public CorpStratFlag mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {
        return CorpStratFlag.builder()
                .CTRY_CD(resultSet.getString("CTRY_CD"))
                .CORP_NO(resultSet.getString("CORP_NO"))
                .CURR_CD(resultSet.getString("CURR_CD"))
                .LST_UPDT_TS(resultSet.getString("LST_UPDT_TS"))
                .STRAT_FLAG_CODE1(resultSet.getString("STRAT_FLAG_CODE1"))
                .STRAT_FLAG_CODE2(resultSet.getString("STRAT_FLAG_CODE2"))
                .STRAT_FLAG_CODE3(resultSet.getString("STRAT_FLAG_CODE3"))
                .STRAT_FLAG_CODE4(resultSet.getString("STRAT_FLAG_CODE4"))
                .L2C50_EVENT_TS(resultSet.getString("L2C50_EVENT_TS"))
                .L2C50_LST_UPDT_TS(resultSet.getString("L2C50_LST_UPDT_TS"))
                .L2C50_LST_UPDT_USER_ID(resultSet.getString("L2C50_LST_UPDT_USER_ID"))
        .build();
    }
}
