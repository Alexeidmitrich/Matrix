package demostrings;

import java.util.Scanner;

public class HomeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите строку");
        String str = sc.nextLine();
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        if (str.contains("a")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String[] words = str.split(" ");
        for (String st : words) {
            StringBuilder str1 = new StringBuilder(st);
            if (str1 != null && str1.length() > 0) {
                System.out.println(str1.substring(1, str1.length() - 1));
            } else {
                return;
            }
        }

        char[] arr = str.toCharArray();
        for (char array : arr) {
            System.out.println(array);
        }
        String[] word = str.split(" ");
            String firstWord = word[0];

            System.out.println(firstWord);
            System.out.println(firstWord.equals(new StringBuilder(firstWord).reverse().toString()));
    }
}
