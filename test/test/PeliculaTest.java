package test;

import modelo.Pelicula;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase Pelicula.
 */
public class PeliculaTest {

    @Test
    public void testCrearPelicula() {
        // Crear una película de prueba
        Pelicula pelicula = new Pelicula("Matrix", 120, "Sci-Fi", "Warner Bros");

        // Verificar los valores de los atributos
        assertEquals("Matrix", pelicula.getTitulo());
        assertEquals(120, pelicula.getDuracionMinutos());
        assertEquals("Sci-Fi", pelicula.getGenero());
        assertEquals("Warner Bros", pelicula.getEstudio());
    }
}
