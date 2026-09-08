package org.example.collections.exercicios;

import java.util.*;

public class ExerciciosAula01 {

    public static void main(String[] args) {
        //Criar metodo para remover duplicados de uma lista, porem preservando a ordem de insercão
        //Entrada: List<String> ex.: ("Luis", "Garcia", "Luis", "Carlos")
        // Saída: List<String> ex: ("Luis", "Garcia", "Carlos")

        /* A linha de raciocínio está correta, faltou apenas receber a List -> Set -> List*/
        Set<String> listaRemoveNomeDuplicados = new LinkedHashSet<>();

        listaRemoveNomeDuplicados.add("Luis");
        listaRemoveNomeDuplicados.add("Garcia");
        listaRemoveNomeDuplicados.add("Luis");
        listaRemoveNomeDuplicados.add("Carlos");

        System.out.println("Essa é a lista que remove nomes duplicados: " + listaRemoveNomeDuplicados);

        //Criar metodo para contar nomes repetidos
        //Entrada: List<String> ex: ("Luis", "Luis", "Garcia")
        // Saída: Map<String, Integer> ex: {("Luis", 2), ("Garcia", 1)}
        Map<String, Integer> numeroDeNomesRepetidos = new HashMap<>();

        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("Luis");
        listaNomes.add("Luis");
        listaNomes.add("Garcia");
        listaNomes.add("Garcia");
        listaNomes.add("Renato");


        for (int i = 0; i < listaNomes.size() ; i++){
            numeroDeNomesRepetidos.put(listaNomes.get(i), 0 );
        }

        for (int i = 0; i < listaNomes.size() ; i++){

            if (i == 0){
                numeroDeNomesRepetidos.put(listaNomes.get(i), 1);
            }

            if (i != 0){
                int soma = numeroDeNomesRepetidos.get(listaNomes.get(i)) + 1;
                numeroDeNomesRepetidos.put(listaNomes.get(i), soma );
            }


        }
        System.out.println(numeroDeNomesRepetidos);


    }



    //<Nível +> Criar método para calcular total pago por cliente
    //Entrada: List<Pedido>
    // Saída: Map<String, Double> Criar classe Pedido (id, nomeCliente, listaProdutos)
    // Criar classe Produto (id, descricao, valor)


}
