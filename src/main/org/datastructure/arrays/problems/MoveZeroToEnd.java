package main.org.datastructure.arrays.problems;

import java.security.InvalidParameterException;

/**
 * Given an array of integers, modify the array in place to move all zeros to the end while maintaining the
 * relative order of non-zero elements.
 * 
 * 
 * Example:
 * Input: nums = [0, 1, 0, 3, 2]
 * Output: [1, 3, 2, 0, 0]
 */
public class MoveZeroToEnd {

    public void moveZeroToEnd(int[] nums) {
       if(nums == null) {
            throw new InvalidParameterException();
        }

        if(nums.length <= 1) return;
        
        int left = 0;
        for(int right = 0; right < nums.length; right++) {
            if(nums[right] != 0) {
                if(right == left) continue;

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }

    }
}
