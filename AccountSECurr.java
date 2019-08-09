package com.aexp.esi.esiapi.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountSECurr {

    public String CM_ACCT_NO;
    public String SE_NO;
    public String CURR_CD;
    public String TRANS_CT;
    public String TRANS_AM;
    public String LV420_EVENT_TS;
    public String LV420_LST_UPDT_TS;
    public String LV420_LST_UPDT_USER_ID;
}
