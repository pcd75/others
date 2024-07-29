package com.nath.sma.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="fees")
public class Fees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    
    @Column(name="sui")
    private String sui;

    @Column(name="pmdate")
    @JsonFormat(pattern = "yyy-mm-dd HH:mm:ss")
    private Date pmdate;

    @Column(name="amount")
    private long amount;

    @Column(name="rest")
    private long rest;

    @Column(name="total")
    private long total;

    @Column(name="classe")
    private String classe;

    @Column(name="yearp")
    @JsonFormat(pattern = "yyyy")
    private Date yearp;

    @Column(name="fullname")
    private String fullname;

    public Fees(long id, long amount){
        this.amount = amount;
        this.id = id;
    }
}
