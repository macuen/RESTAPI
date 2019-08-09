package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CmSUPPMapper implements RowMapper<CmSUPP> {

    public CmSUPP mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return CmSUPP.builder()
                .CM_ACCT_NO(resultSet.getString("CM_ACCT_NO"))
                .SUPP_NO(resultSet.getString("SUPP_NO"))
                .LMT_TYPE_CD(resultSet.getString("LMT_TYPE_CD"))
                .CAS_PROD_LIT_CD(resultSet.getString("CAS_PROD_LIT_CD"))
                .SCND_PROD_CD(resultSet.getString("SCND_PROD_CD"))
                .TEMP_SCND_PROD_CD(resultSet.getString("TEMP_SCND_PROD_CD"))
                .TEMP_SCND_PROD_CD_EXPR_DT(resultSet.getString("TEMP_SCND_PROD_CD_EXPR_DT"))
                .GLBL_LMT_PROD_CD(resultSet.getString("GLBL_LMT_PROD_CD"))
                .GLBL_LMT_PROD_CD_EXEC_ID(resultSet.getString("GLBL_LMT_PROD_CD_EXEC_ID"))
                .PRIM_PROD_CD(resultSet.getString("PRIM_PROD_CD"))
                .GLBL_LMT_SWAP_CD(resultSet.getString("GLBL_LMT_SWAP_CD"))
                .PROD_SERVICER_CD(resultSet.getString("PROD_SERVICER_CD"))
                .ISO_CTRY_CD(resultSet.getString("ISO_CTRY_CD"))
                .ISO_CURR_CD(resultSet.getString("ISO_CURR_CD"))
                .TEMP_LMT_STRT_DT(resultSet.getString("TEMP_LMT_STRT_DT"))
                .TEMP_LMT_EXPR_DT(resultSet.getString("TEMP_LMT_EXPR_DT"))
                .GLOS_ACCT_IN(resultSet.getString("GLOS_ACCT_IN"))
                .AUTH_ACCT_LVL_IN(resultSet.getString("AUTH_ACCT_LVL_IN"))
                .USD_CARD_X0X4_ORIG_CTRY_CD(resultSet.getString("USD_CARD_X0X4_ORIG_CTRY_CD"))
                .LOC_SUBKEY_IN(resultSet.getString("LOC_SUBKEY_IN"))
                .PERMT_LOC_HOME_LMT_AM(resultSet.getString(""))
                .PERMT_LOC_TRVL_LMT_AM(resultSet.getString(""))
                .PERMT_LOC_EXPSR_LMT_AM(resultSet.getString(""))
                .TEMP_LOC_HOME_LMT_AM(resultSet.getString(""))
                .TEMP_LOC_TRVL_LMT_AM(resultSet.getString(""))
                .CHRG_ON_LEND_IN(resultSet.getString(""))
                .PERMT_CHRG_ON_LEND_HME_LMT_AM(resultSet.getString(""))
                .PERMT_CHRG_ON_LEND_TRV_LMT_AM(resultSet.getString(""))
                .TEMP_CHRG_ON_LEND_HME_LMT_AM(resultSet.getString(""))
                .TEMP_CHRG_ON_LEND_TRVL_LMT_AM(resultSet.getString(""))
                .L21A7_EVENT_TS(resultSet.getString(""))
                .L21A7_LST_UPDT_TS(resultSet.getString(""))
                .L21A7_LST_UPDT_USER_ID(resultSet.getString(""))
                .EXEC_CARD_REC_CREAT_DT(resultSet.getString(""))
                .EXEC_CARD_ID(resultSet.getString(""))
                .EXEC_CM_SWAP_CD(resultSet.getString(""))
                .EXEC_CM_PROD_SRVC_CD(resultSet.getString(""))
                .EXEC_CM_TRI_PROD_CD(resultSet.getString(""))
                .EXEC_CM_PRIM_PROD_TYPE_CD(resultSet.getString(""))
                .EXEC_CM_PRIM_PROD_COL_CD(resultSet.getString(""))
                .L2193_EVENT_TS(resultSet.getString(""))
                .L2193_LST_UPDT_TS(resultSet.getString(""))
                .L2193_LST_UPDT_USER_ID(resultSet.getString(""))
                .CUST_CB_SCORE_NO(resultSet.getString(""))
                .ACCT_MNTR_REC_ADD_DT(resultSet.getString(""))
                .MO_SINCE_FL_DT_CT(resultSet.getString(""))
                .UNSOL_INQ_CT(resultSet.getString(""))
                .L2675_LST_UPDT_TS(resultSet.getString(""))
                .L2675_LST_UPDT_USER_ID(resultSet.getString(""))
                .L2675_EVENT_TS(resultSet.getString(""))

        .build();

    }
}
