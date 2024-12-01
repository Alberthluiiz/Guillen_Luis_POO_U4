package test;

import modelo.Documental;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase Documental.
 */
public class DocumentalTest {

    @Test
    public void testCrearDocumental() {
        // Crear un documental de prueba
        Documental documental = new Documental("Planet Earth", 90, "Nature", "Wildlife");

        // Verificar los valores de los atributos
        assertEquals("Planet Earth", documental.getTitulo());
        assertEquals(90, documental.getDuracionMinutos());
        assertEquals("Nature", documental.getGenero());
        assertEquals("Wildlife", documental.getTema());
    }

    @Test
    public void testSetTema() {
        // Crear un documental y cambiar el tema
        Documental documental = new Documental("Our Planet", 60, "Nature", "Oceans");
        documental.setTema("Forests");

        // Verificar que el tema se actualizó correctamente
        assertEquals("Forests", documental.getTema());
    }
}
