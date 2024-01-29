package com.win.cdc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Getter
//@Setter
//@Table(name = "customer")
public class Customer {
//    @Id
//    @Column(name = "id", nullable = false)
    private Long id;

//    @Column(name = "fullname", nullable = false)
    private String fullname;

//    @Column(name = "email", nullable = false)
    private String email;
}