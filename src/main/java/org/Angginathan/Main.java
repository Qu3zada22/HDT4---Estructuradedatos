package org.Angginathan;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Leer expresión infix desde el archivo datos.txt
            String expresionInfix = LectorArchivos.leerArchivo("src\\main\\java\\org\\Angginathan\\datos.txt");

            // Obtener la estructura deseada
            EstructuraFactory<Integer> estructuraFactory = new EstructuraFactory<>();
            UVGQueue<Integer> estructura = estructuraFactory.crearEstructura("lista", "simple"); // Cambia "simple" por el tipo deseado

            // Evaluar la expresión usando la calculadora singleton
            CalculadoraSingleton calculadora = CalculadoraSingleton.getInstance();
            int resultado = calculadora.evaluarExpresion(expresionInfix);

            System.out.println("Resultado de la expresión: " + resultado);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
