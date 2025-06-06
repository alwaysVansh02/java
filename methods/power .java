package methods;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=2 , b= 5, c= 7, d = 4;
        System.out.println( Math.max(Math.max(a,b), Math.max(c,d)));
    }
}
