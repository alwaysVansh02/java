package conditionals;
import java.util.*;
public class balodigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number :");
        int n = sc.nextInt();
        if( n>99 && n<1000){
            System.out.println(" its a three digit number ");
        }
        else {
            System.out.println(" its not  a thre digit number ");
        }
    }
}
