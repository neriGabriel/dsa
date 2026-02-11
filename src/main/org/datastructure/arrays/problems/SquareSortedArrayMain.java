package main.org.datastructure.arrays.problems;

public class SquareSortedArrayMain {
    public static void main(String[] args) {
        SquareSortedArray squareSortedArray = new SquareSortedArray();

        int[] test = squareSortedArray.squareSortedArray(new int[] {-4, -3, 2, 3, 10});

        for(int tes : test) {
            System.out.println(": "+tes);
        }
    }
}
