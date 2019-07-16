package com.aexp.esi.esiapi;

import javax.persistence.*;
import org.springframework.data.domain.Pageable;

//map Oracle DB tables
@Entity
@Table(name = "PLSTC_LVL_STA_CD") //CHANGE BASED ON USER INPUT

public class OracleMapping {

    public OracleMapping(){}
        @Id //mapping keys
        @Column(name = "STA_CD") //CHANGE BASED ON USER INPUT
        private String dbStatusCD;

        @Column(name = "PLSTC_NO") //CHANGE TO MAKE IT BASED ON USER INPUT
        private String dbAccounts;

        //constructor along with getters and setters
        public OracleMapping(String dbStatusCD){ this.setCode(dbStatusCD); }
        public String getCode(){ return dbStatusCD; }
        public void setCode(String dbStatusCD) {this.dbStatusCD = dbStatusCD;}

    @Override
    public String toString() {
        return "Account Info " +
                "[Status Code=" + dbStatusCD
                +", Account Number= " + dbAccounts +
                "]";
    }
}

