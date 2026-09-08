package org.example.collections.list;

import java.util.ArrayList;

public class List {

    public static void main(String[] args){
        //Declarando uma ArrayList
        java.util.List<String> nomes = new ArrayList<>();

        //linkedilist...

        //Adicionando nomes a ArrayList
        nomes.add("Renato");
        nomes.add("Dario");
        nomes.add("Guanabara");
        nomes.add("Guanabara");
        nomes.add("RenatoGuanabara");
        nomes.add("RenatoDarioGuanabar");

        //Imprime a list de nomes
        System.out.println("imprimir todos : " + nomes);

        //Pega a posicao 2 da lista. lembrando que a lista comeca em 0
        System.out.println(nomes.get(2));

        //Atualiza a posicao 0 para Guanabara
        nomes.set(0,"Guanabara");
        System.out.println(nomes);

        //Remove o index 4
        nomes.remove(4);

        //Remoce todos os nomes = Renato.
        nomes.removeIf(nome -> nome.equals("Renato"));
        System.out.println(nomes);

        //Limpa todos os nomes
        nomes.clear();
        System.out.println("Aqui tem a array :" + nomes);





    }
}
