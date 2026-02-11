package main.org.datastructure.arrays.problems;

public class MergeTwoOrderedArraysMain {
    public static void main(String[] args) {
        MergeTwoOrderedArrays mergeTwoOrderedArrays = new MergeTwoOrderedArrays();
        int[] mergedArray = mergeTwoOrderedArrays.merge(
            new int[] {1, 2, 3}, new int[] {4, 5});
        for(int num : mergedArray) {
            System.out.println("num: "+num);
        }
    }
}
