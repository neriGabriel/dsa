package main.org.datastructure.arrays.problems;

/**
 * You are given an array of numbers, each representing the height of a vertical line on a graph.
 * A container can be formed with any pair of these lines, along with the x-axis of the graph
 * Return the amount of water which the largest container can hold.
 * 
 * Example:
 * Input: heights = [2, 7, 8, 3, 7, 6]
 * Output: 24
 */
public class LargestContainer {

    /**
     * Get the amount of water which the largest container can hold.
     * 
     * @param nums
     * @return int represeting the amout of water which the largest container can hold.
     * 
     * Asymptomatic analysis:
     * Time: O(N);
     * Space: O(1);
     */
    public int largestContainer(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int maxContainerArea = 0;

        while(left <= right) {
            int currentArea = Math.min(nums[left], nums[right]) * (right - left);
            maxContainerArea = Math.max(maxContainerArea, currentArea);

            if (nums[left] < nums[right]) {
                left++;
            } else if (nums[right] < nums[left]) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return maxContainerArea;
    }
}
