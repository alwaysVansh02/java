package PROBLEMS;

import java.util.Scanner;

public class PascalsTriangleTwoDArray {
    static void printmatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int n){
        int [][] ans = new int[n][];  // kiu ki har col ka size alag h

        for(int i=0;i<n;i++){
            ans[i] = new int[i+1];
            ans[i][0]=1;
            ans[i][i] = 1;
            for(int j =1; j<i;j++){
                ans[i][j] =  ans[i-1][j] + ans[i-1][j-1];  //ex--> ans[2][1] = ans[1][0]+ans[1][1]
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n =sc.nextInt();
        int[][] ans =pascal(n);
        printmatrix(ans);
    }
}
