package com.example.alessandro.models.entities;

import com.example.alessandro.models.DTO.ReportCodeDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "reportcodes")
@Data
@NoArgsConstructor
public class ReportCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String identifier;

    private List<String> valore;

    public ReportCode(String identifier, List<String> valore){
        this.identifier = identifier;
        this.valore = valore;
    }

    public ReportCodeDTO map(){
        return new ReportCodeDTO(
                this.id,
                this.identifier,
                this.valore
        );
    }



}


/*
lombok dependency
@data --- getter and setter
@noargsconstructor -- constructor base


REcord annotation
public record entityWithRecord --- tutto*/
