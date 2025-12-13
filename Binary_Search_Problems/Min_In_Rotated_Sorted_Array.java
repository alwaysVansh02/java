// Given an Sorted Rotated Array "nums" of unique elements, return the minimum
// element of thois array
// fpr example int[] nums=  {4,5,6,0,1,2,3}  output  =0;
package BinarySearch_Problem;

public class Minimum_In_Rotated_Sorted_Array {
    static int findmin(int[] nums){
        int left =0, right = nums.length-1;
        while (left<right){
            int mid = left+(right-left)/2;
            if (nums[mid]>nums[right]){
                left = mid + 1;
            }else {
                right = mid;
            }
        } return nums[left];
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,0,1,2,3};
        System.out.println("the minimum index output is: " +  findmin(nums));
    }
}
