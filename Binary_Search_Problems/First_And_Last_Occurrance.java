// Given an Array of Integers nums sorted in non-decreasing order, find the first
// and last position of a given target value
// For ex--> Input--> nums = {5,7,7,88,10};
// Output shoud be the indexes --> {3,4};
package BinarySearch_Problem;
  
public class First_And_Last_OccuranceOf_Element {
    static int findfirstpos(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstidx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                firstidx = mid;
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstidx;
    }

    static int findlastpos(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastidx = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                lastidx = mid;
                left = mid + 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
    return lastidx;
    }

    public static void main(String[] args) {
       int [] nums = {2,4,4,4,5,6,7};
       int target = 4;
       int first = findfirstpos(nums, target);
       int last = findlastpos(nums, target);
        System.out.println("First position :" + first);
        System.out.println("Last position :" + last);
    }
}

