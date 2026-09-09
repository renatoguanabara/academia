package com.github.renatoguanabara.service;


import com.github.renatoguanabara.dto.CriarAlunoRequest;
import com.github.renatoguanabara.dto.CriarAlunoResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@AllArgsConstructor
public class AlunoService {

    //private final AlunoRepository repository;


    @Transactional
    public CriarAlunoResponse criarMatricula (CriarAlunoRequest aluno) {

        return new CriarAlunoResponse(101010L, aluno.nome(), true);
    }


}
