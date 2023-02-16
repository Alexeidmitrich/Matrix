package list;


import datastructure.MyLinkedList;

public class DLL <T> {

    private int size;
    private Node<T> head = null;

    boolean add (T item){
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
                size++;
            }
            return true;
        }
    }

    boolean add (T item, int index) {
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
                    head = newNode;
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
            }
        }
        return true;
    }

    boolean add(DLL list){
        if (list == null){
            return false;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = list.head;
            size = size + list.size;
        }
        return true;
    }

    boolean add(int index, DLL list) {
        T item = null;
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
                while (tmp.next != null && i < index - 1) {
                    tmp = tmp.next;
                }
                tmp2.next = tmp.next;
                tmp.next = list.head;
                size = size + list.size;
            }
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

    public int size(){
        return size;
    }

    private class Node<T> {
        T item;
        Node next;

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
        list2.add("O");
        list2.add("O");
        list2.add("O");
        list.add(0, list2);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
