/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

/**
 *
 * @author Usuario
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
   
    //a)
    int g() {
    System.out.println("Dentro del metodo g");
    return 0; // Retorna un valor entero
}

int h() {
    System.out.println("Dentro del método h");
    return 0; // Retorna un valor entero
}
    
//b)

    int suma(int x, int y) {
    int resultado;
    resultado = x + y;
    return resultado; // Retorna el resultado de la suma
}

    
    //c)
    
    void f(float a) {
    System.out.println(a); // Usa el argumento `a` correctamente
}

    //d)
    
    int producto() {
    int a = 6, b = 5, c = 4, resultado;
    resultado = a * b * c;
    System.out.printf("El resultado es %d\n", resultado); // Imprime el resultado
    return resultado; // Retorna el resultado
}

}
