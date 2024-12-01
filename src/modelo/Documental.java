package modelo;
public class Documental extends ContenidoAudiovisual {
    private String tema;

    public Documental(String titulo, int duracionMinutos, String genero, String tema) {
        super(titulo, duracionMinutos, genero);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Documental: " + getTitulo() + " | Tema: " + tema +
                " | Duración: " + getDuracionMinutos() + " minutos");
    }
}
