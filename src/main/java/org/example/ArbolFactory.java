package org.example;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {

    private static Map<String, Arbol> pool = new HashMap<>();

    public static Arbol obtenerArbol(int alto, int horizontal, String color){
        String clave = alto + "." +horizontal + color;
        if (!pool.containsKey(clave)){
            Arbol arbol = new Arbol(alto, horizontal, color);
            pool.put(clave, arbol);
        }
        return pool.get(clave);
    }
}
