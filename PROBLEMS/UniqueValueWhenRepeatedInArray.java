package PROBLEMS;

import java.util.Scanner;

public class UniqueValueWhenRepeatedInArray {
    static int pairsum(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {  // first number
            for (int j = i + 1; j < n; j++) {// second number
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                    }  
                }
            }
        int ans =-1;
        for(int i= 0 ;i<n; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(" Enetr Array ELmentts : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" the unique number is :" + pairsum(arr));

    }
}
