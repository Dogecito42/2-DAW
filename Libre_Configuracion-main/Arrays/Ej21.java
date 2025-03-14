/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] articulo = {"el", "un", "algún", "ningún"};
        String[] sustantivo = {"niño", "niña", "perro", "ciudad", "coche"};
        String[] verbo = {"condujo", "salto", "corrió", "camino", "omitió"};
        String[] preposicion = {"a", "desde", "encima de", "debajo de", "sobre"};

        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            String art = articulo[rand.nextInt(articulo.length)];
            String sust = sustantivo[rand.nextInt(sustantivo.length)];
            String verb = verbo[rand.nextInt(verbo.length)];
            String prep = preposicion[rand.nextInt(preposicion.length)];
            String sust2 = sustantivo[rand.nextInt(sustantivo.length)];

            String enunciado = art + " " + sust + " " + verb + " " + prep + " " + art + " " + sust2 + ".";
            
            enunciado = enunciado.substring(0, 1).toUpperCase() + enunciado.substring(1);

            System.out.println(enunciado);
        }
    }
    
}
