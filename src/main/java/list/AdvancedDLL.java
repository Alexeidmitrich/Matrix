package list;

public class AdvancedDLL <T> extends DLL <T>{


    public  void addFirst(T item){
        add(item, 0);
    }

    public void addLast(T item){
        add(item);
    }

    public T removeFirst(){
       Node<T> tmp = head;
       removeByIndex(0);
       return tmp.item;
    }

    public T removeLast() {
        if (size == 1){
            T element = head.item;;
            head = null;
            size--;
            return element;
        }
            Node<T> tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            T element = tmp.item;
            tmp = tmp.prev;
            tmp.next = null;
            size--;
            return element;
    }

    public static void main(String[] args) {
        AdvancedDLL<String> list = new AdvancedDLL();
        list.add("A");
        list.add("B");
        list.add("E");
        list.add("C");
        list.add("D");
        list.removeFirst();
        list.removeLast();
        for (int i = 0; i < list.size(); i++) {
             System.out.print(list.get(i) + " ");
        }
    }
}
