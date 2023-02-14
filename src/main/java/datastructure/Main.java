package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        MyArrayList<String> m = new MyArrayList();
        m.add("D");
        m.add("A");
        m.add("C",0);
        m.add("H",2);
        m.add("H",1);
        m.add("Y", 4);
        //C,D,H,A,Y, B
        MyArrayList <String> m2 = new MyArrayList();
        /*m2.add("S");
        m2.add("K");
        m2.add("P");
        m2.add("P");
        m2.add("P1");
        m2.add("P2");
        m2.add("3P");
        m2.add("4P");
        m.add(m2);*/
        for (int i = 0; i < m.size(); i++) {
            System.out.print(m.get(i) + ",");
        }
        System.out.println();
        //C,D,H,A,Y, B, S, K, P
        MyArrayList <String> m3 = new MyArrayList();
        //m3.add("w");
        //m3.add("K");
        //m.add(m3, 1);
        //System.out.println(m.size());
        //C,, K, P, D,H,A,Y, B
        //m.remove(14);
        //m.add("BB");
        m.remove(5);
        m.remove(1);
        for (int i = 0; i < m.size(); i++) {
            System.out.print(m.get(i) + ",");
        }
        System.out.println();
    }
}
