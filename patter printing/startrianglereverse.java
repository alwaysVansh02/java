package pattern_printing;

import java.util.Scanner;

public class startrianglereverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                // if (i + j >n)
                System.out.print(" *");
            }
            for(int j=1; j<=n-i; j++){

               // else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
