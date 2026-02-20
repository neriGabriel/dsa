package main.org.datastructure.arrays.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 * 
 * * */

/**
 * EXAMPLES
 * 
 * 
 * 1º
 * nums = [1, 2, 3, 4]
 * output = false;
 * 
 * 2º
 * nums = [1, 1, 2, 4]
 * output = true;
 * 
 * 3º
 * nums = [1, 4, 5, 6, -1, 10, -1]
 * output = true;
 * 
 * 4º
 * nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60]
 * output = false;
 * 
 * 5º 
 * nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60, 1]
 * output = true;
 */

/**
 * Questions
 * 
 * 1. What is the minimum and maximum size of the input array?
 * 2. Does the input array supports negative values?
 * 3. The input array is whether out of order or ordered?
 */
public class ContainsDuplicate {

    /**
     * Check whether or not the input parameter has duplicated values.
     * @param nums
     * @return [boolean] indicating if there are duplicated values.
     * 
     * Asymptomatic analysis:
     * Time: O(N);
     * Space: O(N);
     */
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return false;
        }
        Set<Integer> inputOcurrenceTracking = new HashSet<>();

        for(int num : nums) {
            if (inputOcurrenceTracking.contains(num)) {
                return true;
            }
            inputOcurrenceTracking.add(num);
        }

        return false;
    }
}
