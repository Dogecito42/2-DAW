package ej6;

// Clase ListaMultimedia para almacenar objetos Multimedia
public class ListaMultimedia {
    private Multimedia[] lista;
    private int contador;

    // Constructor
    public ListaMultimedia(int capacidad) {
        lista = new Multimedia[capacidad];
        contador = 0;
    }

    // Método size()
    public int size() {
        return contador;
    }

    // Método add()
    public boolean add(Multimedia m) {
        if (listaLlena()) {
            return false;
        }
        lista[contador] = m;
        contador++;
        return true;
    }

    // Método get()
    public Multimedia get(int position) {
        if (position < 0 || position >= contador) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
        return lista[position];
    }

    // Método toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contador; i++) {
            sb.append(lista[i].toString()).append("\n");
        }
        return sb.toString();
    }

    // Método privado para comprobar si la lista está llena
    private boolean listaLlena() {
        return contador >= lista.length;
    }
}
