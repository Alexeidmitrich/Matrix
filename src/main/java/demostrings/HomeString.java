package demostrings;

import java.util.Scanner;

public class HomeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("Ââåäèòå ñòðîêó ");
        String str = "madam with dog";
        register(str);
        printWord(str);
        findWord(str);
        deleteFirstAndLast(str);
        palindrome(str);
    }

    public static void register(String str){
=======
        System.out.println("Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ ÑÑ‚Ñ€Ð¾ÐºÑƒ");
        String str = sc.nextLine();
>>>>>>> ea7f97fb3ade98c2086145e88f7200c137a63910
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }

    public static void printWord(String str) {
        char[] arr = str.toCharArray();
        for (char st : arr) {
            System.out.println((int) st);
        }
    }

    public static void findWord(String str){
        String answer = str.contains("a")
                ? "Yes"
                :"No";
        System.out.println(answer);
    }

    public static void deleteFirstAndLast(String str){
        String[] words = str.split(" ");
        for (String st : words) {
            StringBuilder str1 = new StringBuilder(st);
            if (str1 != null && str1.length() > 0) {
                System.out.println(str1.substring(1, str1.length() - 1));
            } else {
                return;
            }
        }
    }

    public static void palindrome(String str){
        String[] word = str.split(" ");
        String firstWord = word[0];
        System.out.println(firstWord);
        System.out.println(firstWord.equals(new StringBuilder(firstWord).reverse().toString()));
    }
}
