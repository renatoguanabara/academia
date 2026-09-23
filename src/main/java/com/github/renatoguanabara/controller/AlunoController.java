package com.github.renatoguanabara.controller;


import com.github.renatoguanabara.api.AlunoApi;
import com.github.renatoguanabara.dto.CriarAlunoRequest;
import com.github.renatoguanabara.dto.CriarAlunoResponse;
import com.github.renatoguanabara.mapper.AlunoMapper;
import com.github.renatoguanabara.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/v1/alunos")
@AllArgsConstructor
public class AlunoController implements AlunoApi {

    private final AlunoService alunoService;
    private final AlunoMapper alunoMapper;


    @PostMapping
    public ResponseEntity<CriarAlunoResponse> criarMatricula(@RequestBody CriarAlunoRequest request) {

        CriarAlunoResponse response = alunoService.salvarAluno(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
