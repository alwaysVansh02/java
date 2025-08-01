package PROBLEMS;

public class ReversingArrayOfInteger {
    static void reverse(int[] arr) {
        int reverse = 0;
        int num = arr.length;
        System.out.println(" Original array is :" + arr);
        while (num !=0) {
            int temp = arr.length % 10;
            reverse = reverse * 10 + temp;
            num = arr.length / 10;
            System.out.println(" Reversed Array is :" + arr);
        }
    }
        public static void main (String[]args){
            int[] arr = {1, 2, 3, 4, 5};
            reverse(arr);
        }
    }

