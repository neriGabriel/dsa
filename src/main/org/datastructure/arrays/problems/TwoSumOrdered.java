package main.org.datastructure.arrays.problems;

public class TwoSumOrdered {
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
