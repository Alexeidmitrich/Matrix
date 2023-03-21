package datastructure.stack;

public class ArrayStack <T> implements Stack<T>{

    private T[] array;
    private int size = 0;


    public ArrayStack(int size) {
        array = (T[]) new Object[size];
    }


    @Override
    public void push(T i) {
        if (size < array.length) {
            array[size] = i;
            size++;
        }
    }


    @Override
    public T pop() {
        T element = array[size - 1];
        size --;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public T peek() {
        return array[size - 1];
    }
}
