package stack;

import list.AdvancedDLL;


public class ListStack <T> implements Stack<T> {

    private AdvancedDLL<T> list = new AdvancedDLL();


    @Override
    public void push(T i) {
        list.addLast(i);
    }

    @Override
    public T pop() {
        return list.removeLast();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public T peek() {
        return list.get(list.size() - 1);
    }
}
