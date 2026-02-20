package main.org.datastructure.arrays.problems;

public class PrefixSumMain {
    public static void main(String[] args) {
        PrefixSum prefixSum = new PrefixSum();

        for(int num : prefixSum.calculatePrefixSum(new int[] {1, 2, 3, 4})) {
            System.out.println(num);
        }
    }
}
