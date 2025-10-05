package Sliding_Window_Technique;

import java.util.ArrayList;

public class MaxSum_SubArray_OfSizeK {
    static long maximumsumsubarray(int k, ArrayList<Integer>arr, int n){
        long sum = 0;
        long maxSum = 0;
        // first k elements ka sum find karenge
        int index = 0;
        while (index<n && index<k){
            sum += arr.get(index);
            index++;
        }
        maxSum=0;
        for (int i=1;i<n-k+1;i++){
            int prevelement = arr.get(i-1);
            int nextelement = arr.get(i+k-1);
            sum = sum - prevelement+nextelement;
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
ArrayList<Integer> arr = new ArrayList<>();
arr.add(1);
arr.add(2);
arr.add(3);
arr.add(4);
arr.add(5);
        int k = 2;
        int n = arr.size();
        long result = maximumsumsubarray(k,arr,n);
        System.out.println("maximum sum of subarray of size:" + k + " is " + result );

    }
}
