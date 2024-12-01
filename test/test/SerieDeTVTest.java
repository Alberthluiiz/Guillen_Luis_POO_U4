package test;
import modelo.SerieDeTV;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase SerieDeTV.
 */
public class SerieDeTVTest {

    @Test
    public void testCrearSerieDeTV() {
        // Crear una serie de TV de prueba
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 50, "Drama", 5);

        // Verificar los valores de los atributos
        assertEquals("Breaking Bad", serie.getTitulo());
        assertEquals(50, serie.getDuracionMinutos());
        assertEquals("Drama", serie.getGenero());
        assertEquals(5, serie.getTemporadas());
    }

    @Test
    public void testSetTemporadas() {
        // Crear una serie de TV y cambiar el número de temporadas
        SerieDeTV serie = new SerieDeTV("Stranger Things", 60, "Drama", 4);
        serie.setTemporadas(5);

        // Verificar que el número de temporadas se actualizó correctamente
        assertEquals(5, serie.getTemporadas());
    }
}
