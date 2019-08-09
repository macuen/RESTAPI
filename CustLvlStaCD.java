package com.aexp.esi.esiapi.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustLvlStaCD {

    public String CUST_SEQ_NO;
    public String QLFY_DB_ID_AND_CHK_DGT_NO;
    public String CUST_CURR_CD;
    public String STA_CD;
    public String NEG_ITEM_IN;
    public String AUTH_STA_IN;
    public String PERMT_ITEM_IN;
    public String CUST_LVL_NEG_IN;
    public String PRG_DT;
    public String RTN_DAY_NO;
    public String PROD_CD;
    public String REC_ADD_DT;
    public String EVENT_TS;
    public String LST_UPDT_TS;
    public String LST_UPDT_USER_ID;
    public String ACCT_LVL_ITEM_ADD_VIA_SUPT_IN;
    public String ACCT_LVL_ITEM_IS_CSBS_IN;
}
