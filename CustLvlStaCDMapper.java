package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustLvlStaCDMapper implements RowMapper<CustLvlStaCD> {

    public CustLvlStaCD mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return CustLvlStaCD.builder()

                .CUST_SEQ_NO(resultSet.getString("CUST_SEQ_NO"))
                .QLFY_DB_ID_AND_CHK_DGT_NO(resultSet.getString("QLFY_DB_ID_AND_CHK_DGT_NO"))
                .CUST_CURR_CD(resultSet.getString("CUST_CURR_CD"))
                .STA_CD(resultSet.getString("STA_CD"))
                .NEG_ITEM_IN(resultSet.getString("NEG_ITEM_IN"))
                .AUTH_STA_IN(resultSet.getString("AUTH_STA_IN"))
                .PERMT_ITEM_IN(resultSet.getString("PERMT_ITEM_IN"))
                .CUST_LVL_NEG_IN(resultSet.getString("CUST_LVL_NEG_IN"))
                .PRG_DT(resultSet.getString("PRG_DT"))
                .RTN_DAY_NO(resultSet.getString("RTN_DAY_NO"))
                .PROD_CD(resultSet.getString("PROD_CD"))
                .REC_ADD_DT(resultSet.getString("REC_ADD_DT"))
                .EVENT_TS(resultSet.getString("EVENT_TS"))
                .LST_UPDT_TS(resultSet.getString("LST_UPDT_TS"))
                .LST_UPDT_USER_ID(resultSet.getString("LST_UPDT_USER_ID"))
                .ACCT_LVL_ITEM_ADD_VIA_SUPT_IN(resultSet.getString("ACCT_LVL_ITEM_ADD_VIA_SUPT_IN"))
                .ACCT_LVL_ITEM_IS_CSBS_IN(resultSet.getString("ACCT_LVL_ITEM_IS_CSBS_IN"))
                .build();

    }

}
