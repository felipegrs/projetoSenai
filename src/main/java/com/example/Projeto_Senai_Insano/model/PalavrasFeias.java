package com.example.Projeto_Senai_Insano.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name= "palavras_feias")
public class PalavrasFeias {

    public PalavrasFeias() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String feia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFeia() {
        return feia;
    }

    public void setFeia(String feia) {
        this.feia = feia;
    }
}