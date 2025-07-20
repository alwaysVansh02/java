package WAPQuestions;

import java.util.Scanner;

public class WAPReverse {
    //
//        System.out.println(number + " ");
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        int number = sc.nextInt();
        int reverse = 0;
        while (number != 0) {
            int temp = number % 10 ;
              reverse = reverse =reverse * 10 + temp;
            number = number / 10;
        }
        System.out.println(" reversed number is :" + reverse);


//

        }


    }

