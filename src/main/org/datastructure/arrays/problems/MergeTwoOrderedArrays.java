package main.org.datastructure.arrays.problems;

import java.security.InvalidParameterException;

public class MergeTwoOrderedArrays {

    public int[] merge(int[] first, int[] second) { //Complexity: time O(N + M), space O(N + M)
        if (first == null && second == null) {
            throw new InvalidParameterException();
        }
        int[] output = new int[first.length + second.length];

        int firstPointer = 0;
        int secondPointer = 0;
        int counter = 0;

        while(firstPointer < first.length && secondPointer < second.length) {
            if(first[firstPointer] < second[secondPointer]) {
                output[counter] = first[firstPointer];
                firstPointer++;
            } else {
                output[counter] = second[secondPointer];
                secondPointer++;
            }
            counter++;
        }

        while(firstPointer < first.length) {
            output[counter] = first[firstPointer];
            firstPointer++;
            counter++;
        }

        while(secondPointer < second.length) {
            output[counter] = second[secondPointer];
            secondPointer++;
            counter++;
        }
        return output;
    }
}
