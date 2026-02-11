package main.org.datastructure.arrays.problems;

import java.security.InvalidParameterException;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted
 * in non-decreasing order. 
 * 
 * 
 * Questions:
 * 1. Does all the values from the input fits in memory?
 * 2. What is the minimum and maximum size of the input?
 * 3. Does the input accepts negative numbers?
 * 
 * Examples:
 * 
 * 1º
 * nums = [1, 2, 3]
 * output = [1, 4, 9]
 * 
 * 2º
 * nums = [-1, 2, 3, 10]
 * output = [1, 4, 9, 100]
 * 
 * 3º
 * nums = [-4, -3, 2, 3, 10]
 * output = [4, 9, 9, 16, 100]
 * 
 * 4º
 * nums = []
 * output = []
 * 
 * 5º
 * nums = [1]
 * output = [1]
 * 
 * 6º
 * nums = [-1, 0, 1]
 * output = [0, 1, 1]
 * 
 * 7º
 * nums = [-2, -2, -2, 2]
 * output = [4, 4, 4, 4]
 * 
 */
public class SquareSortedArray {

    /**
     * Square and order an input array
     * 
     * @param nums
     * @return int[] represeting the squared values ordered in non-decreasing.
     * 
     * Asymptomatic analysis:
     * Time: O(N);
     * Space: O(N);
     */
    public int[] squareSortedArray(int[] nums) {
        if(nums == null) throw new InvalidParameterException();
        int[] output = new int[nums.length];
        
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                output[i] = nums[left] * nums[left];
                left++;
            } else {
                output[i] = nums[right] * nums[right];
                right--;
            }
        }

        return output;
    }
}
