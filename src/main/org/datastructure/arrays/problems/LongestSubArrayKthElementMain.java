package main.org.datastructure.arrays.problems;

public class LongestSubArrayKthElementMain {
    public static void main(String[] args) {
        LongestSubArrayKthElement longestSubArrayKthElement = new LongestSubArrayKthElement();

        System.out.println(": "+longestSubArrayKthElement.longestSubArrayKthElement(new int[] {
            1,2,1,2,3
        }, 2));
        System.out.println(": "+longestSubArrayKthElement.longestSubArrayKthElement(new int[] {
            1,2,3,4,5
        }, 2));
    }
}
