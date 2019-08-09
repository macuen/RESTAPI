package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CardPinMapper implements RowMapper<CardPin> {

    public CardPin mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return CardPin.builder()
                .CARD_NO(resultSet.getString("CARD_NO"))
                .CARD_TYPE_CD(resultSet.getString("CARD_TYPE_CD"))
                .KEY_ID(resultSet.getString("KEY_ID"))
                .PIN_OFS_NO(resultSet.getString("PIN_OFS_NO"))
                .LST_USED_TS(resultSet.getString("LST_USED_TS"))
                .TEMP_PIN_OFS_NO(resultSet.getString("TEMP_PIN_OFS_NO"))
                .TEMP_PIN_CREAT_TS(resultSet.getString("TEMP_PIN_CREAT_TS"))
                .CARD_PIN_USAGE_TYPE_CD(resultSet.getString("CARD_PIN_USAGE_TYPE_CD"))
                .ACTL_PIN_DGT_CT(resultSet.getString("ACTL_PIN_DGT_CT"))
                .PIN_VLD_DA_TX(resultSet.getString("PIN_VLD_DA_TX"))
                .CREAT_TS(resultSet.getString("CREAT_TS"))
                .LST_UPDT_TS(resultSet.getString("LST_UPDT_TS"))
                .TRANS_SRCE_NM(resultSet.getString("TRANS_SRCE_NM"))
                .TEMP_PIN_KEY_ID(resultSet.getString("TEMP_PIN_KEY_ID"))
                .TEMP_PIN_VLD_DA_TX(resultSet.getString("TEMP_PIN_VLD_DA_TX"))
                .build();

    }
}
