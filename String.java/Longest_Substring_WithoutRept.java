// Given a string S, find the length of thw longest Substring withoout
// repeating characters
// For ex- --> Input --> "abcdabcdabcb"
// output --> 4
package String_Problems;

import java.util.ArrayList;
import java.util.List;

public class Lomgest_Substring_WithoutRepeating_Char {
    public static void main(String[] args) {
        String str = "abcdabcbb";
        int start =0;
        int end =0;
        int max_length = 0;
        List<Character> list = new ArrayList<Character>();
        while (end<str.length()){
            if (!list.contains(str.charAt(end))){
                list.add(str.charAt(end));
                end++;
                max_length = Math.max(max_length,list.size());
            }
            else{
                list.remove(Character.valueOf(str.charAt(start)));
                start++;
            }

        }
        System.out.println("Length of the longest substring is:" + max_length);
    }
}
