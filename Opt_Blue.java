package com.aexp.esi.esiapi.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Opt_Blue {

    public String AGGR_SE_NO;
    public String SELL_ID;
    public String SELL_SE_NO;
    public String LGCY_SE_NO;
    public String L0C80_EVENT_TS;
    public String L0C80_LST_UPDT_TS;
    public String L0C80_LST_UPDT_USER_ID;
}
