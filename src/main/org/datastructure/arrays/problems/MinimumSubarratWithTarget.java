package main.org.datastructure.arrays.problems;

public class MinimumSubarratWithTarget {

    /**
     * Given an integer array of positive number and an interge target, return the length of the smallest
     * continuous subarray where the sum is higher or equals the target.
     * 
     * 
     * QUESTIONS:
     * 1. What is the expected behavior if the target is less or equals to 0?
     * 2. Can we use some auxiliar variable up to O(N)?
     * 
     * EXAMPLES:
     * 1º
     * nums = [1, 2, 3, 4, 5, 6, 7];
     * target = 10;
     * output = 2;
     * 
     * 2º
     * nums = [];
     * target = 1;
     * output = 0;
     * 
     * 3º
     * nums = [1, 1, 1, 1, 1];
     * target = 10;
     * output = 0;
     * 
     * 4º
     * nums = [1, 2, 3, 4]
     * target = 3;
     * output = 1;
     * 
     * 5º
     * nums = [1, 2, 3, 1, 4, 5];
     * target = 8;
     * output 3;
     */
    public int minimumSubarrayWithTarget(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int minSubarrayLength = Integer.MAX_VALUE;

        int left = 0;
        int sum = 0;
        for(int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while(sum >= target) {
                minSubarrayLength = Math.min(minSubarrayLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minSubarrayLength == Integer.MAX_VALUE ? 0: minSubarrayLength;
    }
}
