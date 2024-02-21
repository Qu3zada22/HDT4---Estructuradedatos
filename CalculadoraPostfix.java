import java.util.Stack;

public class CalculadoraPostfix {
    public static int evaluar(String postfixExpression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = postfixExpression.split(" ");

        for (String token : tokens) {
            if (esOperador(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = realizarOperacion(operand1, operand2, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
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
