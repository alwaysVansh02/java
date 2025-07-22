package WAPQuestions;

import java.util.Scanner;

public class WAPSearchingElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 3, 0, 40, 50};
        System.out.println(" Enter the Key no : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(" Element found at index :" + i);
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
