package ej5;

public class Comercial extends Empleado {
    private double comision;

    // Constructor
    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    // Getters y setters
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    // Implementación del método plus
    @Override
    public void plus() {
        if (edad > 30 && comision > 200) {
            salario += PLUS; // Se aplica el plus
            System.out.println("Plus aplicado al comercial " + nombre);
        }
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", comisión=" + comision;
    }
}
