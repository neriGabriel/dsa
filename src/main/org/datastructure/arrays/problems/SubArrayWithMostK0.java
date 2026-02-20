package main.org.datastructure.arrays.problems;

/**
 * Given an binary array nums and an integer K, return the length of the highest subarray that contains at max 
 * K zeros.
 * 
 * QUESTIONS
 * 1. What is the expected behavior in case nums is null or empty?
 * 2. What is the expected behavior in case K is less or equals to 0?
 * 4. Are we allowed to use auxiliar data structures up to O(N) space complexity?
 * 5. What are the constraint restrictions for nums and K?
 * 
 * EXAMPLES:
 * 
 * 1º
 * nums = [1, 0, 0, 1, 0, 1, 0]
 * k = 3
 * output: 6 ([1, 0, 0, 1, 0, 1])
 * 
 * 2º
 * nums = [0, 0, 0, 0, 0, 0, 0, 0]
 * k = 4
 * output = 4 ([0, 0, 0, 0])
 * 
 * 3º
 * nums = [0, 0, 0, 0, 0, 1]
 * k = 2
 * output = 3 ([0, 0, 1])
 * 
 * 4º
 * nums = [1, 0, 1, 0, 1]
 * k = 0
 * output = 1 ([1])
 * 
 * 5º
 * nums = [] / null
 * k = 10
 * output = 0
 * 
 * 6º
 * nums = [1, 1, 1, 1]
 * k = 0
 * output = 4 ([1, 1, 1, 1])
 */
public class SubArrayWithMostK0 {

    /**
     * Returns the length of the longest subarray with most K 0's references.
     * @param nums
     * @param k
     * @return length of the longest subarray with most K 0's references
     * 
     * Asymptomatic analysis:
     * Time: O(N);
     * Space: O(N);
     */
    public int lengthOfSubarrayWithMostK0(int nums[], int k) {
        if(nums == null || nums.length <= 0) return 0;

        if(k < 0) return 0; 

        int left = 0;
        int trackedZeros = 0;
        int maxLength = 0;

        for(int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) trackedZeros++;
            while(trackedZeros > k) {
                if(nums[left] == 0) {
                    trackedZeros--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
