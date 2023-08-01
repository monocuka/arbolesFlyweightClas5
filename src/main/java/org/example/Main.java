package org.example;

public class Main {
    public static void main(String[] args) {

        ArbolFactory arbolFactory = new ArbolFactory();

        Arbol ornamental1 = arbolFactory.obtenerArbol(200,400,"verde");

        Arbol frutal1 = arbolFactory.obtenerArbol(500,300,"rojo");

        Arbol ornamental2 = arbolFactory.obtenerArbol(200,400,"verde");

        Arbol floral1 = arbolFactory.obtenerArbol(100,200,"celeste");

        System.out.println(ornamental1);
        System.out.println(frutal1);
        System.out.println(ornamental2);
        System.out.println(floral1);
    }
}