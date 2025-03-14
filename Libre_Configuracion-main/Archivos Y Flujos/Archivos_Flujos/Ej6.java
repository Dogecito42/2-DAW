
package Archivos_Flujos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Ej6 {

    // Mapa de dígitos a letras
    private static final Map<Character, String> DIGITOS_A_LETRAS = new HashMap<>();

    static {
        DIGITOS_A_LETRAS.put('2', "ABC");
        DIGITOS_A_LETRAS.put('3', "DEF");
        DIGITOS_A_LETRAS.put('4', "GHI");
        DIGITOS_A_LETRAS.put('5', "JKL");
        DIGITOS_A_LETRAS.put('6', "MNO");
        DIGITOS_A_LETRAS.put('7', "PRS");
        DIGITOS_A_LETRAS.put('8', "TUV");
        DIGITOS_A_LETRAS.put('9', "WXY");
    }

    public static void main(String[] args) {
        String numeroTelefono = "6832537"; // Ejemplo de número telefónico
        // Verificar si el número contiene 0 o 1
        if (numeroTelefono.contains("0") || numeroTelefono.contains("1")) {
            System.out.println("El número telefónico no puede contener los dígitos 0 o 1.");
            return;
        }

        List<String> combinaciones = new ArrayList<>();
        generarCombinaciones(numeroTelefono, 0, "", combinaciones);

        // Escribir las combinaciones en un archivo
        try (FileWriter writer = new FileWriter("combinaciones.txt")) {
            for (String palabra : combinaciones) {
                writer.write(palabra + "\n");
            }
            System.out.println("Combinaciones escritas en el archivo 'combinaciones.txt'.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    // Método recursivo para generar combinaciones
    private static void generarCombinaciones(String numeroTelefono, int indice, String combinacionActual, List<String> combinaciones) {
        // Caso base: si hemos procesado todos los dígitos, agregamos la combinación
        if (indice == numeroTelefono.length()) {
            combinaciones.add(combinacionActual);
            return;
        }

        // Obtener las letras correspondientes al dígito actual
        char digito = numeroTelefono.charAt(indice);
        String letras = DIGITOS_A_LETRAS.get(digito);

        // Generar combinaciones para cada letra asociada al dígito
        for (int i = 0; i < letras.length(); i++) {
            generarCombinaciones(numeroTelefono, indice + 1, combinacionActual + letras.charAt(i), combinaciones);
        }
    }
}

