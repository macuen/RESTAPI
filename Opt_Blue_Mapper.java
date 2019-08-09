package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Opt_Blue_Mapper implements RowMapper<Opt_Blue> {

    public Opt_Blue mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return Opt_Blue.builder()
                .AGGR_SE_NO(resultSet.getString("AGGR_SE_NO"))
                .SELL_ID(resultSet.getString("SELL_ID"))
                .SELL_SE_NO(resultSet.getString("SELL_SE_NO"))
                .LGCY_SE_NO(resultSet.getString("LGCY_SE_NO"))
                .L0C80_EVENT_TS(resultSet.getString("L0C80_EVENT_TS"))
                .L0C80_LST_UPDT_TS(resultSet.getString("L0C80_LST_UPDT_TS"))
                .L0C80_LST_UPDT_USER_ID(resultSet.getString("L0C80_LST_UPDT_USER_ID"))
        .build();
    }
}
