/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Composicion.Examen;

public class Principal {
    public static void main(String[] args) {
        // Crear objetos de tipo Fecha y Hora
        Fecha fecha = new Fecha(12, 7, 2024);
        Hora hora = new Hora(9, 30);

        // Crear objeto Examen usando los objetos Fecha y Hora
        Examen examen = new Examen("Matemáticas", "Aula 101", fecha, hora);

        // Mostrar la información del examen
        System.out.println("Información del examen:");
        System.out.println(examen);

        // Modificar la fecha y la hora del examen
        fecha = new Fecha(15, 7, 2024);  // Crear una nueva fecha
        hora = new Hora(11, 0);  // Crear una nueva hora

        // Modificar el examen con la nueva fecha y hora
        examen.setFecha(fecha);
        examen.setHora(hora);

        // Mostrar la nueva información del examen
        System.out.println("\nInformación del examen después de modificar la fecha y hora:");
        System.out.println(examen);

        // Obtener la fecha y hora del examen y asignarlas a nuevas variables
        Fecha fechaDelExamen = examen.getFecha();
        Hora horaDelExamen = examen.getHora();

        // Modificar la fecha y hora del examen
        examen.setFecha(new Fecha(1, 8, 2024));
        examen.setHora(new Hora(8, 0));

        // Verificar que los objetos Fecha y Hora no han sido modificados
        System.out.println("\nFecha y hora obtenidas del examen (no deberían haber cambiado):");
        System.out.println("Fecha del examen: " + fechaDelExamen);
        System.out.println("Hora del examen: " + horaDelExamen);

        // Mostrar la nueva información del examen
        System.out.println("\nInformación final del examen:");
        System.out.println(examen);
    }
}

