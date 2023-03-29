package algo;

public class DemoRecursion {

    public static void main(String[] args) {
        System.out.println(sumRec(2));
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
 }
