package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CidDAMapper implements RowMapper<CidDA> {

    public CidDA mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {
        return CidDA.builder()
                .CARD_PLSTC_NO(resultSet.getString("CARD_PLSTC_NO"))
                .CID_REC_CREAT_TS(resultSet.getString("CID_REC_CREAT_TS"))
                .CARD_ID_CD_EFF_DT(resultSet.getString("CARD_ID_CD_EFF_DT"))
                .CARD_ID_CD_EXPR_DT(resultSet.getString("CARD_ID_CD_EXPR_DT"))
                .CSC_GUID_KEY_ID(resultSet.getString("CSC_GUID_KEY_ID"))
                .GUID_IN(resultSet.getString("GUID_IN"))
                .CID_CREAT_DT(resultSet.getString("CID_CREAT_DT"))
                .CID_REC_PRG_TS(resultSet.getString("CID_REC_PRG_TS"))
                .REPL_CYC_CT(resultSet.getString("REPL_CYC_CT"))
                .CARD_REISS_IN(resultSet.getString("CARD_REISS_IN"))
                .CARD_TYPE_ID(resultSet.getString("CARD_TYPE_ID"))
                .SECR_TYPE_CD(resultSet.getString("SECR_TYPE_CD"))
                .CM_NM(resultSet.getString("CM_NM"))
                .CARD_REPL_RSN_CD(resultSet.getString("CARD_REPL_RSN_CD"))
                .CARD_DEACT_RSN_CD(resultSet.getString("CARD_DEACT_RSN_CD"))
                .STATE_MAIL_CD(resultSet.getString("STATE_MAIL_CD"))
                .CARD_ISS_TYPE_CD(resultSet.getString("CARD_ISS_TYPE_CD"))
                .INFLUENCE_ISS_IN(resultSet.getString("INFLUENCE_ISS_IN"))
                .CARD_EMB_TYPE_CD(resultSet.getString("CARD_EMB_TYPE_CD"))
                .CARD_REPL_DT(resultSet.getString("CARD_REPL_DT"))
                .L2160_EVENT_TS(resultSet.getString("L2160_EVENT_TS"))
                .L2160_LST_UPDT_TS(resultSet.getString("L2160_LST_UPDT_TS"))
                .L2160_LST_UPDT_USER_ID(resultSet.getString("L2160_LST_UPDT_USER_ID"))
                .SECR_CUST_ID_ENCRPT_CD(resultSet.getString("SECR_CUST_ID_ENCRPT_CD"))
                .SECR_CUST_ID_PROT_KEY_TX(resultSet.getString("SECR_CUST_ID_PROT_KEY_TX"))
                .SECR_5_DGT_CSC_ENCRPT_CD(resultSet.getString("SECR_5_DGT_CSC_ENCRPT_CD"))
                .SECR_5_DGT_CSC_PROT_KEY_TX(resultSet.getString("SECR_5_DGT_CSC_PROT_KEY_TX"))
                .SECR_4_DGT_CSC_ENCRPT_CD(resultSet.getString("SECR_4_DGT_CSC_ENCRPT_CD"))
                .SECR_4_DGT_CSC_PROT_KEY_TX(resultSet.getString("SECR_4_DGT_CSC_PROT_KEY_TX"))
                .SECR_3_DGT_CSC_ENCRPT_CD(resultSet.getString("SECR_3_DGT_CSC_ENCRPT_CD"))
                .SECR_3_DGT_CSC_PROT_KEY_TX(resultSet.getString("SECR_3_DGT_CSC_PROT_KEY_TX"))
        .build();
    }
}
