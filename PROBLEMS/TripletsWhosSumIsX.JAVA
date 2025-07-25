package PROBLEMS;
// isme arr input lia jaa rha h
import java.util.Scanner;

public class TripletsWhosSumIsX {
    static int pairsum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {  // first number
            for (int j = i + 1; j < n; j++) {  // second number
                for (int k = j+1; k < n; k++) {  // third number
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter the number of elements :");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println(" Enetr Array ELmentts : ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(" Enter target sum:");
            int target = sc.nextInt();

            System.out.println(pairsum(arr, target));
        }
    }



