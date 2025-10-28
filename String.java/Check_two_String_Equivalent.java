// Given two Strings word1 and word2 , each of length n , return true if word1 and word2 are
// almost equivalent or false other wise
// for ex --> INput--> word1 = "abcdef", word2 = "abaaacc";
// output --> true;
package String_Problems;

public class Check_Two_String_Equivalent {

    static boolean equivstring(String word1, String word2){
        int len  = word1.length();
        int[] freq = new int[26];
        for (int i =0;i<len;i++){
            freq[word1.charAt(i) - 'a']++;
            freq[word2.charAt(i) - 'a']--;
        }
        for (int i =0;i<26;i++){
            if (Math.abs(freq[i])>3){
            return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String word1 = "abcdef";
        String wprd2 = "abaaacc";
        System.out.println(equivstring(word1,wprd2));
    }
}
