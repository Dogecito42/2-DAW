package ej7;

// Clase abstracta Forma
public abstract class Forma {
    private String color;
    private Punto centro; // La coordenada del centro será un objeto de la clase Punto
    private String nombre;

    // Constructor
    public Forma(String color, Punto centro, String nombre) {
        this.color = color;
        this.centro = centro;
        this.nombre = nombre;
    }

    // Métodos abstractos
    public abstract void imprimir();

    // Métodos Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Punto getCentro() {
        return centro;
    }

    public String getNombre() {
        return nombre;
    }

    // Método para mover la forma (cambiar la posición del centro)
    public void mover(int x, int y) {
        centro.setX(x);
        centro.setY(y);
    }
}
