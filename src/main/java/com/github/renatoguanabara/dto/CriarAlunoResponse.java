package com.github.renatoguanabara.dto;

public record CriarAlunoResponse(
        Long matricula,
        String nome,
        boolean status
) {
}
