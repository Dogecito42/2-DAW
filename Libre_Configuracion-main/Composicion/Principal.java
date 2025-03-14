import Composicion.Fecha;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Leer datos de las personas
        Persona[] personas = leerPersonas();

        // Mostrar las personas
        mostrar(personas);

        // Número de personas
        System.out.println("Número de personas: " + numeroDePersonas(personas));

        // Persona mayor de edad
        Persona personaMayorEdad = personaMayorEdad(personas);
        System.out.println("\nPersona de mayor edad:\n" + personaMayorEdad);

        // Personas que viven en una población
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce una ciudad para ver cuántas personas viven en ella: ");
        String ciudad = scanner.nextLine();
        System.out.println("Número de personas que viven en " + ciudad + ": " + cuantasPersonasVivenEn(personas, ciudad));

        // Personas mayores de edad
        System.out.println("Número de personas mayores de edad: " + personasMayoresDeEdad(personas));
    }

    // Método que lee las personas desde el teclado
    public static Persona[] leerPersonas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de personas: ");
        int numPersonas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Persona[] personas = new Persona[numPersonas];

        for (int i = 0; i < numPersonas; i++) {
            System.out.println("\nPersona " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();

            System.out.print("Código Postal: ");
            String codigoPostal = scanner.nextLine();

            System.out.print("Ciudad: ");
            String ciudad = scanner.nextLine();

            System.out.print("Fecha de Nacimiento (día, mes, año): ");
            int dia = scanner.nextInt();
            int mes = scanner.nextInt();
            int año = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            Fecha fechaNacimiento = new Fecha(dia, mes, año);

            personas[i] = new Persona(nombre, direccion, codigoPostal, ciudad, fechaNacimiento);
        }

        return personas;
    }

    // Método que muestra la información de todas las personas
    public static void mostrar(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println("\n" + persona);
        }
    }

    // Método que devuelve el número de personas en el array
    public static int numeroDePersonas(Persona[] personas) {
        return personas.length;
    }

    // Método que devuelve la persona de mayor edad
    public static Persona personaMayorEdad(Persona[] personas) {
        Persona personaMayorEdad = personas[0];

        for (Persona persona : personas) {
            if (persona.calcularEdad() > personaMayorEdad.calcularEdad()) {
                personaMayorEdad = persona;
            }
        }

        return personaMayorEdad;
    }

    // Método que devuelve cuántas personas viven en una población
    public static int cuantasPersonasVivenEn(Persona[] personas, String ciudad) {
        int count = 0;

        for (Persona persona : personas) {
            if (persona.getCiudad().equalsIgnoreCase(ciudad)) {
                count++;
            }
        }

        return count;
    }

    // Método que devuelve cuántas personas son mayores de edad
    public static int personasMayoresDeEdad(Persona[] personas) {
        int count = 0;

        for (Persona persona : personas) {
            if (persona.esMayorDeEdad()) {
                count++;
            }
        }

        return count;
    }
}

