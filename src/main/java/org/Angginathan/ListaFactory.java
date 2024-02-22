package org.Angginathan;

/**
 * Factory class para crear instancias de diferentes tipos de listas.
 *
 * @param <T> el tipo de elementos que contendrá la lista
 */
public class ListaFactory<T> {
    /**
     * Método para crear una instancia de una lista según el tipo especificado.
     *
     * @param tipo el tipo de lista a crear ("simple" para ListaSimple, "doble" para ListaDoble)
     * @return una instancia de la lista correspondiente al tipo especificado
     * @throws IllegalArgumentException si se especifica un tipo de lista no válido
     */
    public UVGLList<T> crearLista(String tipo) {
        switch (tipo) {
            case "simple":
                return new ListaSimple<T>(); // Crea una instancia de ListaSimple
            case "doble":
                return new ListaDoble<T>(); // Crea una instancia de ListaDoble
            default:
                throw new IllegalArgumentException("Tipo de lista no válido"); // Lanza una excepción si se especifica un tipo de lista no válido
        }
    }
}
