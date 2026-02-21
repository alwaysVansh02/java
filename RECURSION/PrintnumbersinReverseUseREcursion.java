package RECURSION;

import java.util.Scanner;

public class PrintnumbersinReverseUseREcursion {
    static void printdecrease(int n ){
        // base case
        if(n==1){
            System.out.println(n);
            return;
        }
        // self work
        System.out.println(n); 
        // recursive work
        printdecrease(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        printdecrease(n);
    }
}
