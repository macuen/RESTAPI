package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CmSeMapper implements RowMapper<CmSe> {

    public CmSe mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return CmSe.builder()
                .CM_ACCT_NO(resultSet.getString("CM_ACCT_NO"))
                .SUPP_NO(resultSet.getString("SUPP_NO"))
                .SE_NO(resultSet.getString("SE_NO"))
                .SRCE_TYPE_CD(resultSet.getString("SRCE_TYPE_CD"))
                .PRG_DT(resultSet.getString("PRG_DT"))
                .CM_SE_DA_PRG_DT(resultSet.getString("CM_SE_DA_PRG_DT"))
                .L21B0_EVENT_TS(resultSet.getString("L21B0_EVENT_TS"))
                .L21B0_LST_UPDT_TS(resultSet.getString("L21B0_LST_UPDT_TS"))
                .L21B0_LST_UPDT_USER_ID(resultSet.getString("L21B0_LST_UPDT_USER_ID"))
                .build();

    }

}
