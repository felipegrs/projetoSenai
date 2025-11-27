package com.example.Projeto_Senai_Insano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class projetoSenaiController {
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

}
