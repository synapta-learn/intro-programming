import java.util.ArrayList;

interface Stackable<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}

class ArrayStack<T> implements Stackable<T> {

    // TODO: Declare an ArrayList<T> field

    public ArrayStack() {
        // TODO: Initialize the list
    }

    @Override
    public void push(T item) {
        // TODO: Add to the end of the list
    }

    @Override
    public T pop() {
        // TODO: Remove and return last element, or null if empty
        return null;
    }

    @Override
    public T peek() {
        // TODO: Return last element without removing, or null if empty
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO: Check if the list is empty
        return true;
    }

    @Override
    public int size() {
        // TODO: Return the size
        return 0;
    }
}
