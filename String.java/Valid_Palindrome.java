// Given a string s, return true if it is a pallindrome or false if not
// For ex--. Input--> "level"
//         output--> true;
package String_Problems;

public class Valid_Pallindrom_Check {
    static boolean ispallindrome(String s){
        s= s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int l =0;
        int r = s.length()-1;
        while (l<r){
            if (s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(ispallindrome("A man, a plan, A canal:panama"));
        }
    }



