package HasingProblems;

import java.util.HashMap;

public class Longest_Palindrome {
   static int longestPalindrome(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int length = 0;
        for (char ch : s.toCharArray()){
            int count = map.getOrDefault(ch,0)+ 1;
            map.put(ch,count);
            if (count % 2 ==0){
                length += 2;
            }
        }
        if (length<s.length()){
            length += 1;
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(" Longest Palindrome Length is  " + longestPalindrome(s));
    }
}
