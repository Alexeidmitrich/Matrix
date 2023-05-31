package demo.demostrings;

public class DemoStringtoInt {


    public static void main(String[] args) {
       int x =  Integer.parseInt("965");//класс оболочка
//List<Character>
        System.out.println(x);
        String str = "Hwe";
        for (int i = 0; i < str.length(); i++) {

            System.out.println((int)str.charAt(i));//0000011001
        }
        char c = 'z';
        int y = (int) c;
        System.out.println(y);
       c =  (char)(y +1);
        System.out.println(c);
        //ASCII
        //UTF-8
        //CP1251

        int e = 17;// 00000000  00000000 00000000 00010001

        //long e = 17;
        System.out.println(Integer.bitCount(e));
        // >> <<  &  | ^
        int x1 = 5;
        int x2 = 7;
        int x3 = x1 & x2;
        System.out.println(x3);
        /*
                  101
            &     111
            --------------
                   101 = 5

         */
        int x4 = 3;
        int x5 = 8;
        int x6 = x4 | x5;
        System.out.println(x6);
        /*
                   0011
           |       1000
           ------------------
                   1011

         */
        int x7 = 4 ;
        int x8 = x7 << 1;
        /*
        1000
         */
        System.out.println(x8);
    }
}
