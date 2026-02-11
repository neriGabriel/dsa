package main.org.datastructure.arrays.structure;

import java.util.Arrays;

/*
Design a Dynamic Array (A.K.A resizable array) class, such as an ArrayList;

Your [DynamicArray] class should support the following operations:
1. DynamicArray(int cap)  -> will initialize an empty array with a size of cap, where cap > 0.
2. int get(int i)         -> will return the element at index i. Assume i will be always in the structure.
3. void set(int i, int n) -> will set the element ai index i to n;
4. void pushback(int n)   -> will push the element n to the end of the array;
5. int popback(int n)     -> will pop and return the element at the end of the array;
6. void resize()          -> will double the capacity of the array;
7. int getSize()          -> will return the number of elements in the array;
8. int getCapacity()      -> Will return the capacity of the array;

If we call pushback but the array is full, we should resize the array first;


Examples:

1º
Input:
["Array", 1, "getSize", "getCapacity"]

Output:
[null, 0, 1]

2º
Input:
["Array", 1, "pushback", 1, "getCapacity", "pushback", 2, "getCapacity"]

Output:
[null, null, 1, null, 2]
*/
public class DynamicArray {

    private int[] mArray;
    private int size;
    
    public DynamicArray(int capacity) {
        mArray = new int[capacity];
        size = 0;
    }

    public int get(int i) {
        if(mArray.length < i) return -1;

        return mArray[i];
    }

    public void set(int i, int n) {
        if (mArray.length < i || n < 0) return;

        mArray[i] = n;
    }

    public void pushback(int n) {
        if (size == mArray.length) {
            resize();
        }
        mArray[size] = n;
        size++;
    }

    public int popback() {
        int last = mArray[size - 1];
        size--;
        return last;
    }

    private void resize() {
        int[] newArray = new int[mArray.length*2];
        for(int i = 0; i < mArray.length; i++) {
            newArray[i] = mArray[i];
        }
        mArray = newArray;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return mArray.length;
    }

    public void dump() {
        System.out.println("\n\n\nDumping Dynamic Array\nSize: "+getSize()+"\nCapacity: "+getCapacity()+"\n\n\n");
    }
}
