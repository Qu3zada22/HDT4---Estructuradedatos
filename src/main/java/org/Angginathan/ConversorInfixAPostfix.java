package org.Angginathan;

import java.util.Stack;

/**
 * Clase para convertir expresiones infix a postfix.
 */
public class ConversorInfixAPostfix {
    
    /**
     * Convierte una expresión infix a postfix.
     *
     * @param infixExpression la expresión infix a convertir
     * @return la expresión en formato postfix
     */
    public static String convertir(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // Eliminar espacios en blanco de la expresión infix
        infixExpression = infixExpression.replaceAll("\\s", "");

        for (int i = 0; i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                // Si el caracter es una letra o un dígito, se agrega directamente al resultado postfix
                postfix.append(ch).append(" ");
            } else if (ch == '(') {
                // Si el caracter es un paréntesis de apertura, se coloca en la pila
                stack.push(ch);
            } else if (ch == ')') {
                // Si el caracter es un paréntesis de cierre, se desapilan los operadores hasta encontrar el paréntesis de apertura correspondiente
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.pop(); // Se desapila el paréntesis de apertura
            } else {
                // Si el caracter es un operador
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    // Mientras haya operadores en la pila con igual o mayor precedencia, se desapilan
                    postfix.append(stack.pop()).append(" ");
                }
                stack.push(ch); // Se agrega el operador actual a la pila
            }
        }

        // Desapilar todos los operadores restantes en la pila
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Expresión infix no válida"; // Si hay un paréntesis de apertura sin su correspondiente de cierre, la expresión no es válida
            }
            postfix.append(stack.pop()).append(" ");
        }

        return postfix.toString().trim(); // Eliminar el espacio en blanco adicional al final
    }

    /**
     * Determina la precedencia de un operador.
     *
     * @param operator el operador a evaluar
     * @return el nivel de precedencia del operador
     */
    private static int precedence(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1; // Operador no válido
        }
    }
}
