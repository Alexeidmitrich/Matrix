package list;


import org.junit.Assert;
import org.junit.Test;


public class TestDLL {

    @Test
    public void addLastTest(){
        DLL <String> list = new DLL<>();
        Assert.assertTrue(list.add("A"));
        Assert.assertTrue(list.add("B"));
        Assert.assertTrue( list.add("C"));
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        Assert.assertEquals(3, list.size());
        Assert.assertFalse(list.isEmpty());
        String strNull = null;
        Assert.assertFalse(list.add(strNull));
    }

    @Test
    public void addAtIndex(){
        DLL <String> list = new DLL<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("F", 1);
        list.add("G", 0);
        list.add("H", 4);
        Assert.assertEquals("F", list.get(2));
        Assert.assertEquals("A", list.get(1));
        Assert.assertEquals("G", list.get(0));
        Assert.assertEquals("B", list.get(3));
        Assert.assertEquals("H", list.get(4));
        Assert.assertEquals("C", list.get(5));
        Assert.assertEquals(6, list.size());
    }

    @Test
    public void addListIndex(){
        DLL <String> list = new DLL<>();
        list.add("A");
        list.add("B");
        list.add("C");
        DLL<String> list2 = new DLL<>();
        list2.add("D");
        list2.add("F");
        list2.add("G");
        list.add(2,list2);
        Assert.assertEquals("D", list.get(3));
        Assert.assertEquals("F", list.get(4));
        Assert.assertEquals("G", list.get(5));
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
    }

    @Test
    public void addListTest() {
        DLL<String> list = new DLL<>();
        list.add("A");
        list.add("B");
        list.add("C");
        DLL<String> list2 = new DLL<>();
        list2.add("D");
        list2.add("F");
        list2.add("G");
        list.add(list2);
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals("D", list.get(3));
    }

    @Test
    public void removeItem(){
        DLL <String> list = new DLL<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.remove("A");
        Assert.assertEquals("B", list.get(0));
        Assert.assertEquals("C", list.get(1));
        list.add("A");
        list.remove("C");
        Assert.assertEquals("B", list.get(0));
        Assert.assertEquals("A", list.get(1));

    }

    @Test
    public void removeAtIndex(){
        DLL <String> list = new DLL<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("G", 0);
        list.removeByIndex(0);
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("B", list.get(1));
        Assert.assertEquals("C", list.get(2));
        list.add("G", 1);
        list.removeByIndex(1);
        Assert.assertEquals("A", list.get(0));
        Assert.assertEquals("G", list.get(1));
        Assert.assertEquals("C", list.get(2));
    }

    @Test
    public void clearTest(){
        DLL <String> list = new DLL<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.clear();
        Assert.assertTrue(list.isEmpty());
    }

}
