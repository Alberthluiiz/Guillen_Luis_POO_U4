package modelo;
public abstract class ContenidoAudiovisual {
    private static int contador = 1; // Generador único de IDs
    private int id;
    private String titulo;
    private int duracionMinutos;
    private String genero;

    public ContenidoAudiovisual(String titulo, int duracionMinutos, String genero) {
        this.id = contador++;
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public abstract void mostrarDetalles(); // Método abstracto
}
