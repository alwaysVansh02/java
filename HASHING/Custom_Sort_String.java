package HasingProblems;

import java.util.HashMap;

public class Custom_Sort_String {
   static String customString(String order, String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (char ch : order.toCharArray()){
            if (map.containsKey(ch)){
                int count = map.get(ch);
                while (count --> 0){
                    result.append(ch);
                }
                map.remove(ch);
            }
        }
        for (char ch : map.keySet()){
            int count = map.get(ch);
            while (count --> 0){
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String order =" cba";
        String s = " abcd";
        System.out.println(" Customorder is :" + customString(order, s));
    }
}
