/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion.Examen;

public class Examen {
    private String asignatura;
    private String aula;
    private Fecha fecha;
    private Hora hora;

    // Constructor
    public Examen(String asignatura, String aula, Fecha fecha, Hora hora) {
        this.asignatura = asignatura;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Métodos set y get
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getAula() {
        return aula;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public Hora getHora() {
        return hora;
    }

    // Método toString() para devolver la información del examen
    @Override
    public String toString() {
        return "Asignatura: " + asignatura + "\n" +
               "Aula: " + aula + "\n" +
               "Fecha: " + fecha.toString() + "\n" +
               "Hora: " + hora.toString();
    }
}
