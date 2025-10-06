package Sliding_Window_Technique;

import java.util.LinkedList;
import java.util.Queue;

public class First_NegativeNo_OfSize_k {
    public long[] prinfirstnegativenumber(long arr[], int n,int k){
        Queue<Long> queue = new LinkedList<Long>();
        int index =0;
        while (index<k){
            if (arr[index]<0){
                queue.offer(arr[index]);
            }
            index++;
        }
        long[] re = new long[n-k+1];
        re[0] = (queue.isEmpty())?0 : queue.peek();
        for (int i =1; i<n-k+1;i++){
            if (arr[i-1]<0){
                queue.peek();
            }
            if (arr[i+k-1]<0){
                queue.offer(arr[i+k-1]);
            }
            re[0] = (queue.isEmpty()) ? 0 : queue.peek();
        }
        return re;
    }
    public static void main(String[] args) {
  long[] arr = {12,-1,-7,8,-15,30,16,28};
  int n = arr.length;
  int k = 3;
  First_NegativeNo_OfSize_k obj = new First_NegativeNo_OfSize_k();
  long[] result = obj.prinfirstnegativenumber(arr,n,k);
        System.out.print(" first negative number in every window is:" + result);
        for (long val : result){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
