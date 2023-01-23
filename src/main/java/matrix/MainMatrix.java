package matrix;

public class MainMatrix {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);
        matrix.setValue(1 , 1, 3);
        matrix.setValue(1 , 2, 4);
        matrix.setValue(2, 1, 5);
        matrix.print();
        //System.out.println(matrix.getValue(1, 1));
        System.out.println();
        //matrix.transpose();
        //matrix.print();
        System.out.println();
        Matrix matrix1 = new Matrix(3, 3);
        matrix1.identity();
        matrix.addMatrix(matrix1);
        matrix.print();
        System.out.println();
        //matrix1.print();
    }
}
