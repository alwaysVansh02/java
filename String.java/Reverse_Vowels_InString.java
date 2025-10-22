//Given a String s, reverse only all the vowels in the String and return it
// For example --> Input --> "hello"
// Output --> "holle";

package String_Problems;

public class Rverse_Vowels_InString {
    static String reversevowels(String s){
        char []ch = s.toCharArray();
        int i =0;
        int j =s.length()-1;
        while (i<j){
            if (!isvowels(ch[i]) ){
                i++;
            } else if (!isvowels(ch[j])) {
                j--;
            }
            else {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] =  temp;
                i++;
                j--;
            }
        }
        return String.valueOf(ch);
    }
    public static boolean isvowels(char ch){
        if (ch=='a' || ch=='e' || ch=='i'||ch =='o'||ch=='o'|| ch=='u' || ch=='A'|| ch=='E' || ch=='I'|| ch=='O' || ch=='U'){
    return true;
        }return  false;
    }
    public static void main(String[] args) {
        System.out.println(reversevowels("hello"));
    }
}
