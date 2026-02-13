package main.org.datastructure.arrays.problems;

public class MinimumSubarratWithTargetMain {
    public static void main(String[] args) {
        MinimumSubarratWithTarget minimumSubarratWithTarget = new MinimumSubarratWithTarget();
        System.out.println("Test 1: " + minimumSubarratWithTarget.minimumSubarrayWithTarget(new int[] {2,3,1,2,4,3}, 7)); // expected 2
        System.out.println("Test 2: " + minimumSubarratWithTarget.minimumSubarrayWithTarget(new int[] {1,2,3,4,5}, 11)); // expected 3
        System.out.println("Test 3: " + minimumSubarratWithTarget.minimumSubarrayWithTarget(new int[] {1,1,1,1,1,1,1,1}, 5)); // expected 5
        System.out.println("Test 4: " + minimumSubarratWithTarget.minimumSubarrayWithTarget(new int[] {1,4,4}, 4)); // expected 1
        System.out.println("Test 5: " + minimumSubarratWithTarget.minimumSubarrayWithTarget(new int[] {1,2,3,4}, 15)); // expected 0
        System.out.println("Test 6: " + minimumSubarratWithTarget.minimumSubarrayWithTarget(new int[] {}, 5)); // expected 0
        System.out.println("Test 7: " + minimumSubarratWithTarget.minimumSubarrayWithTarget(new int[] {5}, 3)); // expected 1
        System.out.println("Test 8: " + minimumSubarratWithTarget.minimumSubarrayWithTarget(new int[] {1,2,3,4,5}, 5)); // expected 1
        System.out.println("Test 9: " + minimumSubarratWithTarget.minimumSubarrayWithTarget(new int[] {1,2,3,4,5}, 9)); // expected 2
        System.out.println("Test 10: " + minimumSubarratWithTarget.minimumSubarrayWithTarget(new int[] {1,2,1,1,1,10}, 10)); // expected 1

    }
}
