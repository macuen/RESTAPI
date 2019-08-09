package com.aexp.esi.esiapi.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CmSe {

    public String CM_ACCT_NO;
    public String SUPP_NO;
    public String SE_NO;
    public String SRCE_TYPE_CD;
    public String PRG_DT;
    public String CM_SE_DA_PRG_DT;
    public String L21B0_EVENT_TS;
    public String L21B0_LST_UPDT_TS;
    public String L21B0_LST_UPDT_USER_ID;
}
