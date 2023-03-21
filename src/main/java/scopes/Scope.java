package scopes;


import java.util.ArrayList;
import java.util.List;

public class Scope {

    private  int x = 8;

    public void method(int b){
        int x = 5;
        System.out.println(this.x);
        {
            int  a = 5;

        }
        {
            int a = 87 ;
        }
        for (int i = 0; i < 6; i++) {

        }

        for (int i = 0; i <4 ; i++) {

        }
        System.out.println(x);
    }
    public void method2() {
        List<Integer> lm = new ArrayList<>();
         System.out.println();
    }

    public static void main(String[] args) {
        Scope scope = new Scope();
        Scope scope1 = new Scope();

        scope.method(45);
        scope.method(4);
    }
}
