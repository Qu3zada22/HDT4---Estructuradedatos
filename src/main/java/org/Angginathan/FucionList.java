package org.Angginathan;

public class FucionList<T> implements UVGQueue<T> {
    UVGLList<T> lista = null;

    public FucionList(String type) {
        ListaFactory<T> tmp = new ListaFactory<>();
        lista = tmp.crearLista(type);
    }

    @Override
    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return lista.getFirst();
    }

    @Override
    public void enqueue(T x) {
        lista.addFirst(x); // Adding elements to the front of the linked list
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T removed = lista.getFirst(); // Getting the first element
        lista.removeFirst(); // Removing the first element
        return removed;
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty(); // Delegating isEmpty check to the linked list
    }
}
