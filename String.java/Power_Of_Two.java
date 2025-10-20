// Given An Integer n, return true if it is a power of two otherwise return false.
// An Integer is a power of Two, if there exist an integer x such that n ==2^x
// for ex--> Input--> n =16
// output--> true;
package String_Problems;

public class Power_Of_Two {
    static boolean isPowerOFTwo(int n){
        if (n==0){
            return  false;
        }
        while (n!=1){
            if (n%2!=0){
                return  false;
            }
            else{
                n = n/2;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOFTwo(n));
    }
}
