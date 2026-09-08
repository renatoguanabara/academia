package com.example.Academia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Table(name = "aluno")
@Entity
@Data
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Nome é obrigatorio")
    private String nome;
    @NotBlank(message = "Telefone é obrigatorio")
    private String telefone;
    @NotBlank(message = "Objetico é obrigatorio")
    private String objetivo;
    @NotBlank(message = "Plano desejado é obrigatorio")
    private String planoDesejado;
    private Status status;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private List<Exercicios> exercicios;
//TODO: corrigir classe e falar que é uma tabela, consultar como fazer isso. 

}
