package com.aexp.esi.esiapi.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthTransHistory {

    public String CM_ACCT_NO;
    public String REPL_DGT_NO;
    public String SUPP_DGT_NO;
    public String CHK_DGT_NO;
    public String TRANS_TS;
    public String DERIV_RSLV_CD;
    public String CUST_SEQ_NO;
    public String QLFY_DB_ID_AND_CHK_DGT_NO;
    public String GRMS_CURR_CD;
    public String SHOW_EXPR_TS;
    public String BPP_EPP_TRANS_IN;
    public String TOKN_NO;
    public String TRANS_RVS_IN;
    public String RVS_TS;
    public String TRANS_MODE_IN;
    public String SE_PREV_VISIT_30_DAY_IN;
    public String TRANS_IN_USD_AM;
    public String RSLV_CD;
    public String MER_TYPE_CD;
    public String MER_NO;
    public String PRE_AUTH_ADJ_AM_IN;
    public String ORIG_AM_BEFORE_ADJ_IN_USD_AM;
    public String ADJ_TS;
    public String SE_CAP_NO;
    public String TRANS_CURR_CD;
    public String TRANS_ID;
    public String TRANS_SRCE_WCT_IN;
    public String TRANS_SRCE_ESI_IN;
    public String FRGN_TRANS_IN;
    public String DROP_DT_FOR_FLEX_AGE_DT;
    public String ZERO_DAY_ACCUM_IN;
    public String RVS_OR_ADJ_TRANS_ID;
    public String MINILOG_L2850_EVENT_TS;
    public String MINILOG_L2850_LST_UPDT_TS;
    public String MINILOG_L2850_LST_UPDT_USER_ID;
}
