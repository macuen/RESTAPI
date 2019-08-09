package com.aexp.esi.esiapi.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CardType {
    public String CARD_TYPE_CD;
    public String CARD_TYPE_DS;
    public String CREAT_TS;
    public String LST_UPDT_TS;
}
