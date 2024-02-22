package org.Angginathan;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Clase para leer el contenido de un archivo de texto utilizando Java NIO.
 */
public class LectorArchivosImp {
    
    /**
     * Lee el contenido de un archivo de texto y lo devuelve como una cadena de caracteres.
     *
     * @param nombreArchivo el nombre o la ruta del archivo a leer
     * @return una cadena de caracteres que representa el contenido del archivo
     * @throws IOException si ocurre un error de lectura del archivo
     */
    public String leerArchivo(String nombreArchivo) throws IOException {
        // Lee el contenido del archivo y lo convierte en una matriz de bytes
        byte[] contenidoBytes = Files.readAllBytes(Paths.get(nombreArchivo));
        // Convierte la matriz de bytes en una cadena de caracteres y la devuelve
        return new String(contenidoBytes);
    }
}
