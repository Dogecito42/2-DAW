package ej11;

import java.util.HashMap;
import java.util.Map;

public class Fecha {
    private int mes;
    private int dia;
    private int anio;

    // Mapa de nombres de meses a sus respectivos números
    private static final Map<String, Integer> meses = new HashMap<>();
    static {
        meses.put("Enero", 1);
        meses.put("Febrero", 2);
        meses.put("Marzo", 3);
        meses.put("Abril", 4);
        meses.put("Mayo", 5);
        meses.put("Junio", 6);
        meses.put("Julio", 7);
        meses.put("Agosto", 8);
        meses.put("Septiembre", 9);
        meses.put("Octubre", 10);
        meses.put("Noviembre", 11);
        meses.put("Diciembre", 12);
    }

    // Constructor con tres enteros: mes, dia, anio
    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    // Constructor con un String (mes), dos enteros (dia, anio)
    public Fecha(String mes, int dia, int anio) {
        this.mes = meses.getOrDefault(mes, 1); // Asignar mes por nombre (si no se encuentra, se asigna Enero)
        this.dia = dia;
        this.anio = anio;
    }

    // Constructor con dos enteros (día del año y año)
    public Fecha(int diaDelAno, int anio) {
        this.anio = anio;
        this.mes = 1;
        this.dia = diaDelAno;

        // Convertir el día del año en mes y día
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (esBisiesto(anio)) {
            diasPorMes[1] = 29; // Ajuste para año bisiesto
        }

        for (int i = 0; i < diasPorMes.length; i++) {
            if (diaDelAno <= diasPorMes[i]) {
                mes = i + 1;
                dia = diaDelAno;
                break;
            } else {
                diaDelAno -= diasPorMes[i];
            }
        }
    }

    // Método para comprobar si un año es bisiesto
    private boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    // Método para imprimir la fecha en formato MM/DD/AAAA
    public String formato1() {
        return String.format("%02d/%02d/%d", mes, dia, anio);
    }

    // Método para imprimir la fecha en formato "Mes día, año" (Ej. Junio 15, 1992)
    public String formato2() {
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return nombresMeses[mes - 1] + " " + dia + ", " + anio;
    }

    // Método para imprimir la fecha en formato "DDD AAAA" (Ej. 165 1992)
    public String formato3() {
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (esBisiesto(anio)) {
            diasPorMes[1] = 29; // Ajuste para año bisiesto
        }

        int diaDelAno = 0;
        for (int i = 0; i < mes - 1; i++) {
            diaDelAno += diasPorMes[i];
        }
        diaDelAno += dia;

        return diaDelAno + " " + anio;
    }

    // Método para imprimir la fecha en todos los formatos
    public void imprimirFecha() {
        System.out.println("Formato MM/DD/AAAA: " + formato1());
        System.out.println("Formato Mes día, año: " + formato2());
        System.out.println("Formato DDD AAAA: " + formato3());
    }

    // Método toString para representar la fecha de manera textual
    @Override
    public String toString() {
        return formato1();  // Puedes elegir el formato que prefieras como salida por defecto
    }

    public static void main(String[] args) {
        // Crear objetos Fecha usando los tres constructores
        Fecha fecha1 = new Fecha(6, 15, 1992);  // Formato MM/DD/AAAA
        Fecha fecha2 = new Fecha("Junio", 15, 1992);  // Formato Mes día, año
        Fecha fecha3 = new Fecha(165, 1992);  // Formato DDD AAAA

        // Imprimir fechas en los tres formatos
        System.out.println("Fecha 1:");
        fecha1.imprimirFecha();

        System.out.println("\nFecha 2:");
        fecha2.imprimirFecha();

        System.out.println("\nFecha 3:");
        fecha3.imprimirFecha();
    }
}
