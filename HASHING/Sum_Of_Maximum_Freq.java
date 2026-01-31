// Given an array of integers, find the sum of frequencies of elements that have the maximum frequency.
// ex--> Input: nums = [1,2,2,3,1,4], Output: 4// Explanation: The elements with the maximum frequency are 1 and 2, both appearing twice.
// Therefore, the sum of their frequencies is 2 + 2 = 4.
package HasingProblems;

public class Sum_Of_Freq_Of_Elements {
    public static int maxFreqElement(int[] nums){
        int frq[] = new int[100];
        int maxFreq =0;
        int sumFreq =0;
        for (int element : nums){
            frq[element]++;
            int currFreq = frq[element];
            if (currFreq > maxFreq){
                maxFreq = currFreq;
                sumFreq = currFreq;
            } else if (currFreq == maxFreq) {
                sumFreq += currFreq;
            }
        }
        return sumFreq;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,2,3,1,4};
        System.out.println("Sum of Frequency Of Elem In Arr is :" + maxFreqElement(nums));
    }
}
