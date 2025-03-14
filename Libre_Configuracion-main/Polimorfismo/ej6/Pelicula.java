package ej6;

// Clase Pelicula que hereda de Multimedia
public class Pelicula extends Multimedia {
    private String actorPrincipal;
    private String actrizPrincipal;

    // Constructor
    public Pelicula(String titulo, String autor, String formato, double duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        if (actorPrincipal == null && actrizPrincipal == null) {
            throw new IllegalArgumentException("Debe proporcionarse al menos un actor o una actriz principal.");
        }
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    // Métodos Getter
    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    // Sobreescribir el método toString()
    @Override
    public String toString() {
        return super.toString() + ", Actor principal: " + actorPrincipal + ", Actriz principal: " + actrizPrincipal;
    }
}
