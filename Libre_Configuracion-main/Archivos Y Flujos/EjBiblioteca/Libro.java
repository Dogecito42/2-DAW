package EjBiblioteca;

public class Libro {
    // Atributos de la clase
    private String titulo;
    private String autor;
    private String isbn;

    // Constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        setIsbn(isbn); // Usamos setIsbn para validar el ISBN
    }

    // Métodos get y set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        // Comprobamos la validez del ISBN
        if (compruebaIsbn10(isbn) || compruebaIsbn13(isbn)) {
            this.isbn = isbn;
        } else {
            throw new IllegalArgumentException("ISBN no válido");
        }
    }

    // Método privado para validar ISBN-10
    private boolean compruebaIsbn10(String isbn) {
        if (isbn.length() != 10) return false;

        int suma = 0;
        for (int i = 0; i < 9; i++) {
            if (Character.isDigit(isbn.charAt(i))) {
                suma += (isbn.charAt(i) - '0') * (10 - i);
            } else {
                return false;
            }
        }

        char checkChar = isbn.charAt(9);
        if (checkChar == 'X') {
            suma += 10;  // 'X' representa 10 en el cálculo del ISBN-10
        } else if (Character.isDigit(checkChar)) {
            suma += (checkChar - '0');
        } else {
            return false;
        }

        return suma % 11 == 0;
    }

    // Método privado para validar ISBN-13
    private boolean compruebaIsbn13(String isbn) {
        if (isbn.length() != 13) return false;

        int suma = 0;
        for (int i = 0; i < 12; i++) {
            if (!Character.isDigit(isbn.charAt(i))) return false;

            int digit = isbn.charAt(i) - '0';
            if (i % 2 == 0) {
                suma += digit;
            } else {
                suma += digit * 3;
            }
        }

        // Dígito de control
        int digitoControl = isbn.charAt(12) - '0';
        int resto = suma % 10;
        int controlCalculado = 10 - resto;

        // Si el controlCalculado coincide con el dígito de control, el ISBN es válido
        return controlCalculado == digitoControl;
    }
}


