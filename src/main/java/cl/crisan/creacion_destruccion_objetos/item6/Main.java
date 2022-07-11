package cl.crisan.creacion_destruccion_objetos.item6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // No preferible porque es como un wrapper del String "inmutable"
        String inmutable = new String("inmutable");
        // Preferible
        String mutable = "mutable";

        // No preferible
        // Esto genera un objeto boolean
        Boolean esBooleanMalo = new Boolean("true");
        // Preferible
        // Esto no genera un objeto boolea, solo retorna un booleano
        Boolean esBooleanBueno = Boolean.valueOf("true");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Cristian");
        map.put(2, "Andres");
        map.put(3, "Josefina");
        map.put(4, "Matilda");
        // Obtiene una lista de set una única vez
        Set<Integer> integers = map.keySet();

    }
}
