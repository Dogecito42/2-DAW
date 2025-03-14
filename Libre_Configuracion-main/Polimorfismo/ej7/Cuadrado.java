package ej7;

// Clase Cuadrado que hereda de Rectangulo
public class Cuadrado extends Rectangulo {

    // Constructor
    public Cuadrado(String color, Punto centro, String nombre, double lado) {
        super(color, centro, nombre, lado, lado);  // Lado menor y mayor son iguales para el cuadrado
    }

    // Sobreescribir el método imprimir
    @Override
    public void imprimir() {
        System.out.println("Soy un Cuadrado: " + getNombre());
        System.out.println("Color: " + getColor());
        System.out.println("Centro: " + getCentro());
        System.out.println("Lado: " + getLadoMenor());  // Solo uno de los lados es necesario
    }
}
