package com.aexp.esi.esiapi.controller;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountLvlSuptCDMapper implements RowMapper<AccountLvlSuptCD> {

    public AccountLvlSuptCD mapRow(final ResultSet resultSet, final int rowNum) throws SQLException{
        return AccountLvlSuptCD.builder()
                .CM_ACCT_NO(resultSet.getString("CM_ACCT_NO"))
                .SUPT_CD(resultSet.getString("SUPT_CD"))
                .SUPT_EXPR_TM(resultSet.getString("SUPT_EXPR_TM"))
                .PROD_CD(resultSet.getString("PROD_CD"))
                .SUPT_ENTER_DT(resultSet.getString("SUPT_ENTER_DT"))
                .RTN_DAY_NO(resultSet.getString("RTN_DAY_NO"))
                .KEY_01(resultSet.getString("KEY_01"))
                .VAL_01(resultSet.getString("VAL_01"))
                .KEY_02(resultSet.getString("KEY_02"))
                .VAL_02(resultSet.getString("VAL_02"))
                .KEY_03(resultSet.getString("KEY_02"))
                .VAL_03(resultSet.getString("VAL_03"))
                .KEY_04(resultSet.getString("KEY_04"))
                .VAL_04(resultSet.getString("VAL_04"))
                .KEY_05(resultSet.getString("KEY_05"))
                .VAL_05(resultSet.getString("VAL_05"))
                .KEY_06(resultSet.getString("KEY_06"))
                .VAL_06(resultSet.getString("VAL_06"))
                .KEY_07(resultSet.getString("KEY_07"))
                .VAL_07(resultSet.getString("VAL_07"))
                .KEY_08(resultSet.getString("KEY_08"))
                .VAL_08(resultSet.getString("VAL_08"))
                .KEY_09(resultSet.getString("KEY_09"))
                .VAL_09(resultSet.getString("VAL_09"))
                .KEY_10(resultSet.getString("KEY_10"))
                .VAL_10(resultSet.getString("VAL_10"))
                .KEY_11(resultSet.getString("KEY_11"))
                .VAL_11(resultSet.getString("VAL_11"))
                .KEY_12(resultSet.getString("KEY_12"))
                .VAL_12(resultSet.getString("VAL_12"))
                .KEY_13(resultSet.getString("KEY_13"))
                .VAL_13(resultSet.getString("VAL_13"))
                .KEY_14(resultSet.getString("KEY_14"))
                .VAL_14(resultSet.getString("VAL_14"))
                .KEY_15(resultSet.getString("KEY_15"))
                .VAL_15(resultSet.getString("VAL_15"))
                .KEY_16(resultSet.getString("KEY_16"))
                .VAL_16(resultSet.getString("VAL_16"))
                .KEY_17(resultSet.getString("KEY_17"))
                .VAL_17(resultSet.getString("VAL_17"))
                .KEY_18(resultSet.getString("KEY_18"))
                .VAL_18(resultSet.getString("VAL_18"))
                .KEY_19(resultSet.getString("KEY_19"))
                .VAL_19(resultSet.getString("VAL_19"))
                .KEY_20(resultSet.getString("KEY_20"))
                .VAL_20(resultSet.getString("VAL_20"))
                .EVENT_TS(resultSet.getString("EVENT_TS"))
                .LST_UPDT_TS(resultSet.getString("LST_UPDT_TS"))
                .LST_UPDT_USER_ID(resultSet.getString("LST_UPDT_USER_ID"))
        .build();
    }
}
