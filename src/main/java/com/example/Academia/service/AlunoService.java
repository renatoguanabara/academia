package com.example.Academia.service;

import com.example.Academia.model.Aluno;
import com.example.Academia.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class AlunoService {

    private final AlunoRepository repository;

    private void validarAluno(Aluno aluno){
        if(aluno == null){
            throw new IllegalArgumentException("Aluno invalido! Nao pode ter campo nulo.");
        }

        if(aluno.getNome() == null || aluno.getNome().isBlank()){
            throw new IllegalArgumentException("Aluno invalido! Nao pode ter nome nulo.");
        }

        //TODO: Add todas as validacoes.Terminar o validar.



    }
    @Transactional
    public Aluno criaMatricula(Aluno aluno){
        validarAluno(aluno);
        return repository.save(aluno);
    }

    public Aluno consultaDadosAluno(Long id){
        return repository.getReferenceById(id);
    }

    public String consultaStatus(Long id){
        return repository.getReferenceById(id).getStatus().toString();
    }

}
