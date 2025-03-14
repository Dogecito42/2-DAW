package ej8;
// PruebaTiempo2.java
public class PruebaTiempo2 {
    public static void main(String[] args) {
        // Crear objeto Tiempo2
        Tiempo2 tiempo = new Tiempo2();

        // Intentar establecer hora, minuto y segundo válidos
        System.out.println("Establecer hora: 15");
        if (!tiempo.setHora(15)) {
            System.out.println("Error al establecer hora.");
        }
        System.out.println("Establecer minuto: 45");
        if (!tiempo.setMinuto(45)) {
            System.out.println("Error al establecer minuto.");
        }
        System.out.println("Establecer segundo: 30");
        if (!tiempo.setSegundo(30)) {
            System.out.println("Error al establecer segundo.");
        }

        // Mostrar el tiempo después de los cambios
        System.out.println("Tiempo: " + tiempo.aStringUniversal());

        // Intentar establecer hora, minuto y segundo con valores inválidos
        System.out.println("\nIntentar establecer hora: 25 (inválida)");
        if (!tiempo.setHora(25)) {
            System.out.println("Error al establecer hora.");
        }
        System.out.println("Intentar establecer minuto: 75 (inválido)");
        if (!tiempo.setMinuto(75)) {
            System.out.println("Error al establecer minuto.");
        }
        System.out.println("Intentar establecer segundo: 65 (inválido)");
        if (!tiempo.setSegundo(65)) {
            System.out.println("Error al establecer segundo.");
        }

        // Mostrar el tiempo después de los intentos inválidos
        System.out.println("Tiempo después de intentos inválidos: " + tiempo.aStringUniversal());
    }
}

