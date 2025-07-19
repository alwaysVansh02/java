package WAPQuestions;


public class WAPPrintEven_OddNoinArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 6, 1, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]);
            System.out.println(" it is even");
            }
        else{
                System.out.print(arr[i]);
            System.out.println(" it is odd");
        }
        }

    }
}
