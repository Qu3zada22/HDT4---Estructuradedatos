package org.Angginathan;

public class ListaFactory<T> {
    public UVGLList<T> crearLista(String tipo) {
        switch (tipo) {
            case "simple":
                return new ListaSimple<T>();
            case "doble":
                return new ListaDoble<T>();
            // Agrega otros tipos de lista si es necesario
            default:
                throw new IllegalArgumentException("Tipo de lista no válido");
        }
    }
}
