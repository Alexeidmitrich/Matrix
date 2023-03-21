package datastructure.queue;

public class ArrayQueue <T> implements Queue <T>{

    private T[] array;
    private int size = 0;


    public ArrayQueue(int size){
        array = (T[]) new Object[size];
    }
    @Override
    public void enqueue(T i) {
        if (size < array.length) {
            array[size] = i;
            size++;
        }
    }

    @Override
    public T dequeue() {
        T element = array[0];
        size--;
        for (int i = 0; i < size; i++)
            array[i] = array[i + 1];
            array[size] = null;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }
}
