package GFGJavaQuestion;

public class Geeks {

    // by using funtion
    static String name;
    static float price;

    static void set(String n, float p){
        name  = n;
        price =p;
    }
    static void get(){
        System.out.println("Software name is:"+ name);
        System.out.println("Software price is:"+ price);
    }
 
    public static void main(String[] args) {
        Geeks.set("Visual studio", 0.2f);
        Geeks.get();
    }
}
