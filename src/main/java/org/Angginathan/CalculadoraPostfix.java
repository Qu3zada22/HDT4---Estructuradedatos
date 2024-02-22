package org.Angginathan;

public class CalculadoraPostfix {
    public static <T> int evaluar(String postfixExpression, UVGQueue<Integer> stack) {
        // Usaremos una estructura de datos que implemente UVGQueue para simular la pila

        String[] tokens = postfixExpression.split(" ");

        for (String token : tokens) {
            if (esOperador(token)) {
                int operand2 = stack.dequeue();
                int operand1 = stack.dequeue();
                int result = realizarOperacion(operand1, operand2, token);
                stack.enqueue(result);
            } else {
                stack.enqueue(Integer.parseInt(token));
            }
        }

        return stack.front(); // El resultado debe estar en el frente de la pila
    }

    private static boolean esOperador(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int realizarOperacion(int operand1, int operand2, String operador) {
        switch (operador) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("División por cero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }
}
