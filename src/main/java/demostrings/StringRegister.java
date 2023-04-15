package demostrings;

public class StringRegister {
    public static void main(String[] args) {
        String str = "пицца очень вкусная";
        System.out.println(findRegister(str));
        String str1 ="The quick brown fox jumps over the lazy dog";
        wordReverse(str1);
    }

    public static String findRegister(String str){
       if (str.charAt(0) == str.toUpperCase().charAt(0)){
           return str;
       } else {
           return "Пицца очень вкусная";
       }
    }

    public static void wordReverse(String str){
        String[] word = str.split(" ");
        for (String s: word){
            StringBuilder strin = new StringBuilder(s);
            if (strin.length() > 4){
                System.out.print(strin.reverse() + " ");
            } else {
                System.out.println(strin);
            }
        }
    }
}
