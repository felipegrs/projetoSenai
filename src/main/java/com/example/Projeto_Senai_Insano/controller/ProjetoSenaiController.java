package com.example.Projeto_Senai_Insano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjetoSenaiController {
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

}
