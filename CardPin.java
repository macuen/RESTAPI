package com.aexp.esi.esiapi.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CardPin {

    public String CARD_NO;
    public String CARD_TYPE_CD;
    public String KEY_ID;
    public String PIN_OFS_NO;
    public String LST_USED_TS;
    public String TEMP_PIN_OFS_NO;
    public String TEMP_PIN_CREAT_TS;
    public String CARD_PIN_USAGE_TYPE_CD;
    public String ACTL_PIN_DGT_CT;
    public String PIN_VLD_DA_TX;
    public String CREAT_TS;
    public String LST_UPDT_TS;
    public String TRANS_SRCE_NM;
    public String TEMP_PIN_KEY_ID;
    public String TEMP_PIN_VLD_DA_TX;

}
