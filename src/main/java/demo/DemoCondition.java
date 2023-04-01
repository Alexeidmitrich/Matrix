package demo;

public class DemoCondition {
    public static void main(String[] args) {
      /*  int x = 5;
        if (x < 5){
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }*/

        //Alternative
        int  x = 5;
        int y = 6;
        String result = x < 5 && y  % 2 == 0 ? "Hello" : "Bye";
        System.out.println(result);
    }
}
