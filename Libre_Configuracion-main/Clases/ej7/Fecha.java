package ej7;

// Fecha.java
public class Fecha {
    private int mes; // 1-12
    private int dia; // 1-31 con base en el mes
    private int anio; // cualquier año

    // Constructor: valida el mes y el día
    public Fecha(int elDia, int elMes, int elAnio) {
        mes = comprobarMes(elMes); // valida el mes
        anio = elAnio; // establece el año
        dia = comprobarDia(elDia); // valida el día
        System.out.printf("Constructor de objeto Fecha para la fecha %s\n", this);
    }

    // Método utilitario para confirmar el valor apropiado del mes
    private int comprobarMes(int mesPrueba) {
        if (mesPrueba > 0 && mesPrueba <= 12) // valida el mes
            return mesPrueba;
        else { // mes es inválido
            System.out.printf("Mes invalido (%d) se establecio en 1.\n", mesPrueba);
            return 1; // mantiene el objeto en estado consistente
        }
    }

    // Método utilitario para confirmar el valor apropiado del día
    private int comprobarDia(int diaPrueba) {
        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Comprueba si el día está dentro del rango para el mes
        if (diaPrueba > 0 && diaPrueba <= diasPorMes[mes])
            return diaPrueba;

        // Comprueba si es año bisiesto
        if (mes == 2 && diaPrueba == 29 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
            return diaPrueba;

        System.out.printf("Dia invalido (%d) se establecio en 1.\n", diaPrueba);
        return 1; // mantiene el objeto en estado consistente
    }

    // Incrementa el día en uno
    public void siguienteDia() {
        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Ajusta para años bisiestos
        if (mes == 2 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
            diasPorMes[2] = 29;

        if (dia < diasPorMes[mes]) {
            dia++; // Incrementa el día
        } else {
            dia = 1; // Reinicia el día
            if (mes < 12) {
                mes++; // Incrementa el mes
            } else {
                mes = 1; // Reinicia el mes
                anio++; // Incrementa el año
            }
        }
    }

    // Devuelve un objeto String de la forma dia/mes/anio
    public String toString() {
        return String.format("%d/%d/%d", dia, mes, anio);
    }
}
