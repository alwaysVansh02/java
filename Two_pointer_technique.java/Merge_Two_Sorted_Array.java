package Two_pointer_Technique;

public class Merge_Two_sortedArray {
    public static void marge(int [] num1,int m, int[] num2,int n){
        int[] newarr = new int[m+n];
        int i =0; int j=0;int k =0;
        while (i<m&& j<n){
            if (num1[i]<num2[j])
                newarr[k++] = num1[i++];
            else
                newarr[k++] = num2[j++];
        }
        while (i<m){
            newarr[k++] = num1[i++];
        }
        while (j<n){
            newarr[k++] = num2[j++];
        }
        for (int p =0;p<(m+n);p++){
            num1[p] = newarr[p];
        }
    }

    public static void main(String[] args) {
        int [] num1 = {1,2,3,0,0,0};
        int m = 3;
        int []num2 = {2,4,6};
        int n = 3;

        marge(num1,m,num2,n);
        System.out.println("Merged Array :");
        for(int p =0 ;p<(m+n); p++){
            System.out.print(num1[p]+ " ");
        }
        System.out.println();
    }
}
