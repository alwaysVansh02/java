package String_Problems;

public class Index_OfThe_FirstOccurance {
    public static int firstoccurance(String haystack, String needle){
        for (int i =0;i<haystack.length()- needle.length()+1;i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                if (haystack.substring(i,needle.length()+1).equals(needle));
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = " sadbutsad";
        String needle = " sad ";
        //firstoccurance(haystack,needle);
        System.out.println(firstoccurance("sadbutsad", "sad"));

       // System.out.println(firstoccurance(haystack,needle));
    }
}
