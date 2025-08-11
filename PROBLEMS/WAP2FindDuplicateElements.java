package WAPQuestions;

public class WAP2FindDuplicateElements {
    public static void main(String[] args) {
        int []arr={1,2,1,3,3 ,4};
//        System.out.println(" the duplicate no is :");
        for(int i =0; i<arr.length;i++){
            int j;
            for(j=i + 1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(" the duplicate no is : " +arr[i]);
                    break;
                }
            }
        }
    }
}
