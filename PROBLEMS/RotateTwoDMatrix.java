package PROBLEMS;

import java.util.Scanner;

public class RotateTwoDMatrix {
    static void printmatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    static void transposeinplace(int[][] matrix, int n){
//        int[][] ans = new int[c][r];
        for(int i=0; i<n;i++){
            for(int j=i*1;j<n;j++){
//                ans[i][j] = matrix[j][i];
              int temp = matrix[i][j];
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp;
            }
        }

    }
    static void reversearray(int[][] arr, int n){
//        int i =0 ,j = arr.length-1;
          for(int i =0 ;i<n; i++){
              int left = 0, right = n-1;
              while(left<right){
                  int temp = arr[i][left];
                  arr[i][left] = arr[i][right];
                  arr[i][right] = temp;
                  left++;
                  right--;
              }
          }

    }
   static void rotate(int [][] matrix, int n){
        // step 1: transpose the matrix
       transposeinplace(matrix,n);

       // step 2: reverse each row

   }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number of rows and columns:");
       int n =sc.nextInt();
        int [][] matrix = new int[n][n];
        int totalelements = n * n;
        System.out.println(" ENter " + totalelements + " Elements:");
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("Input matrix:");
        printmatrix(matrix);

        rotate(matrix, n);

        System.out.println("Rotation of matrix:");
        printmatrix(matrix);
    }
}
