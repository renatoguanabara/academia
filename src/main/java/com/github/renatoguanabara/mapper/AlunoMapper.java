package com.github.renatoguanabara.mapper;


import com.github.renatoguanabara.dto.CriarAlunoRequest;
import com.github.renatoguanabara.dto.CriarAlunoResponse;
import com.github.renatoguanabara.entity.AlunoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface AlunoMapper {

    @Mapping(target = "nome", source = "name")
    CriarAlunoResponse toResponse(AlunoEntity alunoEntity);

    @Mapping(target = "name", source = "nome")
    AlunoEntity toEntity(CriarAlunoRequest criarAlunoRequest);




}
