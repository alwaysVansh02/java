package WAPQuestions;

import java.util.Random;
// approach 1
public class WAPGeneratRandomNoAndString {
    public static void main(String[] args) {
        Random random = new Random();
        int random_int  = random.nextInt(100);
        System.out.println(random_int);
        random.nextDouble();  // range 0.0 to 1.0
        double random_ipl = random.nextDouble();
        System.out.println(random_ipl);

        // approach 2
//        public static void main(String[] args) {
//            System.out.println(Math.random());




    }
}
