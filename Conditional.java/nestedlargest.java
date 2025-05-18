package conditionals;

import java.util.Scanner;

public class nestedlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the first number :");
        int a = sc.nextInt();
        System.out.println(" Enter the second number : ");
        int b = sc.nextInt();
        System.out.println(" Enter the third number :");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(" the largest is "+a);
            }
            else{
                System.out.println(" the largest is "+c);

            }
        }
        else{
            if(b>c){
                System.out.println(" the largest is "+b);
            }
            else{
                System.out.println(" the largest is "+c);
            }
        }

    }
}
