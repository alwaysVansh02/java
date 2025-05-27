package Loops;

import java.util.Scanner;

public class loopsbasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number :");
        int n = sc.nextInt();
        for( int i = 17 ; i<=170; i =i+=17){
            if(i%17==0)
            System.out.println( i );
        }
    }
}
