package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountSEZipMapper implements RowMapper<AccountSEZip> {

    public AccountSEZip mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return AccountSEZip.builder()
                .CM_ACCT_NO(resultSet.getString("CM_ACCT_NO"))
                .SE_NO(resultSet.getString("SE_NO"))
                .ZIP_CD(resultSet.getString("ZIP_CD"))
                .TRANS_CT(resultSet.getString("TRANS_CT"))
                .TRANS_AM(resultSet.getString("TRANS_AM"))
                .LV320_EVENT_TS(resultSet.getString("LV320_EVENT_TS"))
                .LV320_LST_UPDT_TS(resultSet.getString("LV320_LST_UPDT_TS"))
                .LV320_LST_UPDT_USER_ID(resultSet.getString("LV320_LST_UPDT_USER_ID"))
                .build();

    }
}
