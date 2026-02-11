package main.org.datastructure.arrays.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, check if it is possible two have two different
 * index that sum to the target value.
 * 
 * RULES
 * - The same index cannot be used twice;
 * - The output order does not matter;
 * - If there is at least one valid pair, return true, otherwise false.
 */

/**
* EXAMPLES
1º
nums = [1, 3, 2, 4, 5]
target = 4

output: true

2º
nums = [1, 3, 5, 6]
target = 10

output: false

3º
nums = [10, 5, 10, 22]
target = 27

output: true
*/
public class TwoSum {

    private int[] mNums;
    private  int mTarget;

    public TwoSum(int[] nums, int target) {
        mNums = nums;
        mTarget = target;
    }

    /**
     * Solves the problem using O(N^2)
     * 
     * @return a [boolean] indicating whether or not the problem the target sum can be found.
     */
    public boolean solveNSquared() {            
        for(int i = 0; i < mNums.length; i++) {
            for(int j = i+1; j < mNums.length; j++) {
                if(mNums[i] + mNums[j] == mTarget) return true;
            }
        }

        return false;
    }

    
    /**
     * Solves the problem using O(N)
     * 
     * @return a [boolean] indicating whether or not the problem the target sum can be found.
     */
    public boolean solveN() {
        Map<Integer, Integer> indexToValueMap = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < mNums.length; i++) {
            if(indexToValueMap.containsValue(mTarget - mNums[i])) {
                return true;
            }

            indexToValueMap.put(i, mNums[i]);
        }

        return false;
    }
}