package ej5;

public abstract class Empleado {
    protected String nombre;
    protected int edad;
    protected double salario;

    // Constante PLUS
    public static final double PLUS = 300.0;

    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método abstracto para aplicar el plus
    public abstract void plus();

    // Método toString
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
    }
}
