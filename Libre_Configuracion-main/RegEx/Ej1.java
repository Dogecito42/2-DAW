/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RegEx;

import java.util.regex.Pattern;

/**
 *
 * @author Usuario
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String cadena = "Madero.Aternos.Me"; 
        // 1. Comprobar si el String cadena contiene exactamente el patrón “abc”
        boolean exactMatch = cadena.matches("abc");
        System.out.println("1. Contiene exactamente 'abc': " + exactMatch);

        // 2. Comprobar si el String cadena contiene “abc”
        boolean containsAbc = Pattern.compile("abc").matcher(cadena).find();
        System.out.println("2. Contiene 'abc': " + containsAbc);

        // 3. Comprobar si el String cadena empieza por “abc”
        boolean startsWithAbc = cadena.matches("^abc.*");
        System.out.println("3. Empieza por 'abc': " + startsWithAbc);

        // 4. Comprobar si el String cadena empieza por “abc” ó “Abc”
        boolean startsWithAbcOrAbc = cadena.matches("^[aA]bc.*");
        System.out.println("4. Empieza por 'abc' o 'Abc': " + startsWithAbcOrAbc);

        // 5. Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10
        boolean lengthBetween5and10 = cadena.matches("^[a-zA-Z]{5,10}$");
        System.out.println("5. Formado por entre 5 y 10 letras: " + lengthBetween5and10);

        // 6. Comprobar si el String cadena no empieza por un dígito
        boolean notStartWithDigit = cadena.matches("^[^\\d].*");
        System.out.println("6. No empieza por un dígito: " + notStartWithDigit);

        // 7. Comprobar si el String cadena no acaba con un dígito
        boolean notEndWithDigit = cadena.matches(".*[^\\d]$");
        System.out.println("7. No acaba con un dígito: " + notEndWithDigit);

        // 8. Comprobar si el String cadena solo contiene los caracteres a ó b
        boolean onlyAorB = cadena.matches("[ab]*");
        System.out.println("8. Solo contiene 'a' o 'b': " + onlyAorB);

        // 9. Comprobar si el String cadena contiene un 1 y ese 1 no está seguido por un 2
        boolean oneNotFollowedByTwo = cadena.matches(".*1(?!2).*");
        System.out.println("9. Contiene un '1' que no está seguido por un '2': " + oneNotFollowedByTwo);
    }
    
}
