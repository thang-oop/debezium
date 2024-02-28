package com.win.cdc.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    @JsonProperty
    private Long ID;
    @JsonProperty
    private String TIME_START;
    @JsonProperty
    private String CHANNEL;
    @JsonProperty
    private String DESC_;
    @JsonProperty
    private String SMS_STATUS;
    @JsonProperty
    private String SMS_DATE;
    @JsonProperty
    private String EMAIL_STATUS;
    @JsonProperty
    private String EMAIL_DATE;
    @JsonProperty
    private String TEL;
}