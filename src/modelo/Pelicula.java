package modelo;
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;

    public Pelicula(String titulo, int duracionMinutos, String genero, String estudio) {
        super(titulo, duracionMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Pelicula: " + getTitulo() + " | Genero: " + getGenero() +
                " | Duración: " + getDuracionMinutos() + " minutos | Estudio: " + estudio);
    }
}
