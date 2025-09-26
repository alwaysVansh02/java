package Two_pointer_Technique;
// by using two pointer technioque
public class Valid_Palindrome {
    static boolean ispalindrome(String s) {
        s = s.toLowerCase();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= '0') && (ch <= '9'))
                res += ch;
            else if ((ch>='0' )&&(ch<='9' ))
                res +=ch;
        }
        int i=0;
        int j = res.length()-1;
        while (i<=j){
            if (res.charAt(i) != res.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String  s = "A man, a plan, a canal, aPanama";
        System.out.println("checking palindrome:"+ ispalindrome(s));
    }
}

