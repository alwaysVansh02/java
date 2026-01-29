// Given a string allowed consisting of distinct characters and an array of strings words,
// return the number of strings in words that are consistent with allowed.
// ex-> Allowed ="ab", words = ["ad","bd","aaab","baa","badab"]
package HasingProblems;

import java.util.HashSet;

public class Count_No_Of_Consistants {
    static int CountConsistants(String allowed, String[] words){
   int counter =0;
        HashSet<Character> set = new HashSet<>();
        for (int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        for (String str : words){
            boolean flag =true;
            for (int i=-0;i<str.length();i++){
                if (!set.contains(str.charAt(i))){
                    flag =false;
                }
            }
            if (flag==true)
                counter++;
        }
   return counter;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(" the no of consistants words are : " + CountConsistants(allowed,words));
    }

}
