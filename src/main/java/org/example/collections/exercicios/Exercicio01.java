package org.example.collections.exercicios;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Exercicio01 {

    public static void main(String[] args) {
        // Passo 1: Criar exemplo de entrada válida, List<String> ex.: ("Luis", "Garcia", "Luis", "Carlos")
        List<String> nomes = List.of("Luis", "Garcia", "Luis", "Carlos");

        // Passo 2: Remover duplicados criando um metodo para isso
        List<String> nomesSemDuplicados = removerDuplicados(nomes);

        // Passo 3: Validar saída, List<String> ex: ("Luis", "Garcia", "Carlos")
        nomesSemDuplicados.forEach(System.out::println);
    }

    // Criar metodo para remover duplicados de uma lista, porem preservando a ordem de insercão
    private static List<String> removerDuplicados(List<String> lista) {
        Set<String> listaRemovidos = new LinkedHashSet<>(lista);
        return new ArrayList<>(listaRemovidos);
    }
}
