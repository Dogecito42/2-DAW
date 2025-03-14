package ej7;

// Clase para representar un punto en el plano 2D
public class Punto {
    private int x; // Coordenada X
    private int y; // Coordenada Y

    // Constructor que recibe las coordenadas x e y
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Métodos Getters y Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Método para mover el punto a una nueva posición
    public void mover(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método toString para representar el punto en formato de cadena
    @Override
    public String toString() {
        return "Punto(" + x + ", " + y + ")";
    }
}
