package main.org.datastructure.arrays.problems;

/**
 * Given an integer array nums, determine the length of the smallest continuous subarray where the sum of
 * the elements is higher or equals to a integer target.
 * 
 * If there is no valid subarray, returns 0.
 * 
 * RULES
 * - The subarray must be higher or equals to the target value.
 * - If there is not valid subarray, return 0.
 */

/**
 * EXAMPLES

1º
nums = [2, 3, 1, 2, 4, 3]
target = 7
output: 2 (3, 4) ou (4, 3)

2º
nums = [3, 4, 5, 6, 7, 3, 4, 2]
target = 10
output: 2



(3, 4, 5)
(4, 5, 6)
(5, 6)
(5, 6, 7)
(6, 7)
(6, 7, 3)
(7, 3)
(7, 3, 4)
 */
public class ContinuousSubArray {

    private int[] mNums;
    private int mTarget;

    public ContinuousSubArray(int[] nums, int target) {
        mNums = nums;
        mTarget = target;
    }
    

    public int solveTheProblem() {
        int smallestSubArray = Integer.MAX_VALUE;

        for (int i = 0; i < mNums.length; i++) {
            int sum = 0;

            for (int j = i; j < mNums.length; j++) {
                sum += mNums[j];

                if (sum >= mTarget) {
                    int currentLength = j - i + 1;
                    smallestSubArray = Math.min(smallestSubArray, currentLength);
                    break;
                }
            }
        }

        return smallestSubArray == Integer.MAX_VALUE ? 0 : smallestSubArray;
    }

    public int solveInN() {
        int smallestLength = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        
        for(int i = 0; i < mNums.length; i++) { // Iterate all over the index
            sum += mNums[i];    // Add current index to the current sum
            while(sum >= mTarget) { // While the current sum >= target
                System.out.println("iteracao: a");
                smallestLength = Math.min(smallestLength, i - start + 1); // Calculates the min length
                sum -= mNums[start];    // Decrements from the sum;
                start++;    // increments the start pos;
            }
        }

        return smallestLength == Integer.MAX_VALUE ? 0 : smallestLength;
    }
}
