package org.Angginathan;

public class FucionList <T> implements UVGQueue<T>{
    UVGLList lista = null;
    public FucionList(String type){
        ListaFactory<T> tmp = new ListaFactory<>();
    }

    @Override
    public T front() {
        return (T) lista.getFirst();
    }

    @Override
    public void enqueue(T x) {

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
