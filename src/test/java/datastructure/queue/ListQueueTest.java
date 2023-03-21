package datastructure.queue;

import datastructure.queue.ListQueue;
import org.junit.Assert;
import org.junit.Test;

public class ListQueueTest {


    @Test
    public void dequeueTest(){
        ListQueue<String> list = new ListQueue<>();
        Assert.assertTrue(list.isEmpty());
        list.enqueue("H");
        list.enqueue("A");
        list.enqueue("B");
        list.enqueue("C");
        String result = list.dequeue();
        Assert.assertEquals("H", result);
        result = list.dequeue();
        Assert.assertEquals("A", result);
        result = list.dequeue();
        Assert.assertEquals("B", result);

    }
}
