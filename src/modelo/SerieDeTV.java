package modelo;
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;

    public SerieDeTV(String titulo, int duracionMinutos, String genero, int temporadas) {
        super(titulo, duracionMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Serie: " + getTitulo() + " | Genero: " + getGenero() +
                " | Temporadas: " + temporadas);
    }
}
