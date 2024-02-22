package org.Angginathan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase para leer el contenido de un archivo de texto.
 */
public class LectorArchivos {
    
    /**
     * Lee el contenido de un archivo de texto y lo devuelve como una cadena de caracteres.
     *
     * @param nombreArchivo el nombre o la ruta del archivo a leer
     * @return una cadena de caracteres que representa el contenido del archivo
     * @throws IOException si ocurre un error de lectura del archivo
     */
    public static String leerArchivo(String nombreArchivo) throws IOException {
        StringBuilder contenido = new StringBuilder();
        BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        while ((linea = lector.readLine()) != null) {
            contenido.append(linea).append("\n");
        }
        lector.close();
        return contenido.toString();
    }
}
