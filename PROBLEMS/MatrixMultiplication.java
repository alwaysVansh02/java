package PROBLEMS;

import java.util.Scanner;

import static PROBLEMS.AdditionOfTwoMatrix.printmatrix;

public class MatrixMultiplication {
    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println(" Multiplication is not possible");
            return;
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];  // a ka i konstant h lekin k vary kr rha
                    // wese hi b ka j komstant h or k vary ktr rha

                }
            }
        }
        System.out.println(" multiplication of two matrix is: ");
        printmatrix(mul);
    }
    static void add(int [][] a, int r1, int c1, int [][] b, int r2, int c2) {
    }
        public static void main (String[]args){
              Scanner sc = new Scanner(System.in);
            System.out.println(" Enter the no of rows  an d columns in matrix 1 :");
            int r1 = sc.nextInt();
            int c1 =  sc.nextInt();
            int[][] a = new int[r1][c1];
            System.out.println(" Enter the values of matrix :");
            for(int i=0;i<r1;i++){
                for(int j=0; j<c1; j++){
                    a[i][j] = sc.nextInt();
                }
        }
            System.out.println(" Enter the no of rows and columns of matrix 2:");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            int[][] b= new int[r2][c2];
            System.out.println(" Enter the values of matrix 2:");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    b[i][j] = sc.nextInt();

                }
            }
            System.out.println("Matrix 1 is:");
            printmatrix(a);
            System.out.println("Matrix 2 is:");
            printmatrix(b);
            multiply(a, r1, c1, b, r2, c2);
    }
}
