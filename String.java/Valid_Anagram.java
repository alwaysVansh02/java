package String_Problems;

import java.util.Arrays;

public class Valid_Anagram {
    static boolean validanagram(String s, String t){
        char ch1[] = s.toCharArray();
        char [] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int i =0;
        int j =0;
        while (j< ch1.length){
            if(ch1[i] != ch2[j]){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(validanagram(s,t));
    }
}
