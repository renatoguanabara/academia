package com.github.renatoguanabara.controller;


import com.github.renatoguanabara.api.AlunoApi;
import com.github.renatoguanabara.domain.Aluno;
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


//    @PostMapping
//    public ResponseEntity<CriarAlunoResponse> criarMatricula (@RequestBody CriarAlunoRequest aluno) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.criarMatricula(aluno));
//    }

    @PostMapping
    public ResponseEntity<CriarAlunoResponse> criarMatricula(@RequestBody CriarAlunoRequest request) {
        // 1. Converte DTO de entrada -> Domínio
        Aluno aluno = alunoMapper.toDomain(request);

        // 2. Executa a regra de negócio/salvamento na Service
        Aluno alunoSalvo = alunoService.salvarAluno(aluno);

        // 3. Converte Domínio -> DTO de resposta e devolve HTTP 201
        CriarAlunoResponse response = alunoMapper.toResponse(alunoSalvo);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
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
