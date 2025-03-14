package ej14;

public class DNI {
    private int numeroDni;  // Número del DNI (solo las cifras)

    // Constructor sin argumentos, inicializa el DNI a 0
    public DNI() {
        numeroDni = 0;
    }

    // Constructor que permite inicializar el DNI a partir de un número
    public DNI(int numeroDni) throws Exception {
        setDni(numeroDni);
    }

    // Constructor que permite inicializar el DNI a partir del NIF completo (número + letra)
    public DNI(String nif) throws Exception {
        setDni(nif);
    }

    // Método que devuelve el número de DNI
    public int getNumeroDni() {
        return numeroDni;
    }

    // Método que devuelve el NIF completo (número + letra)
    public String getNif() {
        return numeroDni + String.valueOf(calcularLetraNIF(numeroDni));
    }

    // Método para establecer el DNI a partir de un número (solo cifras)
    public void setDni(int numeroDni) throws Exception {
        if (numeroDni < 0 || numeroDni > 99999999) {
            throw new Exception("Número de DNI inválido. Debe ser un número entre 0 y 99,999,999.");
        }
        this.numeroDni = numeroDni;
    }

    // Método para establecer el DNI a partir del NIF completo (número + letra)
    public void setDni(String nif) throws Exception {
        if (!validarNif(nif)) {
            throw new Exception("NIF inválido.");
        }
        this.numeroDni = extraerNumeroDni(nif);
    }

    // Método privado estático para calcular la letra del NIF a partir del número de DNI
    private static char calcularLetraNIF(int numeroDni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[numeroDni % 23];
    }

    // Método privado estático para validar un NIF completo (número + letra)
    private static boolean validarNif(String nif) {
        if (nif == null || nif.length() != 9) {
            return false;  // Longitud incorrecta
        }
        int numeroDni = extraerNumeroDni(nif);
        char letra = extraerLetraNif(nif);
        return letra == calcularLetraNIF(numeroDni);
    }

    // Método privado estático para extraer la letra del NIF
    private static char extraerLetraNif(String nif) {
        return nif.charAt(nif.length() - 1);  // Último carácter es la letra
    }

    // Método privado estático para extraer el número de DNI de un NIF
    private static int extraerNumeroDni(String nif) {
        try {
            return Integer.parseInt(nif.substring(0, 8));  // Los primeros 8 caracteres son el número
        } catch (NumberFormatException e) {
            return -1;  // Si la conversión falla, es un NIF inválido
        }
    }

    // Método main para probar la clase DNI
    public static void main(String[] args) {
        try {
            // Crear un DNI a partir del número
            DNI dni1 = new DNI(12345678);
            System.out.println("DNI número: " + dni1.getNumeroDni());
            System.out.println("NIF completo: " + dni1.getNif());

            // Crear un DNI a partir del NIF completo
            DNI dni2 = new DNI("12345678Z");
            System.out.println("DNI número: " + dni2.getNumeroDni());
            System.out.println("NIF completo: " + dni2.getNif());

            // Modificar el DNI a partir del número
            dni1.setDni(87654321);
            System.out.println("Nuevo NIF completo: " + dni1.getNif());

            // Modificar el DNI a partir del NIF completo
            dni2.setDni("87654321R");
            System.out.println("Nuevo NIF completo: " + dni2.getNif());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
