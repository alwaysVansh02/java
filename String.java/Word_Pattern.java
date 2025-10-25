package String_Problems;

import java.util.HashMap;

public class Word_Pattern {
    static boolean wordpattern(String pattern,String s){
        String[] arr = s.split(", ");
        if (pattern.length()!=s.length()){
            return false;
        }
        HashMap<Character,String> hm= new HashMap<>();
        for (int i =0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
           // boolean contenskey = hm.containsKey(ch);
            if (hm.containsKey(ch)) {
                if (!hm.get(ch).equals(arr[i])) {
                    return false;
                }
            }
            else {
                if (hm.containsValue(arr[i])){
                    return false;
                }
                hm.put(ch,arr[i]);
            }
        }
            return  true;
    }
    public static void main(String[] args) {
        System.out.println(wordpattern("abba", "dog,cat,cat,dog"));
    }
}
