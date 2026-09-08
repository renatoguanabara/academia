package com.example.Academia.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

public class Instrutor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    //Duvida para a aula, devo ter um objeto do tipo aluno dentro do model que representa um instrutor ?

}
