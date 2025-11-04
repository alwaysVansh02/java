// Given a non - negaive  iteger x, return the sqrt of x, rounded down to the nearest iteger.
// the rerturn integer should be non negative as well
// you must not use any in built fucntion in java
// for ex -> input--> 18
// output--> 4
package BinarySearch_Problem;

public class SqrtOf_X {
    static int mysqrt(int x){
        if (x==0){
            return 0;
        }
        int left =1;
        int right = x;
        int result =1;
        while (left<=right){
            int mid = left + (right-left)/2;
            long sqrt = (long) mid * mid;
            if (sqrt==x){
                return mid;
            } else if (sqrt<x) {
                result=  mid;
                left= mid+1;
            }
            else {
                right = mid -1;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(mysqrt(18));
    }
}
