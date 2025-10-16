package String_Problems;

public class Palindrome_String {
    public static void main(String[] args) {
        String str = " level ";
        String rev ="";
        for (int i = str.length()-1;i>=0;i--) {
            rev += str.charAt(i);
        }
        if (str.toLowerCase().equals( rev.toLowerCase())){
            System.out.println(" It is a valid palindrome");
        }
        else
            System.out.println(" NOt a valid Pallindrome ");
    }
}
