package conditionals;
import java.util.Scanner;
public class divisibleby5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Enetr a number : ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println(" yes the entered number is divisible ");
        }
        else
            System.out.println(" the entered number number is not divisible ");
    }
}
