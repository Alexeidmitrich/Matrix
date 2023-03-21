package datastructure.queue;

public interface Queue <T>{


    void enqueue(T i);

    T dequeue();

    boolean isEmpty();


}
