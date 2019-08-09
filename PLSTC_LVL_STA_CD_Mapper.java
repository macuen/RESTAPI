package com.aexp.esi.esiapi.controller;


import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PLSTC_LVL_STA_CD_Mapper implements RowMapper<PLSTC_LVL_STA_CD> {

    @Override
    public PLSTC_LVL_STA_CD mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return PLSTC_LVL_STA_CD.builder()
                .PLSTC_NO(resultSet.getString("PLSTC_NO"))
                .STA_CD(resultSet.getString("STA_CD"))
                .NEG_ITEM_IN(resultSet.getString("NEG_ITEM_IN"))
                .AUTH_STA_IN(resultSet.getString("AUTH_STA_IN"))
                .PERMT_ITEM_IN(resultSet.getString("PERMT_ITEM_IN"))
                .CUST_LVL_NEG_IN(resultSet.getString("CUST_LVL_NEG_IN"))
                .PRG_DT(resultSet.getString("PRG_DT"))
                .RTN_DAY_NO(resultSet.getString("RTN_DAY_NO"))
                .RMT_NEG_DB_IN(resultSet.getString("RMT_NEG_DB_IN"))
                .PAN_SEQ_NO(resultSet.getString("PAN_SEQ_NO"))
                .REC_ADD_DT(resultSet.getString("REC_ADD_DT"))
                .EVENT_TS(resultSet.getString("EVENT_TS"))
                .LST_UPDT_TS(resultSet.getString("LST_UPDT_TS"))
                .LST_UPDT_USER_ID(resultSet.getString("LST_UPDT_USER_ID"))
                .build();

    }
}
