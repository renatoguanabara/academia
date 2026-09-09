package com.github.renatoguanabara.dto;

import com.github.renatoguanabara.enums.TipoObjetivo;
import com.github.renatoguanabara.enums.TipoPlano;

public record CriarAlunoRequest(
         String nome,
         String telefone,
         TipoObjetivo objetivo,
         String cpf,
         TipoPlano plano
        ) {
}
