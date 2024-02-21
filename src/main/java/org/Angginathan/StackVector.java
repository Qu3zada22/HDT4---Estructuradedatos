package org.Angginathan;

import java.util.Vector;

public class StackVector<T> implements UVGQueue<T> {
    Vector<T> data = null;

    public StackVector() {
        data = new Vector<T>();
    }

    public void enqueue(T x) {
        data.add(x);
    }

    public T dequeue() {
        int N = data.size();
        if (N > 0) {
            T val = data.get(0);
            data.remove(0);
            return val;
        }
        return null;
    }

    public boolean isEmpty() {
        return (data.size() <= 0);
    }

    public T front() {
        if (data.size() > 0) {
            return data.elementAt(0);
        } else {
            return null;
        }
    }

    public String toString() {
        return data.toString();
    }
}
