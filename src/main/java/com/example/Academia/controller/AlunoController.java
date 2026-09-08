package com.example.Academia.controller;

import com.example.Academia.model.Aluno;
import com.example.Academia.service.AlunoService;

import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;

@RestController()
@RequestMapping("/aluno")
@AllArgsConstructor
public class AlunoController {

    private final AlunoService service;


    @PostMapping
    public Aluno criarMatricula (@RequestBody Aluno aluno) {
        return service.criaMatricula(aluno);
    }

    @GetMapping("/{id}")
    public Aluno buscaDadosAluno (@PathVariable Long id){
        return service.consultaDadosAluno(id);
    }

    @GetMapping("/status/{id}")
    public String buscaStatusAluno (@PathVariable Long id){
        return service.consultaStatus(id);
    }
}
