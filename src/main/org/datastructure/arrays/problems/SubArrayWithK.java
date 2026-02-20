package main.org.datastructure.arrays.problems;

import java.util.HashMap;
import java.util.Map;

/***
 * Given an integer array, nums and an integer k, return the number of subarrays that contains exactly k distinct
 * elements.
 * 
 * QUESTIONS:
 * 
 * 1. Can the input array be empty or null?
 * 2. What is the expected behavior if k is less or equals to 0?
 * 3. Are we allowed to use auxiliar data structures up to O(N) space complexity?
 * 
 * EXAMPLES:
 * 
 * 1º
 * nums = [1, 2, 3, 4, 5]
 * k = 3
 * output = 3 ([1, 2, 3], [2, 3, 4], [3, 4, 5])
 * 
 * 2º
 * nums = [1, 2, 3, 4, 5]
 * k = 0
 * output = 0
 * 
 * 3º
 * nums = [1, 2, 3, 4, 5]
 * k = 2
 * output = 4 ([1, 2], [2, 3], [3, 4], [4, 5])
 * 
 * 4º
 * nums = [-1, 1, 1, 1, -1]
 * k = 1
 * output = 8 ([-1], [1], [1], [1], [1, 1], [1,1], [1,1,1], [-1])
 * 
 * 5º
 * nums = [1, 2, 3, 4, 5, 6]
 * k = 10
 * output = 0
 */
public class SubArrayWithK {
    public int subarraysWithKDistinct(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return 0;
        }

        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int left = 0;
        int count = 0;
        int distinct = 0;

        for (int right = 0; right < nums.length; right++) {
            int current = nums[right];
            frequency.put(current, frequency.getOrDefault(current, 0) + 1);

            if (frequency.get(current) == 1) {
                distinct++;
            }

            while (distinct > k) {
                int leftValue = nums[left];
                frequency.put(leftValue, frequency.get(leftValue) - 1);

                if (frequency.get(leftValue) == 0) {
                    distinct--;
                }

                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}
