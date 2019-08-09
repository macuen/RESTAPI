package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountSEMapper implements RowMapper<AccountSE> {

    public AccountSE mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return AccountSE.builder()
                .CM_ACCT_NO(resultSet.getString("CM_ACCT_NO"))
                .SE_NO(resultSet.getString("SE_NO"))
                .TRANS_CT(resultSet.getString("TRANS_CT"))
                .TRANS_AM(resultSet.getString("TRANS_AM"))
                .LV520_EVENT_TS(resultSet.getString("LV520_EVENT_TS"))
                .LV520_LST_UPDT_TS(resultSet.getString("LV520_LST_UPDT_TS"))
                .LV520_LST_UPDT_USER_ID(resultSet.getString("LV520_LST_UPDT_USER_ID"))
                .build();

    }
}
