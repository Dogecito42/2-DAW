package ej9;

// Programa principal para probar la clase Complejo.
public class PruebaComplejo {
    public static void main(String[] args) {
        // Crear dos números complejos
        Complejo num1 = new Complejo(3.0, 2.0); // 3 + 2i
        Complejo num2 = new Complejo(1.5, 4.5); // 1.5 + 4.5i

        // Imprimir los números complejos
        System.out.println("Número 1:");
        num1.imprimirFormaCompleta();
        System.out.println("Número 2:");
        num2.imprimirFormaCompleta();

        // Sumar los dos números complejos
        Complejo suma = num1.sumar(num2);
        System.out.println("Suma de los números complejos:");
        suma.imprimirFormaCompleta();

        // Restar los dos números complejos
        Complejo resta = num1.restar(num2);
        System.out.println("Resta de los números complejos:");
        resta.imprimirFormaCompleta();

        // Modificar valores de un número complejo
        num1.setParteReal(5.0);
        num1.setParteImaginaria(-3.0);
        System.out.println("Número 1 modificado:");
        num1.imprimirFormaCompleta();
    }
}
