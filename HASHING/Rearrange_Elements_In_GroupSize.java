// Given an array of integers hand and an integer groupSize, return true
// if it is possible to rearrange the cards in hand into groups of size groupSize,
// where each group consists of groupSize consecutive cards. Otherwise, return false.

package HasingProblems;

import java.util.TreeMap;

public class HAnd_Of_Straights {
    static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int card : hand) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }
        while (!map.isEmpty()) {
            int currentCard = map.firstKey();
            for (int i = 0; i < groupSize; i++) {
                int card = currentCard + i;
                if (!map.containsKey(card)) return false;
                map.put(card, map.get(card) - 1);
                if (map.get(card) == 0) {
                    map.remove(card);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] hand = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;
        System.out.println("Output: " + isNStraightHand(hand, groupSize));
    }
}
