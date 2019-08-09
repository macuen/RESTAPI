package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CardTypeMapper implements RowMapper<CardType> {

    public CardType mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return CardType.builder()

        .CARD_TYPE_CD(resultSet.getString("CARD_TYPE_CD"))
        .CARD_TYPE_DS (resultSet.getString("CARD_TYPE_DS"))
        .CREAT_TS(resultSet.getString("CREAT_TS"))
        .LST_UPDT_TS(resultSet.getString("LST_UPDT_TS"))
        .build();
    }
}
