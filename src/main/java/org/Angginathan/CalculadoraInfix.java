package org.Angginathan;

public class CalculadoraInfix {
    public static int evaluar(String infixExpression) {
        String postfixExpression = ConversorInfixAPostfix.convertir(infixExpression);
        return CalculadoraPostfix.evaluar(postfixExpression);
    }
}
