package ej4;
// Tiempo2.java
// Declaración de la clase Tiempo2 modificada para usar segundos totales desde medianoche.

public class Tiempo2 {
    private int segundosDesdeMedianoche; // Número total de segundos desde medianoche

    // Constructor de Tiempo2 sin argumentos: inicializa a medianoche
    public Tiempo2() {
        this(0, 0, 0); // invoca al constructor con tres argumentos
    }

    // Constructor de Tiempo2: se suministra solo la hora
    public Tiempo2(int h) {
        this(h, 0, 0); // invoca al constructor con tres argumentos
    }

    // Constructor de Tiempo2: se suministran hora y minuto
    public Tiempo2(int h, int m) {
        this(h, m, 0); // invoca al constructor con tres argumentos
    }

    // Constructor de Tiempo2: se suministran hora, minuto y segundo
    public Tiempo2(int h, int m, int s) {
        setTiempo(h, m, s); // establece el tiempo
    }

    // Constructor de Tiempo2: se suministra otro objeto Tiempo2
    public Tiempo2(Tiempo2 tiempo) {
        this.segundosDesdeMedianoche = tiempo.segundosDesdeMedianoche;
    }

    // Métodos "establecer"
    // establece un nuevo valor de tiempo usando hora, minuto y segundo
    public void setTiempo(int h, int m, int s) {
        if (h < 0 || h >= 24 || m < 0 || m >= 60 || s < 0 || s >= 60) {
            segundosDesdeMedianoche = 0; // tiempo inválido, establece a medianoche
        } else {
            segundosDesdeMedianoche = h * 3600 + m * 60 + s;
        }
    }

    // Métodos "obtener"
    // obtiene la hora (calculada a partir de los segundos totales)
    public int getHora() {
        return segundosDesdeMedianoche / 3600;
    }

    // obtiene el minuto (calculado a partir de los segundos totales)
    public int getMinuto() {
        return (segundosDesdeMedianoche % 3600) / 60;
    }

    // obtiene el segundo (calculado a partir de los segundos totales)
    public int getSegundo() {
        return segundosDesdeMedianoche % 60;
    }

    // convierte a String en formato de hora universal (HH:MM:SS)
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }

    // convierte a String en formato de hora estándar (H:MM:SS AM o PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
                getMinuto(), getSegundo(), (getHora() < 12 ? "AM" : "PM"));
    }
} // fin de la clase Tiempo2

