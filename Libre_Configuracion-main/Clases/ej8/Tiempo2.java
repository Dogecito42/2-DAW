package ej8;

public class Tiempo2 {
    private int hora;    // 0 - 23
    private int minuto;  // 0 - 59
    private int segundo; // 0 - 59

    // Constructor sin argumentos
    public Tiempo2() {
        this(0, 0, 0);
    }

    // Constructor con un solo argumento (hora)
    public Tiempo2(int h) {
        this(h, 0, 0);
    }

    // Constructor con dos argumentos (hora, minuto)
    public Tiempo2(int h, int m) {
        this(h, m, 0);
    }

    // Constructor con tres argumentos (hora, minuto, segundo)
    public Tiempo2(int h, int m, int s) {
        setTiempo(h, m, s);
    }

    // Método para establecer el tiempo
    public boolean setTiempo(int h, int m, int s) {
        return setHora(h) && setMinuto(m) && setSegundo(s);
    }

    // Establecer la hora con validación
    public boolean setHora(int h) {
        if (h >= 0 && h < 24) {
            hora = h;
            return true;
        } else {
            System.out.println("Error: Hora inválida. La hora debe estar entre 0 y 23.");
            return false;
        }
    }

    // Establecer el minuto con validación
    public boolean setMinuto(int m) {
        if (m >= 0 && m < 60) {
            minuto = m;
            return true;
        } else {
            System.out.println("Error: Minuto inválido. El minuto debe estar entre 0 y 59.");
            return false;
        }
    }

    // Establecer el segundo con validación
    public boolean setSegundo(int s) {
        if (s >= 0 && s < 60) {
            segundo = s;
            return true;
        } else {
            System.out.println("Error: Segundo inválido. El segundo debe estar entre 0 y 59.");
            return false;
        }
    }

    // Obtener la hora
    public int getHora() {
        return hora;
    }

    // Obtener el minuto
    public int getMinuto() {
        return minuto;
    }

    // Obtener el segundo
    public int getSegundo() {
        return segundo;
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
