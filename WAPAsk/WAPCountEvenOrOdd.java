package WAPQuestions;

public class WAPCountEvenOrOdd {
    public static void main(String[] args) {
        int number =  123456;
        int evencount = 0;
        int oddcount = 0;
        while(number> 0 ) {
            int digit = number % 10;  // last digit extract krta
            if (digit % 2 == 0) {   // even
                evencount++;
            } else {
                oddcount++;
            }
            number = number / 10;  // ek ek digit hata ne k liye
        }
            System.out.println("Even digits :" + evencount);
            System.out.println("Odd digits : "+ oddcount);

        }
    }

