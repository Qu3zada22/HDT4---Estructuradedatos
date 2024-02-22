package org.Angginathan;

import java.util.ArrayList;

public class StackArrayList<T> implements UVGQueue<T> {
    ArrayList<T> data = null;

    public StackArrayList() {
        data = new ArrayList<T>();
    }

    public T front() {
        if (data.size() > 0) {
            return data.get(0);
        }
        return null;
    }

    public void enqueue(T x) {
        data.add(x);
    }

    public T dequeue() {
        return data.remove(data.size() - 1);
    }

    public boolean isEmpty() {
        return (data.size() == 0);
    }

}
