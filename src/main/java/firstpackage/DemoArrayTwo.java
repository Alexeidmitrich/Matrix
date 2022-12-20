package firstpackage;

public class DemoArrayTwo {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length;  j++) {
                a[i][a.length - i - 1] = 3;
                    a[i][i] = 5;
                System.out.print(a[i][j] + " ");
                }
            System.out.println();
        }
    }
}


