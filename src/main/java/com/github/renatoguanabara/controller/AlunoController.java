package com.github.renatoguanabara.controller;


import com.github.renatoguanabara.dto.CriarAlunoRequest;
import com.github.renatoguanabara.dto.CriarAlunoResponse;
import com.github.renatoguanabara.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/v1/alunos")
@AllArgsConstructor
public class AlunoController {

    private final AlunoService service;


    @PostMapping
    public ResponseEntity<CriarAlunoResponse> criarMatricula (@RequestBody CriarAlunoRequest aluno) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criarMatricula(aluno));
    }

//    @GetMapping("/{id}")
//    public Aluno buscaDadosAluno (@PathVariable Long id){
//        return service.consultaDadosAluno(id);
//    }
//
//    @GetMapping("/status/{id}")
//    public String buscaStatusAluno (@PathVariable Long id){
//        return service.consultaStatus(id);
//    }
}
