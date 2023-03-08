package queue;

import list.AdvancedDLL;

public class ListQueue <T> implements Queue <T> {

    private AdvancedDLL<T> list = new AdvancedDLL();

    @Override
    public void enqueue(T i) {
        list.addLast(i);
    }

    @Override
    public T dequeue() {
       return list.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return (list.isEmpty());
    }

}
