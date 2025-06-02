package methods;

public class moreaboutmethods {
    public static void fun() {     // ye hamara create kiya hua function h
        System.out.println(" hi , Good Morning");
        for (int i = 1; i <= 10; i++) {    // isaka sara kaam good morning or hello ke bich hoga
            System.out.print( i+ " ");
        }
        System.out.println();
        fun2();

    }
    public static void main(String[] args) {
        System.out.println(" yo yo");
        fun();// function ko cal kiya
        System.out.println(" hello");

    }
    public static void fun2(){
        System.out.println(" good night");
        fun3();
    }
    public static void fun3(){
        System.out.println(" rahul randi");
    }
}
///  1st print hga " yo yo "
// 2nd m print hoga hi , good morning main class m jo h
//3rd me print hoga fun(); jo ki call hua number print krega;
//4th me good night print karega jo fun2() clas h call kiya gya above main cvlass
//5th me print karega rahuul jo ki fun3() m ha callkiya gya h fun2()
//6th me print krega hello jo ki main class me third me ata h

