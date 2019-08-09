package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountSECurrMapper implements RowMapper<AccountSECurr> {

    public AccountSECurr mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return AccountSECurr.builder()
                .CM_ACCT_NO(resultSet.getString("CM_ACCT_NO"))
                .SE_NO(resultSet.getString("SE_NO"))
                .CURR_CD(resultSet.getString("CURR_CD"))
                .TRANS_CT(resultSet.getString("TRANS_CT"))
                .TRANS_AM(resultSet.getString("TRANS_AM"))
                .LV420_EVENT_TS(resultSet.getString("LV420_EVENT_TS"))
                .LV420_LST_UPDT_TS(resultSet.getString("LV420_LST_UPDT_TS"))
                .LV420_LST_UPDT_USER_ID(resultSet.getString("LV420_LST_UPDT_USER_ID"))
                .build();

    }
}
