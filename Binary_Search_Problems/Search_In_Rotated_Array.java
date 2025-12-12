// for example nums = {4,5,6,7,0,1,2,3}, target =0;
// you have to give the output as the index = 4
package BinarySearch_Problem;

public class Search_In_Rotated_Array {
    public int search(int[] nums, int target){
        int left = 0, right = nums.length-1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] <= nums[right]) {
                if (target> nums[mid] && target<= nums[right]){
                    left = mid+1;
                }else {
                    right= mid -1;
                }
            } else {
                if (target< nums[mid] && target>= nums[right]){
                    right = mid -1;
                }else {
                    left = mid +1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target =0;
        Search_In_Rotated_Array searcher = new Search_In_Rotated_Array();
        int result = searcher.search(nums,target);
        System.out.println("Index Of target " + result);
    }
}
