/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RegEx;

/**
 *
 * @author Usuario
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String cadena = "TuCadenaAqui"; // Cambia este valor para probar las expresiones

        // 1. Validar un número entero
        boolean esEntero = cadena.matches("^-?\\d+$");
        System.out.println("1. Es un número entero: " + esEntero);

        // 2. Validar un número entero positivo
        boolean esEnteroPositivo = cadena.matches("^\\d+$");
        System.out.println("2. Es un número entero positivo: " + esEnteroPositivo);

        // 3. Validar un número entero negativo
        boolean esEnteroNegativo = cadena.matches("^-\\d+$");
        System.out.println("3. Es un número entero negativo: " + esEnteroNegativo);

        // 4. Validar DNI, 8 números y una letra al final
        boolean esDNI = cadena.matches("^\\d{8}[A-Za-z]$");
        System.out.println("4. Es un DNI válido: " + esDNI);

        // 5. Validar una IP
        boolean esIP = cadena.matches("^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$");
        System.out.println("5. Es una IP válida: " + esIP);

        // 6. Validar una matrícula de coche con formato 0000XXX
        boolean esMatricula = cadena.matches("^\\d{4}[A-Z]{3}$");
        System.out.println("6. Es una matrícula válida: " + esMatricula);

        // 7. Validar un número binario
        boolean esBinario = cadena.matches("^[01]+$");
        System.out.println("7. Es un número binario: " + esBinario);

        // 8. Validar un número octal
        boolean esOctal = cadena.matches("^[0-7]+$");
        System.out.println("8. Es un número octal: " + esOctal);

        // 9. Validar un número hexadecimal
        boolean esHexadecimal = cadena.matches("^[0-9A-Fa-f]+$");
        System.out.println("9. Es un número hexadecimal: " + esHexadecimal);

        // 10. Validar número real
        boolean esReal = cadena.matches("^-?\\d+\\.\\d+$");
        System.out.println("10. Es un número real: " + esReal);

        // 11. Validar número real positivo
        boolean esRealPositivo = cadena.matches("^\\d+\\.\\d+$");
        System.out.println("11. Es un número real positivo: " + esRealPositivo);

        // 12. Validar número real negativo
        boolean esRealNegativo = cadena.matches("^-\\d+\\.\\d+$");
        System.out.println("12. Es un número real negativo: " + esRealNegativo);

        // 13. Validar número real con x decimales
        int x = 2; // Cambia x según el número de decimales deseado
        boolean esRealConXDecimales = cadena.matches("^-?\\d+\\.\\d{" + x + "}$");
        System.out.println("13. Es un número real con " + x + " decimales: " + esRealConXDecimales);

        // 14. Validar número real positivo con x decimales
        boolean esRealPositivoConXDecimales = cadena.matches("^\\d+\\.\\d{" + x + "}$");
        System.out.println("14. Es un número real positivo con " + x + " decimales: " + esRealPositivoConXDecimales);

        // 15. Validar número real negativo con x decimales
        boolean esRealNegativoConXDecimales = cadena.matches("^-\\d+\\.\\d{" + x + "}$");
        System.out.println("15. Es un número real negativo con " + x + " decimales: " + esRealNegativoConXDecimales);

        // 16. Validar una fecha con formato dd/mm/aaaa
        boolean esFecha = cadena.matches("^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/\\d{4}$");
        System.out.println("16. Es una fecha válida: " + esFecha);

        // 17. Validar un nombre, incluyendo nombres compuestos
        boolean esNombre = cadena.matches("^[A-Za-z]+( [A-Za-z]+)*$");
        System.out.println("17. Es un nombre válido: " + esNombre);

        // 18. Validar un email
        boolean esEmail = cadena.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        System.out.println("18. Es un email válido: " + esEmail);

        // 19. Validar un nombre de usuario en Twitter
        boolean esNombreTwitter = cadena.matches("^@[A-Za-z0-9_-]+$");
        System.out.println("19. Es un nombre de usuario de Twitter válido: " + esNombreTwitter);

        // 20. Validar ISBN de 13 dígitos, siempre empieza en 978 o 979
        boolean esISBN = cadena.matches("^(978|979)\\d{10}$");
        System.out.println("20. Es un ISBN válido: " + esISBN);
    }
    
}
