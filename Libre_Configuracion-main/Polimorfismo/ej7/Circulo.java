package ej7;

// Clase Circulo que hereda de Elipse
public class Circulo extends Elipse {

    // Constructor
    public Circulo(String color, Punto centro, String nombre, double radio) {
        super(color, centro, nombre, radio, radio);  // Radio mayor y menor son iguales para el círculo
    }

    // Sobreescribir el método imprimir
    @Override
    public void imprimir() {
        System.out.println("Soy un Círculo: " + getNombre());
        System.out.println("Color: " + getColor());
        System.out.println("Centro: " + getCentro());
        System.out.println("Radio: " + getRadioMayor());  // Solo uno de los radios es necesario
    }
}
