// Given a String s, find the first non-repeating character in it and its inde , if
// it does not exist, return -1
//  for ex --> Input--> "leetcode"
// Output --> 0
package String_Problems;

public class First_Unique_Characters {
    static int uniquecharacter(String s){
        int[] freq = new int[26];
        char[] ch = s.toCharArray();
        for (char c: ch){
            freq[c-'a']++;
        }
        for (int i =0;i<ch.length;i++){
            if (freq[ch[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(" first unique charcter is : " + uniquecharacter("leetcode"));
    }
}
