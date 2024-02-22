package org.Angginathan;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            UVGQueue<Integer> stack = null;

            System.out.println("¿Qué estructura de datos desea utilizar?");
            System.out.println("1. ArrayList");
            System.out.println("2. Vector");
            System.out.println("3. Lista");

            int opcionEstructura = scanner.nextInt();

            if (opcionEstructura == 1 || opcionEstructura == 2) {
                VectorFactory<Integer> vectorFactory = new VectorFactory<>();
                stack = vectorFactory.crearEstructura("stack", null);
            } else if (opcionEstructura == 3) {
                System.out.println("¿Qué tipo de lista desea utilizar?");
                System.out.println("1. Simple");
                System.out.println("2. Doble");

                int opcionLista = scanner.nextInt();
                String tipoLista = (opcionLista == 1) ? "simple" : "doble";

                ListaFactory<Integer> listaFactory = new ListaFactory<>();
                UVGLList<Integer> lista = listaFactory.crearLista(tipoLista);

                FucionList<Integer> fusionList = new FucionList<>(tipoLista);
                stack = fusionList;
            } else {
                System.out.println("Opción no válida");
                return;
            }

            // Leer expresión infix desde el archivo datos.txt
            String expresionInfix = LectorArchivos.leerArchivo("src\\main\\java\\org\\Angginathan\\datos.txt");

            // Evaluar la expresión usando la calculadora singleton
            String postfixExpression = ConversorInfixAPostfix.convertir(expresionInfix);
            System.out.println("Infix: " + expresionInfix);
            System.out.println("Postfix: " + postfixExpression);

            CalculadoraPostfix<Integer> calc = CalculadoraPostfix.getInstance();
            Integer result = calc.Fixcalc(postfixExpression, stack);
            System.out.println("Resultado: " + result);

            scanner.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
