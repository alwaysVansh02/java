package Two_pointer_Technique;

public class Sorted_Square {
    static int[] sortedsquare(int[] num) {
        int[] ans = new int[num.length];
        int i = 0, j = num.length - 1, k = ans.length - 1;
        while (i <= j) {
            if (num[i] * num[i] <= num[j] * num[j]) {
                ans[k] = num[j] * num[j];
                j--;
                k--;
            } else {
                ans[k] = num[i] * num[i];
                i++;
                k--;
            }
        }
            return  ans;
    }

    public static void main(String[] args) {
        int[] num = {-4,-1,-0,3,10};
        int[] result = sortedsquare(num);
        for (int val : result){
            System.out.print(val +" ");
        }
        System.out.println();
    }

}
