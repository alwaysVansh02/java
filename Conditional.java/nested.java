package conditionals;

import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number :");
        int n = sc.nextInt();
        if ((n % 5 == 0 || n % 3 == 0) && n%15!=0) {
            System.out.println("the number is divisible by both 3 or 5 but not by 15");
        }
        else {
            System.out.println("Not divisible");
        }
    }
    }
