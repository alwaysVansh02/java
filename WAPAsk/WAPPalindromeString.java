package WAPQuestions;

import java.util.Scanner;

public class WAPPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENter a String:");
        String str = sc.next();
        String org_str = str;
//        String str = " ABCD";
        String reverse = " ";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (reverse.equals(org_str)) {
//        System.out.println(reverse);
            System.out.println(org_str + " is a polindrome string");


        }
        else{
            System.out.println(org_str + " is not a polindrome string");
        }
    }
}
