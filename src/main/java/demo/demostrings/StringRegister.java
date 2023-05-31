package demo.demostrings;

import java.util.Objects;
import java.util.Scanner;

public class StringRegister {
    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        String str = "пицца очень вкусна€";
        System.out.println(findRegister(str));
        String str1 = "The quick brown fox jumps over the lazy dog";
        System.out.println(str1 + " " + str1.length());
        System.out.println(wordReverse(str1) + " " + wordReverse(str1).length());
        System.out.println("¬ведите число");
        int n = sc.nextInt();

       */
        for (int i = 3; i <15 ; i++) {
            stars(i);
            System.out.println("=========================");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static String findRegister(String str) {
        if (Objects.isNull(str) || str.isEmpty()) {
            return str;
        }

        if (str.charAt(0) == str.toUpperCase().charAt(0)) {
            return str;
        }
        if (str.length() < 2) {
            return str.toUpperCase();
        }
        return str.toUpperCase().charAt(0) + str.substring(1);
    }

    public static String wordReverse(String str) {
        if (Objects.isNull(str) || str.isEmpty()) {
            return str;
        }
        String[] word = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String s : word) {
            StringBuilder strin = new StringBuilder(s);
            if (strin.length() > 4) {
                result.append(strin.reverse() + " ");
            } else {
                result.append(strin + " ");
            }
        }

        return result.substring(0, result.length() - 1);//result.toString().trim()
    }

    public static void stars(int n) {
        String str = "*  ".repeat(n).trim();
        StringBuilder sb = new StringBuilder(str);

        /*for (int i = 1; i < n ; i = i + 2) {
            str = " ".repeat(i) + str.substring(i + 2);
            sb.insert(0, System.lineSeparator());
            sb.insert(0,  str);
            sb.append(System.lineSeparator()); // Ётот цикл работает с нечетными
            sb.append(str);
        }*/
       // System.out.println(str);
        int k = n < 5
                ? n /2 + 1
                : n;
        for (int i = 0; i <= k && str.length() > 1  ; i++) {
            str ="  ".repeat(i + 1) + str.substring(2) ;
            //System.out.println(str);
           sb.insert(0, System.lineSeparator());
            sb.insert(0,  str);
            sb.append(System.lineSeparator());
            sb.append(str);
        }
        System.out.println(sb);
    }
}
