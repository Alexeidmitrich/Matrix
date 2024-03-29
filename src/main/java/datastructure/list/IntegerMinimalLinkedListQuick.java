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
        Node<Integer> newNode = new Node(item);
        if (item == null) {
            return false;
        } else {
            if (head == null) {
                head = newNode;
                isSorted = true;
                size++;
            } else {
                if (index == 0) {
                    newNode.next = head;
                    head.prev = newNode;
                    head = newNode;
                    if ((Integer)head.next.item < head.item){
                        isSorted = false;
                    }
                    size++;
                } else {
                    Node tmp = head;
                    int i = 0;
                    while (tmp.next != null && i < index - 1) {
                        tmp = tmp.next;
                        i++;
                    }
                    newNode.next = tmp.next;
                    tmp.next = newNode;
                    size++;
                }
                    if (head.next.next != null) {
                        if ((Integer) head.next.item < head.item || (Integer) head.next.item > (Integer) head.next.next.item) {
                            isSorted = false;
                        }
                    } else {
                        if ((Integer) head.next.item <  head.item) {
                            isSorted = false;
                        }
                    }
            }
        }
        return true;
    }

    public boolean add(IntegerMinimalLinkedListQuick list) {
        if (head == null) {
            isSorted = true;
        } else {
            if (tail.item > list.head.item || isSorted == false || list.isSorted == false) {// 3  1 2         6  5 2
                isSorted = false;
            }
        }
            return super.add(list);
    }


    public boolean add(int index, IntegerMinimalLinkedListQuick list) {
        if (list == null && index > list.size) {
            return false;
        } else {
            if (index == 0) {
                list.tail.next = head;
                if (list.tail.item > head.item ||  isSorted == false || list.isSorted == false){
                    isSorted = false;
                }
                head = list.head;
                size = size + list.size;
            } else {
                int i = 0;
                Node tmp2 = list.head;
                while (tmp2.next != null) {
                    tmp2 = tmp2.next;
                }
                Node tmp = head;
                while (tmp.next != null && i < index - 1) {
                    tmp = tmp.next;
                    i++;
                }
                tmp2.next = tmp.next;
                tmp.next = list.head;
                size = size + list.size;
            }
                if (head.next.next != null) {
                    if (list.head.item < head.item || (Integer) list.head.next.item > (Integer) head.next.next.item) {
                        isSorted = false;
                    }
                } else {
                    if (list.head.item < head.item) {
                        isSorted = false;
                    }
                }
            }
        return true;
    }

    @Override
    public boolean isSorted() {
         return  isSorted;
    }

    public Integer get(int index){
        Node tmp = head;
        int i = 0;
        while (tmp.next != null && i < index){
            tmp = tmp.next;
            i++;
        }
        return (Integer) tmp.item;

    }

    public boolean removeByIndex(int index) {
        if (index > size) {
            return false;
        } else {
            Node tmp = head;
            int i = 0;
            while (tmp.next != null && i < index) {
                tmp = tmp.next;
                i++;
            }
            if (index == 0){
                head = tmp.next;
            } else {
                if (tmp.next != null && tmp.next.next != null) {
                    tmp.next = tmp.next.next;
                    tmp.next.prev = tmp;
                }
            }
            size--;

            tmp = head;
            isSorted = true;
            while (tmp.next.next != null){
                if ((Integer)tmp.item > (Integer) tmp.next.item){

                    isSorted = false;
                    break;
                }
                tmp = tmp.next;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        IntegerMinimalLinkedListQuick  list = new IntegerMinimalLinkedListQuick();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i));
        }
        IntegerMinimalLinkedListQuick list2 = new IntegerMinimalLinkedListQuick();
        list2.add(5);
        list2.add(6);
        //list.add(4,4);
        list.add(1,list2);
        System.out.println();
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.get(i));
        }
    }
}
