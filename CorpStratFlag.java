package com.aexp.esi.esiapi.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CorpStratFlag {

    public String CTRY_CD;
    public String CORP_NO;
    public String CURR_CD;
    public String LST_UPDT_TS;
    public String STRAT_FLAG_CODE1;
    public String STRAT_FLAG_CODE2;
    public String STRAT_FLAG_CODE3;
    public String STRAT_FLAG_CODE4;
    public String L2C50_EVENT_TS;
    public String L2C50_LST_UPDT_TS;
    public String L2C50_LST_UPDT_USER_ID;

}
