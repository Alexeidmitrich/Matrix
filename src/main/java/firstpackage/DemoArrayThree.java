package firstpackage;

public class DemoArrayThree {
    public static void main(String[] args) {
        int[] a = {1, 5, 6};
        int[] b = {2, 5};
        int x = 10;
        int sum = 0;
        for (int i = b.length - 1; i >= 0; i--) {
            int sumtemp = 0;
            for (int j = a.length - 1; j >= 0; j--) {
                    int value = (int) ((b[i] * Math.pow(x, b.length-1-i) * (a[j] * Math.pow(x, a.length - 1 - j))));
                    System.out.println(value);
                    sumtemp = sumtemp + value;
            }
            sum  += sumtemp;
        }
        System.out.println(sum);
    }
}

    /*

     */
