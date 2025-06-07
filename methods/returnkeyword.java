package methods;

public class returnkeyword {
    public static int greet(int time) {
        if (time < 12)
            System.out.println(" good morning");   
        else
            System.out.println(" good afternoon ");
       return time; 
    }


    public static void main(String[] args) {
        greet(24);
    }
}
