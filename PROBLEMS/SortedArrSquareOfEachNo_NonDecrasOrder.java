package PROBLEMS;

import java.util.Scanner;

public class SortedArrSquareOfEachNo_NonDecrasOrder {
    static void printarray(int []arr){
        int n= arr.length;
        for(int i = 0; i<n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[]arr , int i, int j){ // i or j basicaly satrat or end point h
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
static int[] sortsquares(int[] arr){
        int n = arr.length;
        int left = 0, right =n-1;
        int []ans = new int[n];
        int k =0;

        while(left<=right){
            if(Math.abs(arr[left]) > (arr[right])){
                ans[k++]= arr[left]* arr[left];
                left++;
            }else{
                ans[k++]= arr[right]*arr[right];
                right--;
            }
        }
        return ans;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(" Enetr Array ELmentts : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" Original Array");
        printarray(arr);
        int [] ans = sortsquares(arr);
        System.out.println(" Sorted array:");

        printarray(ans);
    }
}
