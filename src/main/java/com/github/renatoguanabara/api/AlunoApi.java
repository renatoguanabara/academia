package com.github.renatoguanabara.api;

import com.github.renatoguanabara.dto.CriarAlunoRequest;
import com.github.renatoguanabara.dto.CriarAlunoResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Aluno", description = "Endpoint para gerenciar dados de aluno")
public interface AlunoApi {

     @Operation(
             summary = "Criar matricula do aluno ",
             operationId = "criar matricula ID ",
             description = "Criar matricula description",
             security = {@SecurityRequirement(name = "bearerAuth")}
     )
     @ApiResponses(value = {
             @ApiResponse(
                     //Adicionar status de erro.
                     responseCode = "201",
                     description = "CREATED",
                     content = @Content(
                             mediaType = "application/json",
                             schema = @Schema(implementation = CriarAlunoResponse.class)
                     )
             )

     })
     ResponseEntity<CriarAlunoResponse> criarMatricula (@RequestBody CriarAlunoRequest aluno);
}
