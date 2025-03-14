package ej7;

// PruebaFecha.java
public class PruebaFecha {
    public static void main(String[] args) {
        // Caso 1: Incrementar la fecha para cambiar al siguiente mes
        Fecha fecha = new Fecha(31, 1, 2024);
        System.out.println("Fecha inicial: " + fecha);
        fecha.siguienteDia();
        System.out.println("Después de siguienteDia: " + fecha);

        // Caso 2: Incrementar la fecha para cambiar al siguiente año
        fecha = new Fecha(31, 12, 2023);
        System.out.println("\nFecha inicial: " + fecha);
        fecha.siguienteDia();
        System.out.println("Después de siguienteDia: " + fecha);

        // Caso 3: Probar el método en un ciclo (mes completo)
        fecha = new Fecha(28, 2, 2024); // Año bisiesto
        System.out.println("\nCiclo para febrero de 2024:");
        for (int i = 0; i < 5; i++) {
            System.out.println(fecha);
            fecha.siguienteDia();
        }
    }
}
