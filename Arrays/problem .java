package Arrays;

public class problem {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 3, 18, 10, 1};
        int x = 6;


        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count > x)
                count += 1;


            System.out.println( ("Number of elements greater than"+ x + "is:"+ count));

        }
    }
}
