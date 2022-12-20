package matrix;

public class Matrix {

    private int[][] array;

    public Matrix(int m, int n) {
        array = new int[m][n];
    }


    public void print() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public void setValue(int i, int j, int value) {
        array[i - 1][j - 1] = value;
    }

    public int getValue(int i, int j){
        return array[i - 1][j - 1];
    }

    public void addMatrix(Matrix matrix1) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + matrix1.array[i][j];
            }
        }
    }

    public void identity() {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                if (i == j)
                    array[i][j] = 1;
    }

    public void transpose() {
        int [][] arr = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arr[j][i] = array[i][j];
            }
        }
        this.array = arr;
    }
}


