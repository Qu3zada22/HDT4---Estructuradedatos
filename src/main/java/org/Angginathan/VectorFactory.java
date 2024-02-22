package org.Angginathan;

/**
 * Factory class para crear estructuras de datos basadas en vectores.
 *
 * @param <T> el tipo de elementos que contendrá la estructura de datos
 */
public class VectorFactory<T> {
    /**
     * Crea una estructura de datos basada en vectores según el tipo especificado.
     *
     * @param tipo      el tipo de estructura de datos a crear ("stack" para pila o "vector" para vector)
     * @param listaTipo el tipo específico de lista (opcional, utilizado para crear una lista fusionada)
     * @return una instancia de UVGQueue que representa la estructura de datos creada
     * @throws IllegalArgumentException si se proporciona un tipo de estructura no válido
     */
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
