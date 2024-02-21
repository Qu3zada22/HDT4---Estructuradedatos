package org.Angginathan;

public class CalculadoraInfix {
    public static int evaluar(String infixExpression) {
        String postfixExpression = InfixToPostfixConverter.convert(infixExpression);
        return CalculadoraPostfix.evaluar(postfixExpression);
    }
}
