package datastructure;

public class Main2 {

    public static void main(String[] args) {
        MyLinkedList <String> list = new MyLinkedList();
        list.add("A");
        list.add("B");
        list.add("E");
        list.add("C");
        list.add("D");
        //list.add("F",0);
        for (int i = 0; i < list.size(); i++) {
           System.out.print(list.get(i) + " ");
        }
        /*MyLinkedList <String> list1 = new MyLinkedList();
        list1.add("M");
        list1.add("K");
        list1.add("L");
        list.add(list1);*/
        /*for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }*/
        /*MyLinkedList <String> list2 = new MyLinkedList();
        list2.add("O");
        list2.add("O");
        list2.add("O");
        list.add(list2, 2);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }*/
    }

}
