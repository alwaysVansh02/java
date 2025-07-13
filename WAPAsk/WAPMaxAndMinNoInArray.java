package WAPQuestions;

public class WAPMaxAndMinNoInArray {
    public static void main(String[] args) {
         int []arr = {20,50,8,48,98,100};
         int max = arr[0];
         int min = arr[0];
         for(int i = 0;i<arr.length ; i++){
             if(arr[i]> max){
                 max = arr[i];

             }
             if (arr[i] < min) {
min = arr[i];


             }
         }
             System.out.println(" maximum value is "+ max);
             System.out.println("minimum value i "+ min);
    }
}
