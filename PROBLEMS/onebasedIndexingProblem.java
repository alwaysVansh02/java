package PROBLEMS;

import java.util.Scanner;

public class onebasedIndexingProblem {
    static int[] makeprefixsumarray(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Array Size:");
        int n =sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println(" ENetr "+ n +" Elements:");
        for(int i =1; i<=n ;i++){
            arr[i] = sc.nextInt();
        }
        int[] prefsum = makeprefixsumarray(arr);
        System.out.println("Enter number of queries:");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println(" Enter the range:");
            int l = sc.nextInt();
            int r =sc.nextInt();

            int ans =  prefsum[r] - prefsum[l-1];
            System.out.println("Sum" + ans);
    }
}
}
