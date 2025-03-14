package ej12;

public class Racional {
    private int numerador;
    private int denominador;

    // Constructor con numerador y denominador
    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        int gcd = gcd(numerador, denominador);
        this.numerador = numerador / gcd;
        this.denominador = denominador / gcd;
        if (this.denominador < 0) {  // Mantener el signo en el numerador
            this.numerador = -this.numerador;
            this.denominador = -this.denominador;
        }
    }

    // Constructor sin argumentos (por defecto 0/1)
    public Racional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    // Obtener el numerador
    public int getNumerador() {
        return numerador;
    }

    // Establecer el numerador
    public void setNumerador(int numerador) {
        this.numerador = numerador;
        reducir();
    }

    // Obtener el denominador
    public int getDenominador() {
        return denominador;
    }

    // Establecer el denominador
    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.denominador = denominador;
        reducir();
    }

    // Método para reducir la fracción
    private void reducir() {
        int gcd = gcd(numerador, denominador);
        numerador = numerador / gcd;
        denominador = denominador / gcd;
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    // Función para obtener el máximo común divisor (MCD)
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Método para imprimir la fracción en formato a/b
    public String imprimirFraccion() {
        return numerador + "/" + denominador;
    }

    // Método para imprimir la fracción en formato decimal con precisión
    public String imprimirDecimal(int precision) {
        double valorDecimal = (double) numerador / denominador;
        return String.format("%." + precision + "f", valorDecimal);
    }

    // Método para sumar dos fracciones
    public static Racional sumar(Racional r1, Racional r2) {
        int numeradorResultado = r1.numerador * r2.denominador + r2.numerador * r1.denominador;
        int denominadorResultado = r1.denominador * r2.denominador;
        return new Racional(numeradorResultado, denominadorResultado);
    }

    // Método para restar dos fracciones
    public static Racional restar(Racional r1, Racional r2) {
        int numeradorResultado = r1.numerador * r2.denominador - r2.numerador * r1.denominador;
        int denominadorResultado = r1.denominador * r2.denominador;
        return new Racional(numeradorResultado, denominadorResultado);
    }

    // Método para multiplicar dos fracciones
    public static Racional multiplicar(Racional r1, Racional r2) {
        int numeradorResultado = r1.numerador * r2.numerador;
        int denominadorResultado = r1.denominador * r2.denominador;
        return new Racional(numeradorResultado, denominadorResultado);
    }

    // Método para dividir dos fracciones
    public static Racional dividir(Racional r1, Racional r2) {
        if (r2.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        int numeradorResultado = r1.numerador * r2.denominador;
        int denominadorResultado = r1.denominador * r2.numerador;
        return new Racional(numeradorResultado, denominadorResultado);
    }

    // Método toString para mostrar la fracción
    @Override
    public String toString() {
        return imprimirFraccion();
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear algunas fracciones
        Racional fraccion1 = new Racional(2, 4); // Equivalente a 1/2
        Racional fraccion2 = new Racional(1, 3);
        Racional fraccion3 = new Racional(5, 10); // Equivalente a 1/2

        // Imprimir las fracciones
        System.out.println("Fracción 1: " + fraccion1);
        System.out.println("Fracción 2: " + fraccion2);
        System.out.println("Fracción 3: " + fraccion3);

        // Sumar las fracciones
        Racional suma = Racional.sumar(fraccion1, fraccion2);
        System.out.println("Suma: " + suma);

        // Restar las fracciones
        Racional resta = Racional.restar(fraccion1, fraccion2);
        System.out.println("Resta: " + resta);

        // Multiplicar las fracciones
        Racional multiplicacion = Racional.multiplicar(fraccion1, fraccion2);
        System.out.println("Multiplicación: " + multiplicacion);

        // Dividir las fracciones
        Racional division = Racional.dividir(fraccion1, fraccion2);
        System.out.println("División: " + division);

        // Imprimir en formato decimal con precisión
        System.out.println("Fracción 1 en formato decimal: " + fraccion1.imprimirDecimal(4));
    }
}
