package pl.codecool.collections.list.zad5;

import java.util.Deque;
import java.util.LinkedList;

public class Stos<T> {

    private Deque<T> linkedList = new LinkedList<>();

    public void push(T value) {
        linkedList.addFirst(value);
    }

    public T peek() {

        return linkedList.peekFirst();
    }

    public T pop() {
        return linkedList.removeFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public Deque<T> getLinkedList() {
        return linkedList;
    }

    @Override
    public String toString() {
        return "Stos{" +
                "linkedList=" + linkedList +
                '}';
    }
}
