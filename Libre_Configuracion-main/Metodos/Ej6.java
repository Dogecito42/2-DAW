/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalRecibos = 0.0; // Para almacenar el total de pagos de ayer
        int cliente = 1;

        while (true) {
            // Solicitar las horas de estacionamiento para el cliente
            System.out.printf("Ingrese las horas de estacionamiento del cliente %d (o -1 para salir): ", cliente);
            double horas = scanner.nextDouble();

            // Salir del bucle si el usuario ingresa -1
            if (horas == -1) {
                break;
            }

            // Validar que las horas no excedan 24
            if (horas < 0 || horas > 24) {
                System.out.println("Las horas deben estar entre 0 y 24. Intente de nuevo.");
                continue;
            }

            // Calcular el pago utilizando el método calcularPagos
            double pago = calcularPagos(horas);

            // Mostrar el pago para el cliente actual
            System.out.printf("El pago para el cliente %d es: %.2f€\n", cliente, pago);

            // Agregar el pago al total de los recibos
            totalRecibos += pago;

            cliente++;
        }

        // Mostrar el total de los recibos
        System.out.printf("\nEl total de los recibos de ayer es: %.2f€\n", totalRecibos);

        scanner.close();
    }

    /**
     * Método para calcular el pago del estacionamiento.
     *
     * @param horas las horas de estacionamiento del cliente
     * @return el pago calculado
     */
    public static double calcularPagos(double horas) {
        if (horas <= 3) {
            return 2.0; // Cuota mínima
        } else if (horas > 3 && horas <= 24) {
            double pago = 2.0 + Math.ceil(horas - 3) * 0.5; // 0.50€ por cada hora o fracción adicional
            return Math.min(pago, 10.0); // Máximo 10.00€
        } else {
            return 0.0; // Caso por si las horas fueran inválidas (debería estar controlado antes)
        }
    }
}
