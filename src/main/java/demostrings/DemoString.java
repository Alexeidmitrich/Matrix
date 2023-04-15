package demostrings;

public class DemoString {

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);
        /*String s1 = " !!";
        System.out.println(s + s1);
        System.out.println("========");
        System.out.println(s.toUpperCase());
        System.out.println("========");
        System.out.println(s.toLowerCase());
        System.out.println("========");*/
        System.out.println(s.substring(1, 4));
        System.out.println(s.substring(1));

        System.out.println(s.toUpperCase().substring(2));
        /*String s2 = s.toLowerCase();
        System.out.println(s2);

        String h1 = "Alex";
        String h2 = new String( "Alex");

        System.out.println(h1 == h2);
        System.out.println(h1.equals(h2));
        System.out.println();*/

        /*String s3 = "eeee";
        StringBuilder sb = new StringBuilder(s3);
        for (int i = 0; i < 1_000; i++) {
            sb.append( "111");
            System.out.println(sb.hashCode());

        }
        StringBuilder sb1 = new StringBuilder(s3);
        sb1.insert(0, "Java ");
        System.out.println(sb1);
        sb1.reverse();

        System.out.println(sb1);
        String h3 = "Alex";
        String h4 = "Alex";*/
        //String pool
        //Чтобы разработчики JAVA могли реализовать стринг пул им нужно было сделать несколько особенностей класса стринг
        //1 класс стринг финальный
        //2 все методы класса стринг иммутабельны, то есть при вызове любого метода сама исходная строка не меняется
        //создается новый объект.

    }
}
