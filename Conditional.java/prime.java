package conditionals;

import java.util.Scanner;

public class prime {
    static boolean isPrime(int n){
        for (int i  =1;i<n;i++){
            if (n%i==0)return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
