package stack;

public interface Stack <T> {

    void push(T i);

    T pop();

    boolean isEmpty();

    T peek();
}
