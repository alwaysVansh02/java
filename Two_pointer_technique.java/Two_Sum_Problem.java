package DSATWOPointerTechnique;

public class twoSum {


    ///  optimized solution
    public static int[] twosum(int[] arr, int target){
        int n = arr.length;
        int l =0; int r= n-1;
        while (l<r){
            int sum = arr[l] + arr[r];
            if (sum==target) {
                return new int[]{l + 1, r + 1};
            }
                else if (sum<target) {
                l++;
            }
                else{
                    r--;
                }
            }
            return new int[] {-1,-1};
        }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15,16};
        int target =26;
        int [] result = twosum(arr,target);
        System.out.println("indexes are:" + result[0] + " "+ result[1]);

    }
    }




