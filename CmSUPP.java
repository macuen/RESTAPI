package com.aexp.esi.esiapi.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CmSUPP {

    public String CM_ACCT_NO;
    public String SUPP_NO;
    public String LMT_TYPE_CD;
    public String CAS_PROD_LIT_CD;
    public String SCND_PROD_CD;
    public String TEMP_SCND_PROD_CD;
    public String TEMP_SCND_PROD_CD_EXPR_DT;
    public String GLBL_LMT_PROD_CD;
    public String GLBL_LMT_PROD_CD_EXEC_ID;
    public String PRIM_PROD_CD;
    public String GLBL_LMT_SWAP_CD;
    public String PROD_SERVICER_CD;
    public String ISO_CTRY_CD;
    public String ISO_CURR_CD;
    public String TEMP_LMT_STRT_DT;
    public String TEMP_LMT_EXPR_DT;
    public String GLOS_ACCT_IN;
    public String AUTH_ACCT_LVL_IN;
    public String USD_CARD_X0X4_ORIG_CTRY_CD;
    public String LOC_SUBKEY_IN;
    public String PERMT_LOC_HOME_LMT_AM;
    public String PERMT_LOC_TRVL_LMT_AM;
    public String PERMT_LOC_EXPSR_LMT_AM;
    public String TEMP_LOC_HOME_LMT_AM;
    public String TEMP_LOC_TRVL_LMT_AM;
    public String CHRG_ON_LEND_IN;
    public String PERMT_CHRG_ON_LEND_HME_LMT_AM;
    public String PERMT_CHRG_ON_LEND_TRV_LMT_AM;
    public String TEMP_CHRG_ON_LEND_HME_LMT_AM;
    public String TEMP_CHRG_ON_LEND_TRVL_LMT_AM;
    public String L21A7_EVENT_TS;
    public String L21A7_LST_UPDT_TS;
    public String L21A7_LST_UPDT_USER_ID;
    public String EXEC_CARD_REC_CREAT_DT;
    public String EXEC_CARD_ID;
    public String EXEC_CM_SWAP_CD;
    public String EXEC_CM_PROD_SRVC_CD;
    public String EXEC_CM_TRI_PROD_CD;
    public String EXEC_CM_PRIM_PROD_TYPE_CD;
    public String EXEC_CM_PRIM_PROD_COL_CD;
    public String L2193_EVENT_TS;
    public String L2193_LST_UPDT_TS;
    public String L2193_LST_UPDT_USER_ID;
    public String CUST_CB_SCORE_NO;
    public String ACCT_MNTR_REC_ADD_DT;
    public String MO_SINCE_FL_DT_CT;
    public String UNSOL_INQ_CT;
    public String L2675_LST_UPDT_TS;
    public String L2675_LST_UPDT_USER_ID;
    public String L2675_EVENT_TS;

}
