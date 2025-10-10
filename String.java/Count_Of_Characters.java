package String_Problems;

public class Count_OF_Characters {
    public static void main(String[] args) {
        String str ="hello world";
        int count =0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Number of count in a string are :  " + count);
    }
}

