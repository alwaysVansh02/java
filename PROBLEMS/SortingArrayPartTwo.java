package PROBLEMS;

import java.util.Scanner;

public class SortingArrayPartTwo {
    static void printarray(int[] arr){
        int n = arr.length;
        for(int i =0;i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortbydiffmethod(int[] arr){
        int n = arr.length;
        int left = 0, right =n-1;
        while(left<right){
            if(arr[left] ==1 && arr[right]==0){
                swap(arr ,left, right);
                left++;
                right--;

            }
            if(arr[left] ==0){  // yaha2 2 traversal nahi laga
                left++;         //  yani 2 baar for loop nhi lagana pada
            }
            if(arr[right]==1){
                right--;
            }
        }
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
        System.out.println(" original array");
        printarray(arr);
        sortbydiffmethod(arr);
        System.out.println(" Sorted array");
        printarray(arr);
    }
}
