package main.org.datastructure.arrays.problems;

public class TwoSumOrdered {

    /**
     * Check whether a target value can be found by the sum of two index.
     * 
     * @param nums
     * @param target
     * @return whether or not a target value can be found by the sum of two index
     * 
     * Asymptomatic analysis:
     * Time: O(N);
     * Space: O(1);
     */
    boolean orderedTwoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            if (nums[left] + nums[right] == target)
                return true;
            else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }

        }
        return false;
    }
}
