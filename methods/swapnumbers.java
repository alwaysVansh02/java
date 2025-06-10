package methods;

import java.util.Scanner;

public class swapnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number a :");
        int a = sc.nextInt();
        System.out.println(" Enter number b :");
        int b = sc.nextInt();

    System.out.println(a+ " "+ b);
        int temp= a;
        a = b ;
        b = temp;
        System.out.println(a+" "+b);
    }
}
