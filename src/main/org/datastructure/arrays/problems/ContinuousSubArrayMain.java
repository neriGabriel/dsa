package main.org.datastructure.arrays.problems;

public class ContinuousSubArrayMain {

    public static void main(String[] args) {
        /*testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
        testCase6();
        testCase7();
        testCase8();
        testCase9();
        testCase10();*/
        testCase11();
    }

    private static void testCase1() {
        ContinuousSubArray continuousSubArray = new ContinuousSubArray(
            new int[] {2, 3, 1, 2, 4, 3},
            7
        );
        System.out.println("Test Case 1 | result: " + continuousSubArray.solveInN() + " | expected: 2");
    }

    private static void testCase2() {
        ContinuousSubArray continuousSubArray = new ContinuousSubArray(
            new int[] {1, 1, 1, 1},
            10
        );
        System.out.println("Test Case 2 | result: " + continuousSubArray.solveInN() + " | expected: 0");
    }

    private static void testCase3() {
        ContinuousSubArray continuousSubArray = new ContinuousSubArray(
            new int[] {5, 6, 7},
            6
        );
        System.out.println("Test Case 3 | result: " + continuousSubArray.solveInN() + " | expected: 1");
    }

    private static void testCase4() {
        ContinuousSubArray continuousSubArray = new ContinuousSubArray(
            new int[] {3, 4, 5, 6, 7, 3, 4, 2},
            10
        );
        System.out.println("Test Case 4 | result: " + continuousSubArray.solveInN() + " | expected: 2");
    }

    private static void testCase5() {
        ContinuousSubArray continuousSubArray = new ContinuousSubArray(
            new int[] {1, 2, 3, 4, 5},
            11
        );
        System.out.println("Test Case 5 | result: " + continuousSubArray.solveInN() + " | expected: 3");
    }

    private static void testCase6() {
        ContinuousSubArray continuousSubArray = new ContinuousSubArray(
            new int[] {10, 2, 3},
            10
        );
        System.out.println("Test Case 6 | result: " + continuousSubArray.solveInN() + " | expected: 1");
    }

    private static void testCase7() {
        ContinuousSubArray continuousSubArray = new ContinuousSubArray(
            new int[] {1, 4, 4},
            8
        );
        System.out.println("Test Case 7 | result: " + continuousSubArray.solveInN() + " | expected: 2");
    }

    private static void testCase8() {
        ContinuousSubArray continuousSubArray = new ContinuousSubArray(
            new int[] {1, 2, 3, 4},
            6
        );
        System.out.println("Test Case 8 | result: " + continuousSubArray.solveInN() + " | expected: 2");
    }

    private static void testCase9() {
        ContinuousSubArray continuousSubArray = new ContinuousSubArray(
            new int[] {2, 3, 5, 1, 1, 1, 7},
            7
        );
        System.out.println("Test Case 9 | result: " + continuousSubArray.solveInN() + " | expected: 1");
    }

    private static void testCase10() {
        ContinuousSubArray continuousSubArray = new ContinuousSubArray(
            new int[] {1, 2, 3, 4, 5},
            100
        );
        System.out.println("Test Case 10 | result: " + continuousSubArray.solveInN() + " | expected: 0");
    }

    private static void testCase11() {
        ContinuousSubArray continuousSubArray = new ContinuousSubArray(
            new int[] {1, 2, 3, 4, 5},
            5
        );
        System.out.println("Test Case 11 | result: " + continuousSubArray.solveInN() + " | expected: 1");
    }
}
