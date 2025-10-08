// Q--> Reverse words in string
// given an input String s, reverse the order of the string
// for ex-->input --> String s = " the sky is blue ";
// Output--> blue is sky the

package String_Problems;

public class Reverse_Words_InString {
    static String reversewords(String s){
        String[] words = s.split(" + ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(reversewords("the sky is blue "));
    }
}
