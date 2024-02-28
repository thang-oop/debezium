package com.win.cdc.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MoneyATM {

    @JsonProperty("TENDONVI")
    private String TENDONVI;

    @JsonProperty("LOAIMAY")
    private String LOAIMAY;

    @JsonProperty("MID")
    private String MID;

    @JsonProperty("TID")
    private String TID;

    @JsonProperty("ATMNAME")
    private String ATMNAME;

    @JsonProperty("IP")
    private String IP;

    @JsonProperty("DVTRIENKHAI")
    private String DVTRIENKHAI;

    @JsonProperty("DIACHI")
    private String DIACHI;

    @JsonProperty("PORT")
    private int PORT;

    @JsonProperty("TEL")
    private String TEL;

    @JsonProperty("EMAIL")
    private String EMAIL;

    @JsonProperty("THUMUC")
    private String THUMUC;

    @JsonProperty("USERNAME")
    private String USERNAME;

    @JsonProperty("STATUS")
    private String STATUS;

    @JsonProperty("PASSWORD")
    private String PASSWORD;

    @JsonProperty("STT")
    private int STT;

    @JsonProperty("BRANCHNAME")
    private String BRANCHNAME;

    @JsonProperty("REGION")
    private String REGION;

    @JsonProperty("SERIAL")
    private String SERIAL;

    @JsonProperty("STATUSDATE")
    private String STATUSDATE;

    @JsonProperty("PICTURE")
    private String PICTURE;

    @JsonProperty("STATUSATM")
    private String STATUSATM;

    @JsonProperty("TEL2")
    private String TEL2;

    @JsonProperty("TEL1")
    private String TEL1;

    @JsonProperty("LASTTRXN")
    private String LASTTRXN;

    @JsonProperty("PASSVNC")
    private String PASSVNC;

    @JsonProperty("CITY")
    private String CITY;

    @JsonProperty("ZIPCODE")
    private String ZIPCODE;

    @JsonProperty("NGAYTRIENKHAI")
    private String NGAYTRIENKHAI;

    @JsonProperty("KINHDO")
    private String KINHDO;

    @JsonProperty("TBLATM")
    private String TBLATM;

    @JsonProperty("VIDO")
    private String VIDO;

    @JsonProperty("READY_TIME")
    private String READY_TIME;

    @JsonProperty("LOAIHINHKD")
    private String LOAIHINHKD;
}
