// Given an array of strings words, return an array of all characters 
// that show up in all strings within the words (including duplicates).
// You may return the answer in any order.
// Example 1: // // Input: words = ["bella","label","roller"] 
// Output: ["e","l","l"] 
package HasingProblems;

import java.util.Arrays;
import java.util.List;
import java.util.List.*;
import java.util.ArrayList;

public class Find_Common_Characters {
    static List<String> commonCharacter(String[] words){
        int[] minfreq = new int[26];
        Arrays.fill(minfreq,Integer.MAX_VALUE);
        for (String word : words){
            int[] freq = new int[26];
            for (char ch : word.toCharArray()){
                freq[ch - 'a']++;
            }
            for (int i =0; i<26;i++){
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i =0; i<26; i++){
            while (minfreq[i] > 0){
                result.add((" " + (char)(i + 'a')));
                minfreq[i]--;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        String[] words = {"bella" , "label" , "roller"};
        System.out.println("Common Characters Are:" + commonCharacter(words));
    }
}
