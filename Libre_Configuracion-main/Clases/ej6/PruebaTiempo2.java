package ej6;

// PruebaTiempo2.java
public class PruebaTiempo2 {
    public static void main(String[] args) {
        // Caso 1: Incrementar el segundo (tictac)
        Tiempo2 tiempo = new Tiempo2(11, 59, 59);
        System.out.println("Tiempo inicial: " + tiempo.aStringUniversal());
        tiempo.tictac();
        System.out.println("Después de tictac: " + tiempo.aStringUniversal());

        // Caso 2: Incrementar el minuto
        tiempo = new Tiempo2(11, 59, 0);
        System.out.println("\nTiempo inicial: " + tiempo.aStringUniversal());
        tiempo.incrementarMinuto();
        System.out.println("Después de incrementarMinuto: " + tiempo.aStringUniversal());

        // Caso 3: Incrementar la hora
        tiempo = new Tiempo2(23, 0, 0);
        System.out.println("\nTiempo inicial: " + tiempo.aStringUniversal());
        tiempo.incrementarHora();
        System.out.println("Después de incrementarHora: " + tiempo.aStringUniversal());

        // Caso 4: Incrementar el tiempo al siguiente día
        tiempo = new Tiempo2(23, 59, 59);
        System.out.println("\nTiempo inicial: " + tiempo.aStringUniversal());
        tiempo.tictac();
        System.out.println("Después de tictac (cambio al siguiente día): " + tiempo.aStringUniversal());
    }
}
