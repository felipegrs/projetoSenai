package com.example.Projeto_Senai_Insano.model;

@Entity
public class PalavrasFeias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String feia;

    // getters e setters
}