package Arrays;
public class onlyproblems {

public static void main(String[] args) {
    int[][] arr = new int[3][3];
    int[][] nums = {{1,2,3},
            {4,5,6},
            {7,8,9}
    };
    for(int i =0;i<nums.length; i++){
        for(int j=0; j<nums.length;j++){
            System.out.print(nums[i][j]+ " ");
        }
        System.out.println();
    }}}
