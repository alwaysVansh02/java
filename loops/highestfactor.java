package Loops;

import java.util.Scanner;

public class highestfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("  Enter an number: ");
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
               flag = true;
//                System.out.println(" Composite number ");
                break;
            }

        }
        if(flag==false)
            System.out.println(" Prime number ");
        else
            System.out.println(" Composite Number ");
    }
}
