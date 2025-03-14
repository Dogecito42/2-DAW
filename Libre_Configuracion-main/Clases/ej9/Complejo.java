package ej9;

// Clase Complejo para representar y realizar operaciones con números complejos.
public class Complejo {
    private double parteReal;       // Parte real del número complejo
    private double parteImaginaria; // Parte imaginaria del número complejo

    // Constructor sin argumentos (valores predeterminados: 0 + 0i)
    public Complejo() {
        this.parteReal = 0;
        this.parteImaginaria = 0;
    }

    // Constructor con argumentos para inicializar el número complejo
    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    // Métodos obtener (getters) para las partes real e imaginaria
    public double getParteReal() {
        return parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    // Métodos establecer (setters) para las partes real e imaginaria
    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    // Método para sumar dos números complejos
    public Complejo sumar(Complejo otro) {
        double nuevaParteReal = this.parteReal + otro.parteReal;
        double nuevaParteImaginaria = this.parteImaginaria + otro.parteImaginaria;
        return new Complejo(nuevaParteReal, nuevaParteImaginaria);
    }

    // Método para restar dos números complejos
    public Complejo restar(Complejo otro) {
        double nuevaParteReal = this.parteReal - otro.parteReal;
        double nuevaParteImaginaria = this.parteImaginaria - otro.parteImaginaria;
        return new Complejo(nuevaParteReal, nuevaParteImaginaria);
    }

    // Método para mostrar el número complejo en forma (a, b)
    public void imprimir() {
        System.out.printf("(%f, %f)\n", parteReal, parteImaginaria);
    }

    // Método para mostrar el número complejo en forma a + bi
    public void imprimirFormaCompleta() {
        if (parteImaginaria >= 0) {
            System.out.printf("%f + %fi\n", parteReal, parteImaginaria);
        } else {
            System.out.printf("%f - %fi\n", parteReal, -parteImaginaria);
        }
    }
}
