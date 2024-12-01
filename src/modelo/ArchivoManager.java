package modelo;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoManager {

    // Método para leer un archivo línea por línea y devolver una lista de cadenas
    public static List<String> leerArchivo(String ruta) throws IOException {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        }
        return lineas;
    }

    // Método para escribir una lista de cadenas en un archivo
    public static void escribirArchivo(String ruta, List<String> contenido) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (String linea : contenido) {
                bw.write(linea);
                bw.newLine();
            }
        }
    }
}
