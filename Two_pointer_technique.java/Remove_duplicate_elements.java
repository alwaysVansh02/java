package DSATWOPointerTechnique;

public class RemoveDuplicateElements {

    public static int removeduplicate(int[] arr, int n){
        int uq = 1;
        for (int i =1;i<n;i++){
            if (arr[i] != arr[i-1]){
                arr[uq] =arr[i];
                uq++;
            }
        }
        return uq;
    }

    public static void main(String[] args) {
       // RemoveDuplicateElements obj= new RemoveDuplicateElements();
        int[] arr ={1,2,2,3,3,3,4};
        int n = arr.length;
        int uq = removeduplicate(arr,n);
        for (int i=0;i<uq;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("unique count is:" + uq);

    }
    }



