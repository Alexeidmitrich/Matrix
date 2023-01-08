package datastructure;

public class Main {


    public static void main(String[] args) {
        MyArrayList m = new MyArrayList();
        m.add("D");
        m.add("A");
        m.add("B");
        m.add("C",0);
        for (int i = 0; i < m.size(); i++) {
            System.out.println(m.get(i));
        }
    }
}
