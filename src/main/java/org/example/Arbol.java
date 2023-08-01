package org.example;

public class Arbol {

    private int alto;
    private int horizontal;

    private String color;

    public Arbol(int alto, int horizontal) {
        this.alto = alto;
        this.horizontal = horizontal;
    }

    public Arbol(int alto, int horizontal, String color) {
        this.alto = alto;
        this.horizontal = horizontal;
        this.color = color;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "alto=" + alto +
                ", horizontal=" + horizontal +
                ", color='" + color + '\'' +
                '}';
    }
}
