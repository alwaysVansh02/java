package Arrays;

public class maxinarray {
    public static void main(String[] args) {
        int[] arr = {54, 56, 25, 48, 26, 48, 2, 5};
        int max = -1;  
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println( "the amximum no is:"+ " " +max);
    }
}
