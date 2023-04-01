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
        int exppectedValues[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < exppectedValues.length; i++) {
            int result = list.get(i);
            Assert.assertEquals(exppectedValues[i], result);
        }
    }


    @Test
    public void addListIndex(){
        IntegerMinimalLinkedListQuick  list = new IntegerMinimalLinkedListQuick();
        list.add(1);
        list.add(7);
        Assert.assertFalse(list.isEmpty());
        IntegerMinimalLinkedListQuick  list2 = new IntegerMinimalLinkedListQuick();
        list2.add(2);
        list2.add(3);
        list2.add(6);
        list.add(1, list2);
        Assert.assertEquals(5, list.size());
        Assert.assertTrue(list.isSorted());
        int exppectedValues[] = {1,2,3,6,7};
        for (int i = 0; i < exppectedValues.length; i++) {
            int result = list.get(i);
            Assert.assertEquals(exppectedValues[i], result);
        }
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
        int exppectedValues[] = {1, 2, 3, 4};
        for (int i = 0; i < exppectedValues.length; i++) {
            int result = list.get(i);
            Assert.assertEquals(exppectedValues[i], result);
        }
        list.add(1);
        // 1 2 3 4 1
        Assert.assertFalse(list.isSorted());
        list.removeByIndex(4);
        // 1 2 3 4
        Assert.assertTrue(list.isSorted());

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
        int exppectedValues[] = {1, 2, 3, 4};
        for (int i = 0; i < exppectedValues.length; i++) {
            int result = list.get(i);
            Assert.assertEquals(exppectedValues[i], result);
        }
        Assert.assertTrue(list.isSorted());
    }

}
