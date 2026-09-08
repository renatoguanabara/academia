package com.example.Academia.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "exercicios")
@Entity
@Data
public class Exercicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String exercicio;
    private String repeticoes;
    private String serie;

}
