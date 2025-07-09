package WAPQuestions;

public class WAPForFindMissingNo {
    public static void main(String[] args) {
        int []arr = {1,2,4,5};
        int sum = 0;
        for(int i=0;i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
        int sum1 = 0;
        for(int i = 1;i<=5;i++){
            sum1 = sum1+i;
        }
        System.out.println(sum1);
        System.out.println(" missing number :"+ (sum1 - sum));
    }
}
