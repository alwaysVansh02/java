package RECURSION;

public class SumOfDigits {
    static int sod(int n){
        // base case
        if(n>0 && n<=9){
            return n;
        }
//        // recursive work
//        int small_ans = sod(n/10);
//        // self work
//        int ans = small_ans + n%10;
//        return ans;
        return sod(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.println(sod(1234));
    }
}
