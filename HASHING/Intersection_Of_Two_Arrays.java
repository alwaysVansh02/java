// Given two integer Arrays nums1 , nums2 Your task is two return an array of Intersection
// -> each result in the array must be unique and you may return in any order
// For ex-> int[] nums1 ={2,1,2,4,3}, int[] nums2 ={9,7,2,1,8,9}
// Output will be --> [1,2]
 package HasingProblems;
import java.util.HashSet;
import java.util.Set;

public class Intersection_Of_Two_Array {
   static int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int num : nums1){
            set.add(num);
        }
        for (int num : nums2){
            if (set.contains(num)){
                result.add(num);
            }
        }
        int[] ans = new int[result.size()];
        int idx = 0;
        for (int num : result) {
            ans[idx++] = num;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {2, 1, 2, 4, 3};
        int[] nums2 = {9, 7, 2, 1, 8, 9};
        int[] result = intersection(nums1, nums2);
        System.out.println("Intersection of two Arrays are :");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
