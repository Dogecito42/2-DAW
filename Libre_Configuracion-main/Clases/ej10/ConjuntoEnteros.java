package ej10;

// Clase ConjuntoEnteros para trabajar con conjuntos de enteros.
public class ConjuntoEnteros {
    private boolean[] conjunto; // Representación interna del conjunto como un arreglo booleano

    // Constructor sin argumentos, inicializa el conjunto vacío
    public ConjuntoEnteros() {
        conjunto = new boolean[101]; // Los elementos pueden ser de 0 a 100
    }

    // Método para verificar si un número está en el conjunto
    public boolean esta(int numero) {
        if (numero >= 0 && numero <= 100) {
            return conjunto[numero];
        }
        return false; // Si el número no está en el rango válido
    }

    // Método para insertar un número en el conjunto
    public void insertarElemento(int numero) {
        if (numero >= 0 && numero <= 100) {
            conjunto[numero] = true;
        }
    }

    // Método para eliminar un número del conjunto
    public void eliminarElemento(int numero) {
        if (numero >= 0 && numero <= 100) {
            conjunto[numero] = false;
        }
    }

    // Método para obtener una cadena con los elementos del conjunto
    public String aStringConjunto() {
        StringBuilder sb = new StringBuilder();
        boolean conjuntoVacio = true;

        for (int i = 0; i <= 100; i++) {
            if (conjunto[i]) {
                if (!conjuntoVacio) {
                    sb.append(" "); // Añade un espacio si no es el primer elemento
                }
                sb.append(i);
                conjuntoVacio = false;
            }
        }

        // Si el conjunto está vacío, representarlo con ---
        if (conjuntoVacio) {
            return "---";
        }
        return sb.toString();
    }

    // Método para verificar si dos conjuntos son iguales
    public boolean esIgualA(ConjuntoEnteros otro) {
        for (int i = 0; i <= 100; i++) {
            if (this.conjunto[i] != otro.conjunto[i]) {
                return false;
            }
        }
        return true;
    }

    // Método estático para realizar la unión de dos conjuntos
    public static ConjuntoEnteros union(ConjuntoEnteros conjunto1, ConjuntoEnteros conjunto2) {
        ConjuntoEnteros conjuntoUnion = new ConjuntoEnteros();
        for (int i = 0; i <= 100; i++) {
            if (conjunto1.esta(i) || conjunto2.esta(i)) {
                conjuntoUnion.insertarElemento(i);
            }
        }
        return conjuntoUnion;
    }

    // Método estático para realizar la intersección de dos conjuntos
    public static ConjuntoEnteros interseccion(ConjuntoEnteros conjunto1, ConjuntoEnteros conjunto2) {
        ConjuntoEnteros conjuntoInterseccion = new ConjuntoEnteros();
        for (int i = 0; i <= 100; i++) {
            if (conjunto1.esta(i) && conjunto2.esta(i)) {
                conjuntoInterseccion.insertarElemento(i);
            }
        }
        return conjuntoInterseccion;
    }
}
