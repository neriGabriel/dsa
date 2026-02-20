package main.org.datastructure.arrays.problems;

public class SubArrayWithMostK0Main {
    public static void main(String[] args) {
        SubArrayWithMostK0 subArrayWithMostK0 = new SubArrayWithMostK0();

        System.out.println("Test 1:  "
            + subArrayWithMostK0.lengthOfSubarrayWithMostK0(new int[] {1, 1, 1, 1}, 0)
            + " | expected: 4");

        System.out.println("Test 2:  "
            + subArrayWithMostK0.lengthOfSubarrayWithMostK0(new int[] {1, 0, 1, 1, 0, 1}, 1)
            + " | expected: 4"); // [1,0,1,1]

        System.out.println("Test 3:  "
            + subArrayWithMostK0.lengthOfSubarrayWithMostK0(new int[] {1, 0, 0, 1, 1, 0, 1}, 2)
            + " | expected: 5"); // [0,0,1,1,0] not valid (3 zeros) → best is [1,0,0,1,1]

        System.out.println("Test 4:  "
            + subArrayWithMostK0.lengthOfSubarrayWithMostK0(new int[] {0, 0, 0, 0}, 2)
            + " | expected: 2");

        System.out.println("Test 5:  "
            + subArrayWithMostK0.lengthOfSubarrayWithMostK0(new int[] {1, 1, 1, 1}, 2)
            + " | expected: 4"); // no zeros at all

        System.out.println("Test 6:  "
            + subArrayWithMostK0.lengthOfSubarrayWithMostK0(new int[] {0, 1, 0, 1, 0, 1, 0}, 3)
            + " | expected: 6"); // [1,0,1,0,1,0]

        System.out.println("Test 7:  "
            + subArrayWithMostK0.lengthOfSubarrayWithMostK0(new int[] {1, 0, 1, 0, 1}, 0)
            + " | expected: 1");

        System.out.println("Test 8:  "
            + subArrayWithMostK0.lengthOfSubarrayWithMostK0(new int[] {1, 0, 0, 0, 1}, 1)
            + " | expected: 2"); // [1,0] or [0,1]

        System.out.println("Test 9:  "
            + subArrayWithMostK0.lengthOfSubarrayWithMostK0(new int[] {}, 5)
            + " | expected: 0");

        System.out.println("Test 10: "
            + subArrayWithMostK0.lengthOfSubarrayWithMostK0(new int[] {1, 0, 1, 1, 1, 0, 1, 1}, 2)
            + " | expected: 8"); // whole array (2 zeros)

    }
}
