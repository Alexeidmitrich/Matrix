package datastructure.list;

public class IntegerMinimalLinkedListQuick extends IntegerDDL{


    private  boolean isSorted = true;

    // 1 2  4 2


    @Override
    public boolean add(Integer item) {
        if(head == null){
            isSorted = true;
        } else {
            if(tail.item > item) {
                isSorted = false;
            }
        }
        return super.add(item);
    }


    @Override
    public boolean add(Integer item, int index) {

        return super.add(item, index);
    }

    @Override
    public boolean add(DLL list) {
        if (head == null) {
            isSorted = true;
        } else {
            if () {
                isSorted = false;
            }
        }
            return super.add(list);
    }

    @Override
    public boolean add(int index, DLL list) {
        return super.add(index, list);
    }

    @Override
    public boolean isSorted() {
         return  isSorted;
    }
}
