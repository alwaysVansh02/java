package HasingProblems;

import java.util.HashSet;

public class Minimum_Common_Value {
  static int minimumCommon(int[] nums1, int[] nums2){
       HashSet<Integer> set = new HashSet<>();
       for (int num : nums1){
           set.add(num);
       }
       for (int num : nums2){
           if (set.contains(num)) {
               return num;
           }
       }
       return -1;
   }
   public static void main(String[] args) {
        int [] nums1 = {1,2,3};
        int[] nums2 = {2,4};
        System.out.println("minimum common value is : " + minimumCommon(nums1, nums2));
    }
}
