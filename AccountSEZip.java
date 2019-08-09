package com.aexp.esi.esiapi.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountSEZip {

    public String CM_ACCT_NO;
    public String SE_NO;
    public String ZIP_CD;
    public String TRANS_CT;
    public String TRANS_AM;
    public String LV320_EVENT_TS;
    public String LV320_LST_UPDT_TS;
    public String LV320_LST_UPDT_USER_ID;
}
