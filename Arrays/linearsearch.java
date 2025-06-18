package Arrays;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,};
        int x = 8;
        boolean flag = false;  // nahi mila
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag = true;  // mil gaya
                break;
            }

        }
        if(flag==false)
            System.out.println(" nahi mila");
            else
            System.out.println(" milll gaya");
        }
    }

