package vista;

import controlador.Controlador;
import modelo.*;

public class VistaConsola {
    public static void main(String[] args) {
        Controlador obj = new Controlador();
        Presentacion presentacionObj = new Presentacion();

        presentacionObj.presentacion();

        // Agregar contenidos
        obj.agregarContenido(new Pelicula("Inception", 148, "Sci-Fi", "Warner Bros"));
        obj.agregarContenido(new SerieDeTV("Stranger Things", 50, "Drama", 4));
        obj.agregarContenido(new Documental("Our Planet", 90, "Nature", "Wildlife"));

        // Mostrar todos los contenidos
        obj.mostrarTodosLosContenidos();
    }
}
