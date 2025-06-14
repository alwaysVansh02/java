package pattern_printing;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter n:");
        int n = sc.nextInt();
            for (int j = 1; j <= n; j++) {
                for(int i = 1; i<=j;i++){
                    if(j%2!=0)
                        System.out.println(i+" ");
                    else System.out.println((char)(i+64)+" ");

            }
                System.out.println();
        }

    }
}
