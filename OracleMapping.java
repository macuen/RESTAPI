package com.aexp.esi.esiapi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class OracleMapping {

    private String TableName;
    private String Field;
    private String NumOfItems;
    private String negCode;
    private String dbStatusCD;
    private String dbAccounts;
    private int rtnGreaterThan;
    private int rtnLessThan;

    public OracleMapping() {
    }
}
