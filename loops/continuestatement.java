package Loops;

public class continuestatement {
    public static void main(String[] args) {
        for(int i=1 ; i<=100; i++){
            System.out.println("hello");
            if(i==96 || i==99) continue;
            if( i%2==0 || i%3==0)
                System.out.println(i);
        }
    }
}
