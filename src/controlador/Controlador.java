package controlador;
import modelo.*;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<ContenidoAudiovisual> contenidos;

    public Controlador() {
        this.contenidos = new ArrayList<>();
    }

    public void agregarContenido(ContenidoAudiovisual contenido) {
        contenidos.add(contenido);
    }

    public void mostrarTodosLosContenidos() {
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
