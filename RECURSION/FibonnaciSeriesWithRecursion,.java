package RECURSION;

public class FibonnaciSeriesWithRecursion {
    static int fib(int n){
        // base case
        if(n==0 || n== 1){
            return n;
        }
        // rceurrsive work
        int prev1 = fib(n-1);
        int prev2 = fib(n-2);
        // self work
        return prev1 + prev2;
    }
    public static void main(String[] args) {
        for(int i= 0;i<=10;i++){
            System.out.println(fib(i));
        }
    }
}
