package main.org.datastructure.arrays.problems;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayKthElement {

    public int longestSubArrayKthElement(int[] nums, int k) {
        if(nums == null) {
            throw new InvalidParameterException();
        }

        Map<Integer, Integer> numberFrequencyMap = new HashMap<>();
        int longestSubArrayLength = 0;
        int left = 0;

        for(int right = 0; right < nums.length; right++) {
            numberFrequencyMap.put(nums[right], numberFrequencyMap.getOrDefault(nums[right], 0) + 1);
            while(numberFrequencyMap.size() > k) {
                numberFrequencyMap.put(nums[left], numberFrequencyMap.get(nums[left]) - 1);

                if (numberFrequencyMap.get(nums[left]) == 0) {
                    numberFrequencyMap.remove(nums[left]);   
                }

                left++;
            }

            longestSubArrayLength = Math.max(longestSubArrayLength, right - left + 1);
        }

        return longestSubArrayLength;
    }
}
