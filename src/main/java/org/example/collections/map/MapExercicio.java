package org.example.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExercicio {

    public static void main(String[] args) {
        //rash map
        //linked rashmap
        //treemap.

        Map<String, String> mapPerformaticoSemCaracteristica = new HashMap<>();
        mapPerformaticoSemCaracteristica.put("00", "Renato");
        mapPerformaticoSemCaracteristica.put("01", "Guanabara");
        mapPerformaticoSemCaracteristica.put("02", "Dario");
        mapPerformaticoSemCaracteristica.put("07", "Test");
        exibirMapa(mapPerformaticoSemCaracteristica);

        Map<String,String> mapPreservaOdemIncercao = new LinkedHashMap<>();
        mapPreservaOdemIncercao.put("10", "Renato");
        mapPreservaOdemIncercao.put("33", "Guanabara");
        mapPreservaOdemIncercao.put("05", "Dario");
        exibirMapa(mapPreservaOdemIncercao);

        Map<String,String> mapComOrdenacaoPelaChave = new TreeMap<>();
        mapComOrdenacaoPelaChave.put("10", "Renato");
        mapComOrdenacaoPelaChave.put("33", "Guanabara");
        mapComOrdenacaoPelaChave.put("05", "Dario");
        exibirMapa(mapComOrdenacaoPelaChave);



    }

    private static void exibirMapa(Map<String,String> listaMap){
        listaMap.entrySet()
                .stream()
                .forEach(entry-> {
                    System.out.println(entry.getKey()+" - " + entry.getValue());
                });
    }


}
