package org.Angginathan;

public class VectorFactory<T> {
    public UVGQueue<T> crearEstructura(String tipo, String listaTipo) {
        switch (tipo) {
            case "stack":
                return new StackArrayList<T>();
            case "vector":
                return new StackVector<T>();
            default:
                throw new IllegalArgumentException("Tipo de estructura no válido");
        }
    }
}
