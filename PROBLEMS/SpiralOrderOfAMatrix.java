package PROBLEMS;

import java.util.Scanner;

public class SpiralOrderOfAMatrix {
    static void printmatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printspiralorder(int[][] matrix, int r, int c) {
        int toprow = 0, bottomrow = r - 1, leftcolumn = 0, rightcolumn = c - 1;
        int totalelements = 0;
        while (totalelements < r * c) {
            // toprow --> leftcol to rightcol
            for (int j = leftcolumn; j <= rightcolumn; j++) {
                System.out.println(matrix[toprow][j] + " ");
                totalelements++;
            }
            toprow++;
            // rightcol-> toprow to bottomrow
            for (int i = toprow; i <= bottomrow; i++) {
                System.out.println(matrix[i][rightcolumn] + " ");
                totalelements++;
            }
            rightcolumn--;
            // bottomrow --> rightcol to leftcol
            for (int j = rightcolumn; j >= leftcolumn; j--)
                System.out.println(matrix[bottomrow][j] + " ");
            totalelements++;

        }
        bottomrow--;
        // left col--> bottomrow to toprow
        for (int i = bottomrow; i >= toprow; i--) {
            System.out.println(matrix[i][leftcolumn] + " ");
            totalelements++;
        }
        leftcolumn--;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r*c;
        System.out.println("Enter the " + total + "Elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();

            }

        }
        System.out.println("  Input matrix:");
        printmatrix(matrix);
        System.out.println("Spiral order:");
        printspiralorder(matrix,r,c);

    }
}
