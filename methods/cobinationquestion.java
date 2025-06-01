package methods;

import java.util.Scanner;

public class cobinationquestion {
    public static int fact(int f) {
        int ffact = 1;
        for (int i = 1; i <= f; i++) {
            ffact *= i;
        }
        return ffact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter n and r :");
        int n = sc.nextInt();
        int r = sc.nextInt();
//        int nfact = fact(n);
//        int rfact = fact(r);         // inn tino ke badle direct likhdo
//        int n_rfact = fact(n-r);
        int ncr = fact(n) / (fact(r) * fact(n-r));/// or chota ho gya
        int npr = fact(n)/fact(n-r);
        System.out.println(ncr);
    }
}

