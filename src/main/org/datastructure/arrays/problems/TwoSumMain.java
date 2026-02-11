package main.org.datastructure.arrays.problems;

public class TwoSumMain {

    public static void main(String[] args) {
        testCase1Squared();
        testCase2Squared();
        testCase3Squared();
        testCase4Squared();
        testCase5Squared();
        testCase6Squared();
        testCase7Squared();
        testCase8Squared();
        testCase9Squared();
        testCase10Squared();
        System.out.println("\n\n\n\n");
        testCase1N();
        testCase2N();
        testCase3N();
        testCase4N();
        testCase5N();
        testCase6N();
        testCase7N();
        testCase8N();
        testCase9N();
        testCase10N();
    }

    private static void testCase1Squared() {
        TwoSum twoSum = new TwoSum(
            new int[] {1, 3, 2, 4, 5}, 
            4
        );

        System.out.println("Test Case 1 Squared | result: "+twoSum.solveNSquared()+" | expected: true");
    }

    private static void testCase2Squared() {
        TwoSum twoSum = new TwoSum(
            new int[] {2, 7, 11, 15},
            9
        );

        System.out.println("Test Case 2 Squared | result: " + twoSum.solveNSquared() + " | expected: true");
    }

    private static void testCase3Squared() {
        TwoSum twoSum = new TwoSum(
            new int[] {3, 1, 5},
            10
        );

        System.out.println("Test Case 3 Squared | result: " + twoSum.solveNSquared() + " | expected: false");
    }

    private static void testCase4Squared() {
        TwoSum twoSum = new TwoSum(
            new int[] {0, 4, 3, 0},
            0
        );

        System.out.println("Test Case 4 Squared | result: " + twoSum.solveNSquared() + " | expected: true");
    }

    private static void testCase5Squared() {
        TwoSum twoSum = new TwoSum(
            new int[] {-3, 4, 1, 2},
            -1
        );

        System.out.println("Test Case 5 Squared | result: " + twoSum.solveNSquared() + " | expected: true");
    }

    private static void testCase6Squared() {
        TwoSum twoSum = new TwoSum(
            new int[] {5, 5, 5, 5},
            10
        );

        System.out.println("Test Case 6 Squared | result: " + twoSum.solveNSquared() + " | expected: true");
    }

    private static void testCase7Squared() {
        TwoSum twoSum = new TwoSum(
            new int[] {1},
            2
        );

        System.out.println("Test Case 7 Squared | result: " + twoSum.solveNSquared() + " | expected: false");
    }

    private static void testCase8Squared() {
        TwoSum twoSum = new TwoSum(
            new int[] {1, 2},
            3
        );

        System.out.println("Test Case 8 Squared | result: " + twoSum.solveNSquared() + " | expected: true");
    }

    private static void testCase9Squared() {
        TwoSum twoSum = new TwoSum(
            new int[] {100, 200, 300, 400},
            500
        );

        System.out.println("Test Case 9 Squared | result: " + twoSum.solveNSquared() + " | expected: true");
    }

    private static void testCase10Squared() {
        TwoSum twoSum = new TwoSum(
            new int[] {1, 2, 3, 4, 5},
            100
        );

        System.out.println("Test Case 10 Squared | result: " + twoSum.solveNSquared() + " | expected: false");
    }

    private static void testCase1N() {
         TwoSum twoSum = new TwoSum(
            new int[] {1, 2, 3, 4, 5},
            100
        );

        System.out.println("Test Case 1 N | result: " + twoSum.solveN() + " | expected: false");
    }

    private static void testCase2N() {
        TwoSum twoSum = new TwoSum(
            new int[] {2, 7, 11, 15},
            9
        );

        System.out.println("Test Case 2 N | result: " + twoSum.solveN() + " | expected: true");
    }

    private static void testCase3N() {
        TwoSum twoSum = new TwoSum(
            new int[] {3, 1, 5},
            10
        );

        System.out.println("Test Case 3 N | result: " + twoSum.solveN() + " | expected: false");
    }

    private static void testCase4N() {
        TwoSum twoSum = new TwoSum(
            new int[] {0, 4, 3, 0},
            0
        );

        System.out.println("Test Case 4 N | result: " + twoSum.solveN() + " | expected: true");
    }

    private static void testCase5N() {
        TwoSum twoSum = new TwoSum(
            new int[] {-3, 4, 1, 2},
            -1
        );

        System.out.println("Test Case 5 N | result: " + twoSum.solveN() + " | expected: true");
    }

    private static void testCase6N() {
        TwoSum twoSum = new TwoSum(
            new int[] {5, 5, 5, 5},
            10
        );

        System.out.println("Test Case 6 N | result: " + twoSum.solveN() + " | expected: true");
    }

    private static void testCase7N() {
        TwoSum twoSum = new TwoSum(
            new int[] {1},
            2
        );

        System.out.println("Test Case 7 N | result: " + twoSum.solveN() + " | expected: false");
    }

    private static void testCase8N() {
        TwoSum twoSum = new TwoSum(
            new int[] {1, 2},
            3
        );

        System.out.println("Test Case 8 N | result: " + twoSum.solveN() + " | expected: true");
    }

    private static void testCase9N() {
        TwoSum twoSum = new TwoSum(
            new int[] {100, 200, 300, 400},
            500
        );

        System.out.println("Test Case 9 N | result: " + twoSum.solveN() + " | expected: true");
    }

    private static void testCase10N() {
        TwoSum twoSum = new TwoSum(
            new int[] {1, 3, 2, 4, 5},
            4
        );

        System.out.println("Test Case 10 N | result: " + twoSum.solveN() + " | expected: true");
    }
}
