package references;

import java.util.Arrays;

public class A {

   /// int x;
    public static void main(String[] args) {
        int a = 5;
        int b = a;

        b= 44;
        A a1 = new A();

       // System.out.println(a1.x);
        int x = 65;
        method(x);
        System.out.println(x);
        int [] array  = {5,6,7};
        method(array);
        System.out.println(Arrays.toString(array));


    }

    public static void method(int[] a){
        a [0] = 65;

    }
    public static void method(int bla){
        bla++;

    }
}
