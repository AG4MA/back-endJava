package com.example.alessandro.models.entities;

import jakarta.persistence.*;

import java.util.List;
/*
@Entity(name = "reportcodes")*/
public class ReportCode {
/*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private long id;

    private String key;
/*
    @ElementCollection*/
    private List<String> value;

    public ReportCode(){}

    public ReportCode(String key, List<String> value){
        this.key = key;/*
        this.value = value;*/
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ReportCode{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
