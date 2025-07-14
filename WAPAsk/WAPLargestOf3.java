package WAPQuestions;

public class WAPLargestOf3 {
    public static void main(String[] args) {

        int a = 10,b = 30 ,c = 40;
int largest1 = a > b ? a :b ;
int largest2 = c > largest1 ? c : largest1;
        System.out.println(largest2 + " largest");

    }
}
