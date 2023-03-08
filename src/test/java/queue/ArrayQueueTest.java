package queue;

import org.junit.Assert;
import org.junit.Test;

public class ArrayQueueTest {

    @Test
    public void arrayQueueTest() {
        ArrayQueue<Integer> arr = new ArrayQueue<>(6);
        Assert.assertTrue(arr.isEmpty());
        arr.enqueue(3);
        arr.enqueue(8);
        arr.enqueue(5);
        arr.enqueue(4);
        int result = arr.dequeue();
        Assert.assertEquals(3, result);
        result = arr.dequeue();
        Assert.assertEquals(8, result);
        result = arr.dequeue();
        Assert.assertEquals(5, result);

    }
}
