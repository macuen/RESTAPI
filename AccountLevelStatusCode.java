package com.aexp.esi.esiapi.controller;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountLevelStatusCode {

    public String ACCT_NO;
    public String STA_CD;
    public String NEG_ITEM_IN;
    public String AUTH_STA_IN;
    public String PERMT_ITEM_IN;
    public String CUST_LVL_NEG_IN;
    public String PRG_DT;
    public String RTN_DAY_NO;
    public String RMT_NEG_DB_IN;
    public String PAN_SEQ_NO;
    public String REC_ADD_DT;
    public String EVENT_TS;
    public String LST_UPDT_TS;
    public String LST_UPDT_USER_ID;

}
