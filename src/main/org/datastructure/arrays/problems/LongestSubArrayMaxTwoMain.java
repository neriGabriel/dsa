package main.org.datastructure.arrays.problems;

public class LongestSubArrayMaxTwoMain {
    public static void main(String[] args) {
        LongestSubArrayMaxTwo longestSubArrayMaxTwo = new LongestSubArrayMaxTwo();

        System.out.println(": "+longestSubArrayMaxTwo.longestSubArrayMaxTwo(new int[] {
            1, 2, 3, 4, 4, 4, 4
        }));
        
        System.out.println(": "+longestSubArrayMaxTwo.longestSubArrayMaxTwo(new int[] {
            4, 4, 4, 4, 4, 4, 4
        }));
        
        System.out.println(": "+longestSubArrayMaxTwo.longestSubArrayMaxTwo(new int[] {
            1
        }));

        System.out.println(": "+longestSubArrayMaxTwo.longestSubArrayMaxTwo(new int[] {
            1, 2, 3, 4, 4, 5, 4
        }));
    }
}
