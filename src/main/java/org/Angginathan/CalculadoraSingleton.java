package org.Angginathan;

public class CalculadoraSingleton {
    private static CalculadoraSingleton instancia;

    private CalculadoraSingleton() {}

    public static CalculadoraSingleton getInstance() {
        if (instancia == null) {
            instancia = new CalculadoraSingleton();
        }
        return instancia;
    }

    public int evaluarExpresion(String expresion, UVGQueue<T> estructura) {
        String postfixExpression = ConversorInfixAPostfix.convertir(expresion);
        return CalculadoraPostfix.evaluar(postfixExpression, estructura);
    }
}
