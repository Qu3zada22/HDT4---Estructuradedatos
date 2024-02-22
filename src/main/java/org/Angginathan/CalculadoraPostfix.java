package org.Angginathan;

import java.util.EmptyStackException;

/**
 * Clase para evaluar expresiones postfix utilizando una pila.
 *
 * @param <T> el tipo de elementos que contendrá la pila
 */
public class CalculadoraPostfix<T extends Number> {
    private static CalculadoraPostfix instance = null;

    /* Constructor */
    public CalculadoraPostfix() {
    }

    /* Utilización de patrón de diseño Singleton */
    public static CalculadoraPostfix getInstance() {
        if (instance == null) {
            instance = new CalculadoraPostfix();
        }
        return instance;
    }

    public T Fixcalc(String notation, UVGQueue<T> stack) {
        char[] characters = notation.toCharArray();
        try {
            for (char x : characters) {
                if (Character.isDigit(x)) {
                    stack.enqueue((T) (Object) Integer.parseInt(String.valueOf(x)));
                } else {
                    if (x != ' ') {
                        T op2 = stack.dequeue();
                        T op1 = stack.dequeue();

                        switch (x) {
                            case '+':
                                stack.enqueue((T) (Object) (op1.intValue() + op2.intValue()));
                                break;
                            case '-':
                                stack.enqueue((T) (Object) (op1.intValue() - op2.intValue()));
                                break;
                            case '*':
                                stack.enqueue((T) (Object) (op1.intValue() * op2.intValue()));
                                break;
                            case '/':
                                if (op2.intValue() == 0) {
                                    throw new ArithmeticException("División por cero");
                                }
                                stack.enqueue((T) (Object) (op1.intValue() / op2.intValue()));
                                break;
                            default:
                                throw new IllegalArgumentException("Operador no reconocido: " + x);
                        }
                    }
                }
            }
        } catch (EmptyStackException e) {
            System.err.println("Error: Operadores insuficientes en la pila.");
            return null;
        }

        return stack.dequeue();
    }
}