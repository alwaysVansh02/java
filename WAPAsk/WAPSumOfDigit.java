package WAPQuestions;

public class WAPSumOfDigit {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            while (number != 0) {
                sum += number % 10;
                number = number / 10;

            }
            System.out.println(" Sum of digti :" + sum);
        }
    }
}
