package ej7;

// Clase Rectangulo que hereda de Forma
public class Rectangulo extends Forma {
    private double ladoMenor;
    private double ladoMayor;

    // Constructor
    public Rectangulo(String color, Punto centro, String nombre, double ladoMenor, double ladoMayor) {
        super(color, centro, nombre);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    // Métodos Getters y Setters
    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public double getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    // Imprimir
    @Override
    public void imprimir() {
        System.out.println("Soy un Rectángulo: " + getNombre());
        System.out.println("Color: " + getColor());
        System.out.println("Centro: " + getCentro());
        System.out.println("Lado Menor: " + ladoMenor + ", Lado Mayor: " + ladoMayor);
    }

    // Calcular área
    public double calcularArea() {
        return ladoMenor * ladoMayor;
    }

    // Calcular perímetro
    public double calcularPerimetro() {
        return 2 * (ladoMenor + ladoMayor);
    }

    // Cambiar tamaño (escala)
    public void cambiarTamaño(double factor) {
        ladoMenor *= factor;
        ladoMayor *= factor;
    }
}
