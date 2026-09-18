package com.github.renatoguanabara.service;


import com.github.renatoguanabara.domain.Aluno;
import com.github.renatoguanabara.dto.CriarAlunoRequest;
import com.github.renatoguanabara.dto.CriarAlunoResponse;
import com.github.renatoguanabara.entity.AlunoEntity;
import com.github.renatoguanabara.mapper.AlunoMapper;
import com.github.renatoguanabara.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@AllArgsConstructor
public class AlunoService {

    private final AlunoRepository repository;
    private final AlunoMapper alunoMapper;




    @Transactional
    public CriarAlunoResponse criarMatricula (@RequestBody CriarAlunoRequest aluno) {

        //TODO: Implementar o mapper



        return new CriarAlunoResponse(aluno.nome());
    }

    @Transactional
    public Aluno salvarAluno(Aluno aluno) {
        // 1. Converte o objeto de Domínio para a Entidade do JPA
        AlunoEntity entity = alunoMapper.toEntity(aluno);

        // 2. Salva no banco de dados através do Repository
        AlunoEntity entitySalva = repository.save(entity);

        // 3. Converte a Entidade salva de volta para o Domínio e retorna
        return alunoMapper.toDomain(entitySalva);
    }

}
