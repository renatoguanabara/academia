package org.example.collections.exercicios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio02 {

    public static void main(String[] args) {

        // Passo 1: Criar exemplo de entrada válida, List<String> ex: ("Luis", "Luis", "Garcia")
        List<String> nomes = List.of("Luis", "Luis", "Garcia");

        // Passo 2: Contar duplicados criando um metodo para isso
        Map<String, Integer> contadorNomes = contarDuplicados(nomes);

        // Passo 3: Validar saída, Map<String, Integer> ex: {("Luis", 2), ("Garcia", 1)}
        System.out.println(contadorNomes);
    }

    private static Map<String, Integer> contarDuplicados(List<String> lista) {
        Map<String, Integer> contador = new HashMap<>();
        for (String nome : lista) {
            contador.put(nome, contador.getOrDefault(nome, 0) + 1); //getOrDefault retorna o valor padrão caso a chave não exista no mapa, nesse caso 0
            // contador.merge(nome, 1, Integer::sum); //merge faz o mesmo que o getOrDefault, mas de uma forma mais elegante, ele recebe 3 parametros, a chave, o valor e uma função que vai somar os valores caso a chave já exista no mapa
        }
        return contador;
    }
}
