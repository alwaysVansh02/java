package WAPQuestions;

import java.util.Scanner;

public class WAPPalindromeNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int org_num = num;
        int rev = 0;
        while (num != 0) {
            int temp = num % 10;
            rev = rev * 10 + temp;
            num = num / 10;

        }
        if (org_num == rev) {
            System.out.println(org_num + " paklindrome no :");
        } else {
            System.out.println(org_num + " is not a polindrome no: ");
//            System.out.println(rev);

        }
    }
}
