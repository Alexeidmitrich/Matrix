package datastructure.list;

import org.junit.Assert;
import org.junit.Test;


public class AdvancedDLLTest {


    @Test
    public void addItemTest(){
        AdvancedDLL<String> list = new AdvancedDLL<>();
        list.addFirst("A");
        Assert.assertEquals("A", list.get(0));
        list.addFirst("B");
        Assert.assertEquals("B", list.get(0));
        list.addFirst("C");
        Assert.assertEquals("C", list.get(0));
        list.addLast("G");
        list.addLast("H");
        list.addLast("J");
        Assert.assertEquals("J", list.get(6));
    }



    @Test
    public void removeTest( ) {
        AdvancedDLL<String> list = new AdvancedDLL<>();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        String result = list.removeFirst();
        Assert.assertEquals("C", result);
        result = list.removeLast();
        Assert.assertEquals("A", result);
        result = list.removeLast();
        Assert.assertEquals("B", result);
    }
}
