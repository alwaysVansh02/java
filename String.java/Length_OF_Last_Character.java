package String_Problems;

public class Length_of_LastWortd {
    public static  int  lemgthoflastword(String s){
        String str = s.trim();
        int count =0;
            for (int i = str.length()-1; i>=0;i--){
                if (str.charAt(i)!=' '){
                    count++;
                }
                else
                    break;
        }
            return count;
    }
    public static void main(String[] args) {
 String s = " My name is";
        System.out.println(lemgthoflastword(s));
    }
}
