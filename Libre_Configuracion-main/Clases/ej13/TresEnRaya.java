package ej13;

import java.util.Scanner;

public class TresEnRaya {
    private int[][] tablero;
    private int jugadorActual;

    // Constructor que inicializa el tablero vacío
    public TresEnRaya() {
        tablero = new int[3][3]; // Tablero de 3x3
        jugadorActual = 1; // Comienza el jugador 1
        // Inicializa el tablero con ceros (vacío)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    // Método para imprimir el tablero
    public void imprimirTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == 0) {
                    System.out.print(" . ");
                } else if (tablero[i][j] == 1) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
    }

    // Método para hacer un movimiento
    public boolean hacerMovimiento(int fila, int columna) {
        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != 0) {
            System.out.println("Movimiento inválido. Intenta de nuevo.");
            return false;
        }
        // Realiza el movimiento
        tablero[fila][columna] = jugadorActual;
        return true;
    }

    // Método para cambiar de jugador
    public void cambiarJugador() {
        jugadorActual = (jugadorActual == 1) ? 2 : 1;
    }

    // Método para verificar si hay un ganador
    public boolean verificarGanador() {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true;
            }
        }

        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == jugadorActual && tablero[1][j] == jugadorActual && tablero[2][j] == jugadorActual) {
                return true;
            }
        }

        // Verificar diagonales
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true;
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true;
        }

        return false;
    }

    // Método para verificar si hay empate
    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == 0) {
                    return false; // Si hay al menos un espacio vacío, no es empate
                }
            }
        }
        return true; // Si no hay espacios vacíos, es empate
    }

    // Método para jugar el juego
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            imprimirTablero();
            System.out.println("Turno del Jugador " + jugadorActual + " (X para 1, O para 2)");
            System.out.print("Ingrese la fila (0-2): ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese la columna (0-2): ");
            int columna = scanner.nextInt();

            // Realizar el movimiento
            if (!hacerMovimiento(fila, columna)) {
                continue; // Si el movimiento es inválido, vuelve a pedir el movimiento
            }

            // Verificar si hay un ganador
            if (verificarGanador()) {
                imprimirTablero();
                System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                break;
            }

            // Verificar si hay empate
            if (verificarEmpate()) {
                imprimirTablero();
                System.out.println("¡Empate!");
                break;
            }

            // Cambiar de jugador
            cambiarJugador();
        }
        scanner.close();
    }

    // Método principal para iniciar el juego
    public static void main(String[] args) {
        TresEnRaya juego = new TresEnRaya();
        juego.jugar(); // Comienza el juego
    }
}
