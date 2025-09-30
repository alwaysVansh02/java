package Two_pointer_Technique;

import java.util.*;

public class Three_SumProblem {

    // optimized approach using two pointers
    public static List<List<Integer>>threesum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums); // lib function for sorting
        for (int i =0;i<n-2;i++){
            if (i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i+1,r = n-1;
            while (l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if (sum==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (i<r && nums[l] == nums[l+1]){
                        l++;
                    }
                    l++;
                    r--;
                } else if (sum<0) {
                    l++;
                }
                else r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        System.out.println("Trip[lets are: "+ threesum(nums));
    }
}
