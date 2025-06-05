package methods;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int pow = 1;
//        for( int i = 1; i<=b;i++){
//            pow *= a;
//        }

        //System.out.println(Math.pow(2,2));// build in library func
        int a=2 , b= 5, c= 7, d = 4;
        System.out.println( Math.max(Math.max(a,b), Math.max(c,d)));// hamesa 2 number ka hi greatest batayega
    }//four inputs ke liye
}
