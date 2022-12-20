package demo;

public class DemoArray {

    public static void main(String[] args) {
        char [] ar = {'X', 'O'};
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        char c = 'A';
        char c1 = 'A';
        String s = "A";
        String s1 = "A";
        if (s.equals(s1)) {
            //blablsblas

            System.out.println("A");
        }
        if (s == s1) {
            System.out.println("B");
        }

        if(c == c1){
            System.out.println("C");
        }
    }
}
