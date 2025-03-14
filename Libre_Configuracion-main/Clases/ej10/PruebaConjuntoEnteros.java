package ej10;

public class PruebaConjuntoEnteros {
    public static void main(String[] args) {
        // Crear dos conjuntos
        ConjuntoEnteros conjunto1 = new ConjuntoEnteros();
        ConjuntoEnteros conjunto2 = new ConjuntoEnteros();

        // Insertar elementos en los conjuntos
        conjunto1.insertarElemento(1);
        conjunto1.insertarElemento(2);
        conjunto1.insertarElemento(3);

        conjunto2.insertarElemento(3);
        conjunto2.insertarElemento(4);
        conjunto2.insertarElemento(5);

        // Imprimir los conjuntos
        System.out.println("Conjunto 1: " + conjunto1.aStringConjunto());
        System.out.println("Conjunto 2: " + conjunto2.aStringConjunto());

        // Verificar si un número está en el conjunto
        System.out.println("¿El número 3 está en el conjunto 1? " + conjunto1.esta(3)); // true
        System.out.println("¿El número 4 está en el conjunto 1? " + conjunto1.esta(4)); // false

        // Eliminar un número de un conjunto
        conjunto1.eliminarElemento(2);
        System.out.println("Conjunto 1 después de eliminar el 2: " + conjunto1.aStringConjunto());

        // Verificar si dos conjuntos son iguales
        System.out.println("¿Son iguales conjunto1 y conjunto2? " + conjunto1.esIgualA(conjunto2)); // false

        // Realizar la unión de los conjuntos
        ConjuntoEnteros conjuntoUnion = ConjuntoEnteros.union(conjunto1, conjunto2);
        System.out.println("Unión de conjunto1 y conjunto2: " + conjuntoUnion.aStringConjunto());

        // Realizar la intersección de los conjuntos
        ConjuntoEnteros conjuntoInterseccion = ConjuntoEnteros.interseccion(conjunto1, conjunto2);
        System.out.println("Intersección de conjunto1 y conjunto2: " + conjuntoInterseccion.aStringConjunto());
    }
}
