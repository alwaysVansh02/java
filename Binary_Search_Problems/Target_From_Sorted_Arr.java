package BinarySearch_Problem;

public class Target_From_Sorted_Array {
    static int binarysearch(int []num, int target){
        int left =0;
        int right = num.length-1;
        while (left<=right){
            int mid = (left + right) / 2;
            if (num[mid]== target){
                return  mid;
            } else if (num[mid]<target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
            return  -1;
    }
    public static void main(String[] args) {
        int []num = {-1,0,3,5,9,12};
        int target = 0;
        System.out.println(binarysearch(num, target));
    }
}
