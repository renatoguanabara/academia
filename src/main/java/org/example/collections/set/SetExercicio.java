package org.example.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExercicio {
    public static void main(String[] args) {

        Set<String> listaSet = new HashSet<>();

        listaSet.add("Renato");
        listaSet.add("Dario");
        listaSet.add("Guanabara");
        listaSet.add("Renato");

        System.out.println("Lista: " + listaSet );

        //Aplicar linked e Treee...

        Set<String> listaSetLinked = new LinkedHashSet<>();

        listaSetLinked.add("Renato");
        listaSetLinked.add("Dario");
        listaSetLinked.add("Guanabara");
        listaSetLinked.add("Dario");
        System.out.println("Essa é a lista linkedHash: " + listaSetLinked);

        Set<String> listaTreeSet = new TreeSet<>();

        listaTreeSet.add("Renato");
        listaTreeSet.add("Dario");
        listaTreeSet.add("Guanabara");
        listaTreeSet.add("Renato");
        System.out.println("Essa é a lista treeSet: " + listaTreeSet);


    }
}
