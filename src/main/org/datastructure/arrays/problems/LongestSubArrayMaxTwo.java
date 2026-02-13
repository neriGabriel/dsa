package main.org.datastructure.arrays.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums, return the length of the longest contiguous subarray that contains at most two distinct integers.
 * A subarray is a contiguous non-empty sequence of elements within an array.
 * 
 * EXAMPLES
 * 
 * Input: nums = [1,2,1]
 * Output: 3
 * 
 * Input: nums = [0,1,2,2]
 * Output: 3
 */
public class LongestSubArrayMaxTwo {

    public int longestSubArrayMaxTwo(int[] nums) {
        if(nums == null) {
            return 0;
        }

        if(nums.length == 1) {
            return 1;
        }

        int longestSubArray = 0;
        Map<Integer, Integer> numberFrequencyMap = new HashMap<>();

        int left = 0;
        for(int right = 0; right < nums.length; right++) {
            numberFrequencyMap.put(nums[right], numberFrequencyMap.getOrDefault(nums[right], 0) + 1);

            while(numberFrequencyMap.size() > 2) {
                 numberFrequencyMap.put(nums[left], numberFrequencyMap.get(nums[left]) - 1);

                if (numberFrequencyMap.get(nums[left]) == 0) {
                    numberFrequencyMap.remove(nums[left]);
                }

                left++;
            }

            longestSubArray = Math.max(longestSubArray, right - left + 1);
        }

        return longestSubArray;
    }
}
