package ej7;

// Clase Elipse que hereda de Forma
public class Elipse extends Forma {
    private double radioMayor;
    private double radioMenor;

    // Constructor
    public Elipse(String color, Punto centro, String nombre, double radioMayor, double radioMenor) {
        super(color, centro, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    // Métodos Getters y Setters
    public double getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    public double getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }

    // Imprimir
    @Override
    public void imprimir() {
        System.out.println("Soy una Elipse: " + getNombre());
        System.out.println("Color: " + getColor());
        System.out.println("Centro: " + getCentro());
        System.out.println("Radio Mayor: " + radioMayor + ", Radio Menor: " + radioMenor);
    }

    // Calcular área
    public double calcularArea() {
        return Math.PI * radioMayor * radioMenor;
    }
}
