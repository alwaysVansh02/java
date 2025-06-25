package Arrays;

import java.util.Scanner;

public class takinginput  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int [] arr = new int[n];
        // input ke liye
        System.out.println(" Enter array elements :");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // output ke liye
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]*2 + " ");
        }
    }



}
