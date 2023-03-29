package datastructure.list;

import org.junit.Assert;
import org.junit.Test;

public class IntegerMinimalLinkedListQuickTest {


    @Test
    public void addIndexAndList(){
        IntegerMinimalLinkedListQuick  list = new IntegerMinimalLinkedListQuick();
        list.add(1);
        list.add(2);
        IntegerMinimalLinkedListQuick  list2 = new IntegerMinimalLinkedListQuick();
        list2.add(3);
        list.add(list2);

    }
}
