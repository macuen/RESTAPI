package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountZipCDDaMapper implements RowMapper<AccountZipCDDa> {

    public AccountZipCDDa mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return AccountZipCDDa.builder()
                .CM_ACCT_NO(resultSet.getString("CM_ACCT_NO"))
                .ZIP_CD(resultSet.getString("ZIP_CD"))
                .TRANS_CT(resultSet.getString("TRANS_CT"))
                .TRANS_AM(resultSet.getString("TRANS_AM"))
                .LV720_EVENT_TS(resultSet.getString("LV720_EVENT_TS"))
                .LV720_LST_UPDT_TS(resultSet.getString("LV720_LST_UPDT_TS"))
                .LV720_LST_UPDT_USER_ID(resultSet.getString("LV720_LST_UPDT_USER_ID"))
                .build();
    }
}
