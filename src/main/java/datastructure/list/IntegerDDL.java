package datastructure.list;

public class IntegerDDL extends DLL<Integer> implements DataSortedContainer{


    @Override
    public boolean isSorted() {
        for (int i = 0; i < size - 1; i++) {
           if (get(i) > get(i + 1)){
               return false;        // 1 2 15 3
           }
        }
        return true;
    }
}
