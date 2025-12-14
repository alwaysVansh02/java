// we have to find the peak elemnt means strictly greater than the previous and after element
// for ex == 1,2,1,3
// output will be =2
package BinarySearch_Problem;

public class Find_Peak_Element {
    static int findpeakElement(int[] nums){
        if (nums.length==1){
            return 0;
        }
        if (nums[0]>nums[1]){
            return 0;
        }
        for (int i =1;i< nums.length;i++){
            if (nums[i]>nums[i+1] && nums[i]> nums[i-1]){
                return i;
            }
        }
        if (nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(" the elemnt is: "+ findpeakElement(nums));
    }
}
