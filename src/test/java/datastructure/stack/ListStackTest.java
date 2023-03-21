package datastructure.stack;


import datastructure.stack.ListStack;
import org.junit.Assert;
import org.junit.Test;

public class ListStackTest {

    @Test
    public void listStackTest() {
        ListStack<String> list = new ListStack<>();
        list.push("A");
        Assert.assertEquals("A", list.peek());
        Assert.assertFalse(list.isEmpty());
        String result = list.pop();
        Assert.assertEquals("A", result);
        Assert.assertTrue(list.isEmpty());
    }
}
