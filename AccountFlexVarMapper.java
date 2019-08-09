package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountFlexVarMapper implements RowMapper<AccountFlexVariables> {

    public AccountFlexVariables mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return AccountFlexVariables.builder()
                .CARD_ACCT_NO(resultSet.getString("CARD_ACCT_NO"))
                .STA_TYPE_CD(resultSet.getString("STA_TYPE_CD"))
                .STA_LVL_CD(resultSet.getString("STA_LVL_CD"))
                .PRG_DT(resultSet.getString("PRG_DT"))
                .ADD_DT(resultSet.getString("ADD_DT"))
                .ITEM_ADD_DT(resultSet.getString("ITEM_ADD_DT"))
                .PAN_SEQ_NO(resultSet.getString("PAN_SEQ_NO"))
                .DPAN_IN(resultSet.getString("DPAN_IN"))
                .CASM_IN(resultSet.getString("CASM_IN"))
                .STA_CD(resultSet.getString("STA_CD"))
                .PLSTC_NO(resultSet.getString("PLSTC_NO"))
                .RTN_PER_DAY_NO(resultSet.getString("RTN_PER_DAY_NO"))
                .TRANS_SRCE_CD(resultSet.getString("TRANS_SRCE_CD"))
                .TRANS_ADD_SRCE_ID(resultSet.getString("TRANS_ADD_SRCE_ID"))
                .TRANS_DEL_SRCE_ID(resultSet.getString("TRANS_DEL_SRCE_ID"))
                .NEW_PRG_TS(resultSet.getString("NEW_PRG_TS"))
                .LJ255_EVENT_TS(resultSet.getString("LJ255_EVENT_TS"))
                .LJ255_LST_UPDT_TS(resultSet.getString("LJ255_LST_UPDT_TS"))
                .LJ255_LST_UPDT_USER_ID(resultSet.getString("LJ255_LST_UPDT_USER_ID"))
                .build();
    }
}
