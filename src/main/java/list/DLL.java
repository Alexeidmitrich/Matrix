package list;


public class DLL <T> {

    protected int size;
    private T item;
    protected Node<T> head = null;


    public boolean add (T item){
        Node newNode = new Node(item);
        if (item == null){
            return false;
        }else {
            if (head == null) {
                head = newNode;
                size++;
            } else {
               Node tmp = head;
                while (tmp.next != null){
                    tmp = tmp.next;
                }
                tmp.next = newNode;
                newNode.prev = tmp;
                size++;
            }
            return true;
        }
    }

    public boolean add (T item, int index) {
        Node newNode = new Node(item);
        if (item == null) {
            return false;
        } else {
            if (head == null) {
                head = newNode;
                size++;
            } else {
                if (index == 0) {
                    newNode.next = head;
                    head.prev = newNode;
                    head = newNode;

                    size++;
                } else {
                    Node tmp = head;
                    int i = 0;
                    while (tmp.next != null && i < index -1 ) {
                        tmp = tmp.next;
                        i++;
                    }
                    newNode.next = tmp.next;
                    tmp.next.prev = newNode;
                    tmp.next = newNode;
                    newNode.prev = tmp;
                    size++;
                }
            }
        }
        return true;
    }

    public boolean add(DLL list){
        if (list == null){
            return false;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = list.head;
            list.head.prev = tmp;
            size = size + list.size;
        }
        return true;
    }

    public boolean add(int index, DLL list) {
        if (item == null && index > list.size) {
            return false;
        } else {
            if (index == 0) {
                Node tmp2 = list.head;
                while (tmp2.next != null) {
                    tmp2 = tmp2.next;
                }
                tmp2.next = head;
                head = list.head;
                size = size + list.size;
            } else {
                int i = 0;
                Node tmp2 = list.head;
                while (tmp2.next != null) {
                    tmp2 = tmp2.next;
                }
                Node tmp = head;
                while (tmp.next != null && i < index -1) {
                    tmp = tmp.next;
                }
                tmp2.next = tmp.next;
                tmp.next = list.head;
                size = size + list.size;
            }
        }
        return true;
    }


   public boolean remove(T item) {
        if (item == null) {
            return false;
        } else if (head.item.equals(item)) {
            head = head.next;
            return true;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                if (tmp.next.item.equals(item)) {
                    tmp.next = tmp.next.next;
                    tmp.next.prev = tmp;
                    size--;
                    return true;
                }
                tmp = tmp.next;
            }
            return false;
        }
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
                tmp.next = tmp.next.next;
                tmp.next.prev = tmp;
            }
            size--;
        }
            return true;
    }

    public T get(int index){
        Node tmp = head;
        int i = 0;
        while (tmp.next != null && i < index){
            tmp = tmp.next;
            i++;
        }
        return (T) tmp.item;

    }

    public void clear(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return  (head == null && size == 0);
    }

    public int size(){
        return size;
    }


    protected static class Node<T> {
        T item;
        Node next;
        Node prev;

        Node(T item){
            this.item = item;
        }
    }

    public static void main(String[] args) {
            DLL<String> list = new DLL();
            list.add("A");
            list.add("B");
            list.add("E");
            list.add("C");
            list.add("D");
            list.add("F", 0);
        /*for (int i = 0; i < list.size(); i++) {
             System.out.print(list.get(i) + " ");
            }*/

        DLL <String> list2 = new DLL();
        list2.add("G");
        list2.add("H");
        list2.add("J");
        //list.add(0, list2);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        //list.remove("A");
        list.removeByIndex(3);
        //list.clear();
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
