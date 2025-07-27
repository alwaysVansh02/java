package PROBLEMS;

public class SwapingTwoIntegerValue {
    static void swap(int a, int b){
        System.out.println(" Print values before Swap");
       System.out.println(" a = " + a);
        System.out.println(" b = " +b );
        a = a+b;
        b = a-b;
        a = a - b;
        System.out.println(" Print values after swap ");
       System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
//        int [] arr = {1,2,3,4,5};
        swap(a , b);

    }

}
