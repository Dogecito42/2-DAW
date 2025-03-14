package ej6;
// Tiempo2.java
public class Tiempo2 {
    private int segundosDesdeMedianoche; // Número total de segundos desde medianoche

    // Constructor sin argumentos
    public Tiempo2() {
        this(0, 0, 0);
    }

    // Constructor con hora
    public Tiempo2(int h) {
        this(h, 0, 0);
    }

    // Constructor con hora y minuto
    public Tiempo2(int h, int m) {
        this(h, m, 0);
    }

    // Constructor con hora, minuto y segundo
    public Tiempo2(int h, int m, int s) {
        setTiempo(h, m, s);
    }

    // Método para establecer el tiempo
    public void setTiempo(int h, int m, int s) {
        if (h < 0 || h >= 24 || m < 0 || m >= 60 || s < 0 || s >= 60) {
            segundosDesdeMedianoche = 0;
        } else {
            segundosDesdeMedianoche = h * 3600 + m * 60 + s;
        }
    }

    // Métodos para obtener hora, minuto y segundo
    public int getHora() {
        return segundosDesdeMedianoche / 3600;
    }

    public int getMinuto() {
        return (segundosDesdeMedianoche % 3600) / 60;
    }

    public int getSegundo() {
        return segundosDesdeMedianoche % 60;
    }

    // Incrementa el tiempo por un segundo
    public void tictac() {
        segundosDesdeMedianoche = (segundosDesdeMedianoche + 1) % 86400; // Cicla a 0 tras 24 horas
    }

    // Incrementa el minuto
    public void incrementarMinuto() {
        segundosDesdeMedianoche = (segundosDesdeMedianoche + 60) % 86400; // Cicla a 0 tras 24 horas
    }

    // Incrementa la hora
    public void incrementarHora() {
        segundosDesdeMedianoche = (segundosDesdeMedianoche + 3600) % 86400; // Cicla a 0 tras 24 horas
    }

    // Representación en formato universal (HH:MM:SS)
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }

    // Representación en formato estándar (H:MM:SS AM/PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
                getMinuto(), getSegundo(),
                (getHora() < 12 ? "AM" : "PM"));
    }
}


