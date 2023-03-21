package datastructure.stack;

import datastructure.stack.ArrayStack;
import org.junit.Assert;
import org.junit.Test;


public class ArrayStackTest {

    @Test
    public void arrayStackTest(){
        ArrayStack<Integer> arr = new ArrayStack<>(6);
        arr.push(3);
        Assert.assertFalse(arr.isEmpty());
        int result = arr.pop();
        Assert.assertEquals(3, result);
        Assert.assertTrue(arr.isEmpty());
        arr.push(7);
        arr.push(4);
        arr.push(2);
        arr.push(5);
        arr.push(9);
        arr.push(8);
        Assert.assertFalse(arr.isEmpty());
        result = arr.pop();
        Assert.assertEquals(8, result);
        result = arr.pop();
        Assert.assertEquals(9, result);
        result = arr.pop();
        Assert.assertEquals(5, result);
        Assert.assertTrue(2 == arr.peek());
    }

    @Test
    public  void emptyStack( ){
        ArrayStack<Integer> arr = new ArrayStack<>(6);
        arr.pop();
        arr.pop();
        arr.pop();
    }
}
