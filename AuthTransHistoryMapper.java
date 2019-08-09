package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthTransHistoryMapper implements RowMapper<AuthTransHistory> {

    public AuthTransHistory mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return AuthTransHistory.builder()
                .CM_ACCT_NO(resultSet.getString("CM_ACCT_NO"))
                .REPL_DGT_NO(resultSet.getString("REPL_DGT_NO"))
                .SUPP_DGT_NO(resultSet.getString("SUPP_DGT_NO"))
                .CHK_DGT_NO(resultSet.getString("CHK_DGT_NO"))
                .TRANS_TS(resultSet.getString("TRANS_TS"))
                .DERIV_RSLV_CD(resultSet.getString("DERIV_RSLV_CD"))
                .CUST_SEQ_NO(resultSet.getString("CUST_SEQ_NO"))
                .QLFY_DB_ID_AND_CHK_DGT_NO(resultSet.getString("QLFY_DB_ID_AND_CHK_DGT_NO"))
                .GRMS_CURR_CD(resultSet.getString("GRMS_CURR_CD"))
                .SHOW_EXPR_TS(resultSet.getString("SHOW_EXPR_TS"))
                .BPP_EPP_TRANS_IN(resultSet.getString("BPP_EPP_TRANS_IN"))
                .TOKN_NO(resultSet.getString("TOKN_NO"))
                .TRANS_RVS_IN(resultSet.getString("TRANS_RVS_IN"))
                .RVS_TS(resultSet.getString("RVS_TS"))
                .TRANS_MODE_IN(resultSet.getString("TRANS_MODE_IN"))
                .SE_PREV_VISIT_30_DAY_IN(resultSet.getString("SE_PREV_VISIT_30_DAY_IN"))
                .TRANS_IN_USD_AM(resultSet.getString("TRANS_IN_USD_AM"))
                .RSLV_CD(resultSet.getString("RSLV_CD"))
                .MER_TYPE_CD(resultSet.getString("MER_TYPE_CD"))
                .MER_NO(resultSet.getString("MER_NO"))
                .PRE_AUTH_ADJ_AM_IN(resultSet.getString("PRE_AUTH_ADJ_AM_IN"))
                .ORIG_AM_BEFORE_ADJ_IN_USD_AM(resultSet.getString("ORIG_AM_BEFORE_ADJ_IN_USD_AM"))
                .ADJ_TS(resultSet.getString("ADJ_TS"))
                .SE_CAP_NO(resultSet.getString("SE_CAP_NO"))
                .TRANS_CURR_CD(resultSet.getString("TRANS_CURR_CD"))
                .TRANS_ID(resultSet.getString("TRANS_ID"))
                .TRANS_SRCE_WCT_IN(resultSet.getString("TRANS_SRCE_WCT_IN"))
                .TRANS_SRCE_ESI_IN(resultSet.getString("TRANS_SRCE_ESI_IN"))
                .FRGN_TRANS_IN(resultSet.getString("FRGN_TRANS_IN"))
                .DROP_DT_FOR_FLEX_AGE_DT(resultSet.getString("DROP_DT_FOR_FLEX_AGE_DT"))
                .ZERO_DAY_ACCUM_IN(resultSet.getString("ZERO_DAY_ACCUM_IN"))
                .RVS_OR_ADJ_TRANS_ID(resultSet.getString("RVS_OR_ADJ_TRANS_ID"))
                .MINILOG_L2850_EVENT_TS(resultSet.getString("MINILOG_L2850_EVENT_TS"))
                .MINILOG_L2850_LST_UPDT_TS(resultSet.getString("MINILOG_L2850_LST_UPDT_TS"))
                .MINILOG_L2850_LST_UPDT_USER_ID(resultSet.getString("MINILOG_L2850_LST_UPDT_USER_ID"))
                .build();

    }
}
