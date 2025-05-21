package conditionals;
import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the cost price : ");
        int cp = sc.nextInt();
        System.out.println(" Enter the selling price " );
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println(" you gained a profit ");
            System.out.println( sp - cp);
        }
        if(cp>sp) {
            System.out.println(" you have a loss ");
        }

    }
}
