package methods;

import java.util.Scanner;

public class pascalstraingle {
    public static int fact( int f){
        int fFact = 1;
        for(int i = 1; i<=f; i++){
             fFact *= i;
        }
        return fFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<=n; i++){    // row ke liye
            for( int j = 1; j<=n-i; j++){   // spaces print krne ke liye
                System.out.print(" " + " ");
            }
            for(int j =  0; j<=i; j++){     // column ke liye
                int icj = fact(i)/(fact(j)*fact(i-j));
                System.out.print(icj +"   ");
            }
            System.out.println();
        }
    }
}
