package HasingProblems;
import java.util.HashSet;
public class Largest_Positive_Integer {
   static  int  findmax(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        int max =-1;
        for (int num : nums){
            set.add(num);
        }
        for (int num : nums){
            if (set.contains(num)){
                max = Math.max(max, Math.abs(num));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,-1,2,-3,3};
        System.out.println("Largest Nums Is:" + findmax(nums));
    }
}
