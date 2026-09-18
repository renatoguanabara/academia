package com.github.renatoguanabara.mapper;

import com.github.renatoguanabara.domain.Aluno;
import com.github.renatoguanabara.dto.CriarAlunoRequest;
import com.github.renatoguanabara.dto.CriarAlunoResponse;
import com.github.renatoguanabara.entity.AlunoEntity;
import org.springframework.stereotype.Component;

@Component
public class AlunoMapper {

    public AlunoEntity toEntity(Aluno aluno){
        if (aluno == null){
            return null;
        }

        AlunoEntity alunoEntity = new AlunoEntity();
        alunoEntity.setCpf(alunoEntity.getCpf());
        alunoEntity.setName(aluno.getName());
        alunoEntity.setId(alunoEntity.getId());


        return alunoEntity;
    }



    public Aluno toDomain(AlunoEntity alunoEntity){
        if (alunoEntity == null){
            return null;
        }

        return new Aluno(alunoEntity.getId(), alunoEntity.getName(), alunoEntity.getCpf());

    }



    public Aluno toDomain(CriarAlunoRequest request) {
        if (request == null) return null;

        return new Aluno(
                null,
                request.nome(),
                "41257957899"

        );
    }

    public CriarAlunoResponse toResponse(Aluno aluno){
        if (aluno == null){
            return null;
        }

        return new CriarAlunoResponse(aluno.getName());
    }




}
