package WAPQuestions;

public class WAPCheckEqualityOfTwoArr {
    public static void main(String[] args) {
        int []arr1 ={1,2,3,4};
        int []arr2 ={1,2,3,4};

        boolean isequal = true;
        if(arr1.length!=arr2.length){
            isequal =false;
        }
        else
            for(int i = 0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    isequal=false;
                    break;
                }
            }
    if(isequal){
        System.out.println(" Array Elements Are Equal");
    }
    else
        System.out.println(" Array Elements Are Not Equal");

    }
}
