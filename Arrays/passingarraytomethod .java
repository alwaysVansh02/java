package Arrays;

public class passingarraytomethod {


    
    public static void change(int[]a, int[]b){
        int temp = a[0];
         a[0] = b[0];
        b[0] = temp;
    }
    public static void main(String[] args) {
int[] a = {10};
int[] b = {20};
        System.out.println(a[0]+ " " + b[0]);
        change(a,b);  
        System.out.println(a[0]+ " " + b[0]);


    }
}
