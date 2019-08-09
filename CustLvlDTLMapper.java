package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustLvlDTLMapper implements RowMapper<CustLvlDTL>{

    public CustLvlDTL mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return CustLvlDTL.builder()
                .CUST_SEQ_NO(resultSet.getString("CUST_SEQ_NO"))
                .QLFY_DB_ID_AND_CHK_DGT_NO(resultSet.getString("QLFY_DB_ID_AND_CHK_DGT_NO"))
                .CUST_CURR_CD(resultSet.getString("CUST_CURR_CD"))
                .MDF_CUST_TENURE_NO(resultSet.getString("MDF_CUST_TENURE_NO"))
                .CUST_UNIV_SCORE_NO(resultSet.getString("CUST_UNIV_SCORE_NO"))
                .LOCAL_CURR_CUST_INCOM_AM(resultSet.getString("LOCAL_CURR_CUST_INCOM_AM"))
                .CUST_CANC_RSN_CD(resultSet.getString("CUST_CANC_RSN_CD"))
                .CUST_SUBPRIME_SEG_KEY_ID(resultSet.getString("CUST_SUBPRIME_SEG_KEY_ID"))
                .L2666_EVENT_TS(resultSet.getString("L2666_EVENT_TS"))
                .L2666_LST_UPDT_TS(resultSet.getString("L2666_LST_UPDT_TS"))
                .L2666_LST_UPDT_USER_ID(resultSet.getString("L2666_LST_UPDT_USER_ID"))
                .L2667_EVENT_TS(resultSet.getString("L2667_EVENT_TS"))
                .L2667_LST_UPDT_TS(resultSet.getString("L2667_LST_UPDT_TS"))
                .L2667_LST_UPDT_USER_ID(resultSet.getString("L2667_LST_UPDT_USER_ID"))
                .L266A_EVENT_TS(resultSet.getString("L266A_EVENT_TS"))
                .L266A_LST_UPDT_TS(resultSet.getString("L266A_LST_UPDT_TS"))
                .L266A_LST_UPDT_USER_ID(resultSet.getString("L266A_LST_UPDT_USER_ID"))
                .TOT_OUTST_DFR_BAL_AM(resultSet.getString("TOT_OUTST_DFR_BAL_AM"))
                .TOT_OUTST_PLANN_CHRG_PROD_AM(resultSet.getString("TOT_OUTST_PLANN_CHRG_PROD_AM"))
                .TOT_OUTST_DFR_CHRG_PROD_AM(resultSet.getString("TOT_OUTST_DFR_CHRG_PROD_AM"))
                .L26B1_EVENT_TS(resultSet.getString("L26B1_EVENT_TS"))
                .L26B1_LST_UPDT_TS(resultSet.getString("L26B1_LST_UPDT_TS"))
                .L26B1_LST_UPDT_USER_ID(resultSet.getString("L26B1_LST_UPDT_USER_ID"))
                .CCSG_CHRG_ACCT_MAX_PYMT_AM(resultSet.getString("CCSG_CHRG_ACCT_MAX_PYMT_AM"))
                .CCSG_AVG_PYMT_12_MO_AM(resultSet.getString("CCSG_AVG_PYMT_12_MO_AM"))
                .OPEN_CHRG_AVG_PYMT_12_MO_AM(resultSet.getString("OPEN_CHRG_AVG_PYMT_12_MO_AM"))
                .CUST_GOOD_PYMT_AM(resultSet.getString("CUST_GOOD_PYMT_AM"))
                .L2794_EVENT_TS(resultSet.getString("L2794_EVENT_TS"))
                .L2794_LST_UPDT_TS(resultSet.getString("L2794_LST_UPDT_TS"))
                .L2794_LST_UPDT_USER_ID(resultSet.getString("L2794_LST_UPDT_USER_ID"))
                .INQ_PAST_30_DAY_CT(resultSet.getString("INQ_PAST_30_DAY_CT"))
                .L2785_EVENT_TS(resultSet.getString("L2785_EVENT_TS"))
                .L2785_LST_UPDT_TS(resultSet.getString("L2785_LST_UPDT_TS"))
                .L2785_LST_UPDT_USER_ID(resultSet.getString("L2785_LST_UPDT_USER_ID"))
                .CUST_FIRST_PYMT_IN(resultSet.getString("CUST_FIRST_PYMT_IN"))
                .CUST_PYMT_7_DAY_AM(resultSet.getString("CUST_PYMT_7_DAY_AM"))
                .CUST_PYMT_CT(resultSet.getString("CUST_PYMT_CT"))
                .L2790_EVENT_TS(resultSet.getString("L2790_EVENT_TS"))
                .L2790_LST_UPDT_TS(resultSet.getString("L2790_LST_UPDT_TS"))
                .L2790_LST_UPDT_USER_ID(resultSet.getString("L2790_LST_UPDT_USER_ID"))
                .RTRN_AM(resultSet.getString("RTRN_AM"))
                .CUST_RTRN_AVG_PYMT_RT_NO(resultSet.getString("CUST_RTRN_AVG_PYMT_RT_NO"))
                .LST_RTRN_DT(resultSet.getString("LST_RTRN_DT"))
                .CUST_RTRN_CT(resultSet.getString("CUST_RTRN_CT"))
                .L2791_EVENT_TS(resultSet.getString("L2791_EVENT_TS"))
                .L2791_LST_UPDT_TS(resultSet.getString("L2791_LST_UPDT_TS"))
                .L2791_LST_UPDT_USER_ID(resultSet.getString("L2791_LST_UPDT_USER_ID"))
                .MAX_SALE_PRC_MTGE_TAX_AM(resultSet.getString("MAX_SALE_PRC_MTGE_TAX_AM"))
                .L26C0_EVENT_TS(resultSet.getString("L26C0_EVENT_TS"))
                .L26C0_LST_UPDT_TS(resultSet.getString("L26C0_LST_UPDT_TS"))
                .L26C0_LST_UPDT_USER_ID(resultSet.getString("L26C0_LST_UPDT_USER_ID"))
                .SOW_TOT_ANNUAL_SPEND_AM(resultSet.getString("SOW_TOT_ANNUAL_SPEND_AM"))
                .L267B_EVENT_TS(resultSet.getString("L267B_EVENT_TS"))
                .L267B_LST_UPDT_TS(resultSet.getString("L267B_LST_UPDT_TS"))
                .L267B_LST_UPDT_USER_ID(resultSet.getString("L267B_LST_UPDT_USER_ID"))
                .CUST_CB_SCORE_NO(resultSet.getString("CUST_CB_SCORE_NO"))
                .ACCT_MNTR_REC_ADD_DT(resultSet.getString("ACCT_MNTR_REC_ADD_DT"))
                .MO_SINCE_FL_DT_CT(resultSet.getString("MO_SINCE_FL_DT_CT"))
                .UNSOL_INQ_CT(resultSet.getString("UNSOL_INQ_CT"))
                .L2675_LST_UPDT_TS(resultSet.getString("L2675_LST_UPDT_TS"))
                .L2675_LST_UPDT_USER_ID(resultSet.getString("L2675_LST_UPDT_USER_ID"))
                .L2675_EVENT_TS(resultSet.getString("L2675_EVENT_TS"))
                 .build();

    }
}
