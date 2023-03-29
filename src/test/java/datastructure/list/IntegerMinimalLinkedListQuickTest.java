package datastructure.list;

import org.junit.Assert;
import org.junit.Test;


public class IntegerMinimalLinkedListQuickTest {


    @Test
    public void addList(){
        IntegerMinimalLinkedListQuick  list = new IntegerMinimalLinkedListQuick();
        list.add(1);
        list.add(2);
        Assert.assertTrue(list.isSorted());
        Assert.assertFalse(list.isEmpty());
        IntegerMinimalLinkedListQuick  list2 = new IntegerMinimalLinkedListQuick();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list.add(list2);
        Assert.assertFalse(list2.isEmpty());
        Assert.assertTrue(list.isSorted());
        Assert.assertEquals(5, list.size());
        int result = list.get(2);
        Assert.assertEquals(3, result);
    }


    @Test
    public void addListIndex(){
        IntegerMinimalLinkedListQuick  list = new IntegerMinimalLinkedListQuick();
        list.add(1);
        list.add(3);
        Assert.assertFalse(list.isEmpty());
        IntegerMinimalLinkedListQuick  list2 = new IntegerMinimalLinkedListQuick();
        list2.add(2);
        list.add(1, list2);
        Assert.assertEquals(3, list.size());
        Assert.assertTrue(list.isSorted());
        int result = list.get(1);
        Assert.assertEquals(2, result);
    }

    @Test
    public void addItem() {
        IntegerMinimalLinkedListQuick list = new IntegerMinimalLinkedListQuick();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Assert.assertTrue(list.isSorted());
        Assert.assertFalse(list.isEmpty());
        int result = list.get(2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void addItemIndex(){
        IntegerMinimalLinkedListQuick  list = new IntegerMinimalLinkedListQuick();
        list.add(1);
        list.add(2);
        list.add(4);
        Assert.assertFalse(list.isEmpty());
        list.add(3, 2);
        Assert.assertEquals(4, list.size());
        int result = list.get(2);
        Assert.assertEquals(3, result);
        Assert.assertTrue(list.isSorted());
    }

}
