package com.example.Projeto_Senai_Insano.controller;

import com.example.Projeto_Senai_Insano.model.PalavrasFeias;
import com.example.Projeto_Senai_Insano.repository.PalavrasFeiasRepository;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RestController
@RequestMapping("/api/palavroes")
public class PalavrasFeiasController {

    @Autowired
    private PalavrasFeiasRepository repo;

    @GetMapping
    public List<PalavrasFeias> listar() {
        return repo.findAll();
    }
}