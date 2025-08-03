package PROBLEMS;

import java.util.Scanner;

public class PrefixSumApproach {
    // normal prefix approach
    static void printarray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makeprefixsumarray(int[] arr) {
        int n =arr.length;


        for(int i =1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(" Input array:");
        printarray(arr);
        int []pref= makeprefixsumarray(arr);
        printarray(pref);

    }
}
