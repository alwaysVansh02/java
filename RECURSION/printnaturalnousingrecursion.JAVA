package RECURSION;

import java.util.Scanner;
public class printnaturalnousingrecursion {
static void PI(int N){
    if(N== 1){
        System.out.println(N);
    return;
    }
    PI(N-1);
    System.out.println(N);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        PI(n);

    }
}
