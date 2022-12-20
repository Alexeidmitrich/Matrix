package firstpackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoArray {


    public static void main(String[] args) {
       /* int[][] a = {{1, 5, 8, 91}, {2, 3}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
               if(a[i][j]%2 != 0) {
                   System.out.print("*");
               } else {
                   System.out.print(a[i][j]);
               }
            }
            System.out.println();
        }*/
        int[][][] b = {{{12, 33, 4, 87}}, {{3, 8, 24}}, {{13, 5, 29, 17}}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int k = 0; k < b[i][j].length; k++) {
                    if (b[i][j][k] == b[i][j][2]) {
                        System.out.print(" ");
                    } else {
                        System.out.print(b[i][j][k]);
                    }
                }
                System.out.println();
            }
        }
                   for (int i = 0; i < b.length; i++) {
                        for (int j = 0; j < b[i].length; j++) {
                            for (int k = 0; k < b[i][j].length; k++)
                    if (b[i][j][k] != b[i][j][2]) {
                        System.out.print(" ");
                    } else {
                        System.out.print(b[i][j][k]);
                    }
                }
            }
        System.out.println();
        }
    }




/*
напечатали в цикле элементы первого массива/
делаем перенос

печатаем в цикле элементы второго массива
 */