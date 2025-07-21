package WAPQuestions;

public class WAPReverseString {
    public static void main(String[] args) {
        String str = " ABCD";
        String reverse = " ";
        int  length = str.length();
        for(int i = length-1; i>=0;i--){
            reverse =reverse+str.charAt(i);
        }
        System.out.println(reverse);


  }
}
