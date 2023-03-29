package datastructure.list;

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
      T element = tail.item;
      tail = tail.prev;
      tail.next = null;
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
        //list.removeFirst();
        //list.removeLast();
        for (int i = 0; i < list.size(); i++) {
             System.out.print(list.get(i) + " ");
        }
    }
}
