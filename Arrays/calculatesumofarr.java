package Arrays;

import java.util.Scanner;

public class calculatesumofarr {
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
        int sum = 0;
        for(int i = 0;i<n; i++){
            sum +=arr[i];
        }
        System.out.println("the summ is" +" "+ sum);
    }

}
