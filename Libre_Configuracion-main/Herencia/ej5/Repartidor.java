package ej5;

public class Repartidor extends Empleado {
    private String zona;

    // Constructor
    public Repartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    // Getters y setters
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    // Implementación del método plus
    @Override
    public void plus() {
        if (edad < 25 && zona.equals("zona 3")) {
            salario += PLUS; // Se aplica el plus
            System.out.println("Plus aplicado al repartidor " + nombre);
        }
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", zona=" + zona;
    }
}

