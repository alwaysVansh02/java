package Arrays;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {2,8,5,4,9,6,5};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max) max= arr[i];
        }
        int secondmax = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>secondmax && arr[i] != max)
                secondmax = arr[i];
        }
        System.out.println( "the maximum number is :"+ " "+ max);
        System.out.println("the second maximium number is:"+ " "+  secondmax);
    }
}
