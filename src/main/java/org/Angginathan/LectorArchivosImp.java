package org.Angginathan;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LectorArchivosImp {
    public String leerArchivo(String nombreArchivo) throws IOException {
        return new String(Files.readAllBytes(Paths.get(nombreArchivo)));
    }
}
