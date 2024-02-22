package org.Angginathan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Leer expresión postfix desde el archivo datos.txt
            String expresionInfix = leerExpresionInfixDesdeArchivo("src\\main\\java\\org\\Angginathan\\datos.txt");

            // Evaluar la expresión postfix utilizando la clase CalculadoraPostfix
            int resultadoPostfix = CalculadoraPostfix.evaluar(expresionInfix);
            System.out.println("Resultado de la expresión postfix: " + resultadoPostfix);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static String leerExpresionInfixDesdeArchivo(String nombreArchivo) throws IOException {
        StringBuilder expresionPostfix = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                expresionPostfix.append(linea.trim());
            }
        }
        return expresionPostfix.toString();
    }

}
