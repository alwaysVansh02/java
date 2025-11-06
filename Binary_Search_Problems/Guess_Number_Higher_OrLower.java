// Guess you are playing a game of guessing a number  , in wich i pick a card
// and you guess the number on the card , if correct than return accordingly
// return 0 for guess == num
// return 1 if guess is greater than num
// return -1 if guess is less than num
package BinarySearch_Problem;

public class GuessNumber_HigerOrLower {
    static  int pick = 10;
    static int guess(int num){
        if (num == pick){
                return 0;
    }else if (num>pick){
            return -1;
        }else {
            return 1;
        }
    }
    static int guessnumber (int n){
        int left = 1, right = n;
        while (left<=right){
            int mid = left + (right - left)/2;
            int guessres = guess(mid);
            if (guessres == 0){
                return mid;
            } else if (guessres == -1) {
                 right= mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(guessnumber(18));
    }
}
