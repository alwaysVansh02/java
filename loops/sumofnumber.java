package Loops;
import java.util.*;
public class sumofnumber {
    static int sum(int n){
        int sum =0;
        int num =0;
        while (n!=0){
            int lastdigit = n%10;
            sum += lastdigit;
            n =n/10;
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the numbers :");
        int n = sc.nextInt();
        int num = 0;
        while(n!=0){
            int lastdigit = n%10;
         num  = num * 10;

            num += lastdigit;
            n/=10;

        }
        System.out.println(num + n);
        System.out.println(sum(1234));
    }
}
