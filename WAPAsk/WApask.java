package WAPQuestions;
public class WAPAsk {
    public static void main(String[] args) {
      // without using temp
       int a= 10, b = 20;
  a= a+b;  // 10 + 20 = 30-> a
        b = a-b;  // 30 - 20 = 10-> b
        a = a-b;  // 30 - 10 = 20-> a  after swap yhi show hoga
        System.out.print(" after swaping numbers are : " +a +" " +b);
