package datastructure;

public class MyLinkedList<E> {

    private int size;
    private Node head;

    private Node tail;

    public void add(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
            size++;
        } else {
           tail.next = newNode;
           tail = newNode;
            size++;
        }
    }


    public void add(E e, int index) {
        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
            size++;
        } else {
            if (index == 0){
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

    public void add( MyLinkedList list) {
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = list.head;
        size = size + list.size;
    }


    public void add(MyLinkedList list, int index) {

        if (index == 0){
            Node tmp2 = list.head;
            while (tmp2.next != null){
                tmp2 = tmp2.next;
            }
           tmp2.next = head;
            head = list.head;
           size = size + list.size;
        } else {
           int i = 0;
           Node tmp2 = list.head;
           while (tmp2.next != null){
               tmp2 = tmp2.next;
           }
           Node tmp = head;
           while (tmp.next != null && i < index - 1) {
               tmp = tmp.next;
               i++;
           }
           tmp2.next = tmp.next;
           // Важно помнить? что мы работает с ссылками/ Мысообщаем  адрес? где находитсч следующий от тмп объект
            // и записываем этот же адрес в тмп2 некст
           tmp.next = list.head;
           size = size + list.size;
        }
    }

    public E get(int index){
        Node  tmp = head;
        int i = 0;
        while (tmp.next != null && i < index){
            tmp = tmp.next;
            i++;
        }
        return (E) tmp.data;

    }


    public int size() {
        return size;
    }

    private static class Node<E> {
        E data;
        Node next;

        Node(E data){
            this.data = data;
        }
    }
}
