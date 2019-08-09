package com.aexp.esi.esiapi.controller;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountFlexVariables {

    public String CARD_ACCT_NO;
    public String STA_TYPE_CD;
    public String STA_LVL_CD;
    public String PRG_DT;
    public String ADD_DT;
    public String ITEM_ADD_DT;
    public String PAN_SEQ_NO;
    public String DPAN_IN;
    public String CASM_IN;
    public String STA_CD;
    public String PLSTC_NO;
    public String RTN_PER_DAY_NO;
    public String TRANS_SRCE_CD;
    public String TRANS_ADD_SRCE_ID;
    public String TRANS_DEL_SRCE_ID;
    public String NEW_PRG_TS;
    public String LJ255_EVENT_TS;
    public String LJ255_LST_UPDT_TS;
    public String LJ255_LST_UPDT_USER_ID;

}
