package main.org.datastructure.arrays.problems;

public class MoveZeroToEndMain {
    public static void main(String[] args) {
        MoveZeroToEnd moveZeroToEnd = new MoveZeroToEnd();

        int[] nums = new int[] {0, 0, 1, 1, 1};
        moveZeroToEnd.moveZeroToEnd(nums);

        for(int num : nums) {
            System.out.println(num);
        }
    }
}
