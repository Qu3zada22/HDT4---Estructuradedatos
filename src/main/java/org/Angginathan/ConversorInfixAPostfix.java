package org.Angginathan;

import java.util.Stack;

public class ConversorInfixAPostfix {
    public static String convertir(String expresionInfix, ) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> pila = new Stack<>();
        pila.push('#'); // Paso 2

        for (int i = 0; i < expresionInfix.length(); i++) {
            char ch = expresionInfix.charAt(i);

            if (Character.isLetterOrDigit(ch)) { // Paso 4
                postfix.append(ch); // Paso 5
            } else if (ch == '(') { // Paso 6
                pila.push(ch); // Paso 7
            } else if (ch == '^') { // Paso 8
                pila.push(ch); // Paso 9
            } else if (ch == ')') { // Paso 10
                while (pila.peek() != '(') { // Paso 11
                    postfix.append(pila.pop()); // Paso 12
                }
                pila.pop(); // Paso 15
            } else { // Paso 16
                while (!pila.isEmpty() && precedencia(ch) <= precedencia(pila.peek())) { // Paso 17
                    postfix.append(pila.pop()); // Paso 18
                }
                pila.push(ch); // Paso 21
            }
        }

        while (pila.peek() != '#') { // Paso 24
            postfix.append(pila.pop()); // Paso 25
        }

        pila.pop(); // Eliminar '#' adicional
        return postfix.toString(); // Paso 27
    }

    private static int precedencia(char operador) {
        switch (operador) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0; // Se considera que cualquier otro carácter tiene la menor precedencia
        }
    }
}
