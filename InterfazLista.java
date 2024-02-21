public interface InterfazLista<T> {
    void insertarAlInicio(T dato);
    T eliminarPrimero();
    T obtenerPrimero();
    boolean estaVacia();
}
