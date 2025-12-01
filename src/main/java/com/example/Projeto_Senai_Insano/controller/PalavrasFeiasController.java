package com.example.Projeto_Senai_Insano.controller;

@RestController
@RequestMapping("/api/palavrões")
public class PalavrasFeiasController {

    @Autowired
    private PalavrasFeiasRepository repo;

    @GetMapping
    public List<PalavrasFeias> listar() {
        return repo.findAll();
    }
}