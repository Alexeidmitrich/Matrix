package algo;

import java.math.BigInteger;

public class DemoRecursion {

    public static void main(String[] args) {
       //System.out.println(sumRec(2));
        //System.out.println(factorial(10));
        /*System.out.println(fibonacci(10));
        System.out.println(gcd(42, 22));
        System.out.println(gcdRecursion(42,22));

        for (int i = 0; i < 10; ++i) {
            System.out.print("fib(" + i+") = "+ "  " + fib(i));
        }
        System.out.println();
        System.out.println("recursion");
        for (int i = 0; i < 10; i++) {
            System.out.print("fib(" + i+") = "+ "  " + fibonacci(i));
        }*/
        //BigInteger
       // System.out.println(5. / 2);
        System.out.println(eulers(10));
    }

    public static int sum(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
    // 0 + 1 +  2 + 3 +4 +5 =
    // sum(5) = sum(4) + 5
    //sum(10) = sum(9) + 10
    //sum(n) = sum(n-1) + n;
    //sum(2) = sum(1) + 2 = sum(0) + 1 + 2 = 0 + 0 + 1 + 2


    public static int sumRec(int n){
        if (n < 1){
            return n;
        }
        return sumRec(n - 1) + n;
    }


    //5! =1 *2 *3*4*5
    //0! = 1
    // sum(5) = sum(4) * 5;
    public static int factorial(int m) {
        if (m < 1){
            return 1;
        }
        return factorial(m - 1) * m;
    }

    public static long fibonacci(long a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }

    public static long fib(int a){
        if (a == 0 || a == 1){
            return a;
        }
        long [] fib= new long[a + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; ++i) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[fib.length - 1];
    }


    public static double eulers(int n) {
        if(n == 0) {
            return 1;
        }
        return eulers((n - 1))+ 1./ factorial(n) ;
    }
// n ! = (n - 1) ! * n   (n - 1) * n
        // 4
    public static int gcd(int a, int b){
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;

        }
        return a;
    }

    public static int gcdRecursion(int a, int b){
        if(b == 0){
            return a;
        }
        return gcdRecursion(b, a % b);
    }
 }
