package methods;

import com.sun.security.jgss.GSSUtil;

public class scope {
    static int i;

    public static void main(String[] args) {
        i = 16;
        System.out.println(i);
        int i = 23;
        System.out.println(i);
        fun();
    }
    public static void fun(){
        System.out.println(i);
        int i = 70;
        System.out.println(i);
    }

}
