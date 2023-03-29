package algo;

import datastructure.list.DLL;

import java.util.ArrayList;
import java.util.List;

public class TypeAlgo {


    public static void main(String[] args) {
        int [] a = {5,3,4};
        for (int x:a) {
            System.out.println(x);
        }
        List<String> list = new ArrayList<>();

        DLL<String> dll = new DLL<>();
        for (String x : list) {
            System.out.print(x);
        }
    }


    public static void method(int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <n ; k++) {
                    System.out.println(); // 1*1*n + 1*2*n  1*3*n .     + n * n
                }

            }
        }
    }
    public static void algo1(){
        System.out.println("'HelllolDd");
        int x = 5;
        int y = 6;

        System.out.println(x +y);
        if (x >0){

            System.out.println("5");
        }else{
            System.out.println("6");
        }


    }
}
