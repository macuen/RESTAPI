package com.aexp.esi.esiapi.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CidDA {

    public String CARD_PLSTC_NO;
    public String CID_REC_CREAT_TS;
    public String CARD_ID_CD_EFF_DT;
    public String CARD_ID_CD_EXPR_DT;
    public String CSC_GUID_KEY_ID;
    public String GUID_IN;
    public String CID_CREAT_DT;
    public String CID_REC_PRG_TS;
    public String REPL_CYC_CT;
    public String CARD_REISS_IN;
    public String CARD_TYPE_ID;
    public String SECR_TYPE_CD;
    public String CM_NM;
    public String CARD_REPL_RSN_CD;
    public String CARD_DEACT_RSN_CD;
    public String STATE_MAIL_CD;
    public String CARD_ISS_TYPE_CD;
    public String INFLUENCE_ISS_IN;
    public String CARD_EMB_TYPE_CD;
    public String CARD_REPL_DT;
    public String L2160_EVENT_TS;
    public String L2160_LST_UPDT_TS;
    public String L2160_LST_UPDT_USER_ID;
    public String SECR_CUST_ID_ENCRPT_CD;
    public String SECR_CUST_ID_PROT_KEY_TX;
    public String SECR_5_DGT_CSC_ENCRPT_CD;
    public String SECR_5_DGT_CSC_PROT_KEY_TX;
    public String SECR_4_DGT_CSC_ENCRPT_CD;
    public String SECR_4_DGT_CSC_PROT_KEY_TX;
    public String SECR_3_DGT_CSC_ENCRPT_CD;
    public String SECR_3_DGT_CSC_PROT_KEY_TX;
}
