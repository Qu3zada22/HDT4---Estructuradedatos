package org.Angginathan;

public class CalculadoraInfix {
    public static int evaluar(String infixExpression, UVGQueue<Integer> stack) {
        String postfixExpression = ConversorInfixAPostfix.convertir(infixExpression);
        return CalculadoraPostfix.evaluar(postfixExpression, stack);
    }
}
