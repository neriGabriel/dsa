package main.org.datastructure;

//import main.org.datastructure.arrays.structure.CustomArrays;
import main.org.datastructure.arrays.structure.DynamicArray;

public class Main {

    public static void main(String[] args) {
        //createAndPrintSimpleArray();
        //createAndPrintComplexArray();
        testCase1();
        testCase2();
    }

    private static void testCase1() {
        System.out.println("*********** TEST CASE 1 ***********");
        DynamicArray mDynamicArray = new DynamicArray(1);
        mDynamicArray.dump();
    }

    private static void testCase2() {
        System.out.println("*********** TEST CASE 2 ***********");
        DynamicArray mDynamicArray = new DynamicArray(1);
        mDynamicArray.pushback(1);
        System.out.println("Capacity: "+mDynamicArray.getCapacity());
        mDynamicArray.pushback(2);
        System.out.println("Capacity: "+mDynamicArray.getCapacity());

    }

    /*
    private static void createAndPrintSimpleArray() {                                    // Space: O(N) | Time: O(N)
        CustomArrays mArrays = new CustomArrays();                                       // O(1);
        int[] array = (int[]) mArrays.simpleArrayInstanciation(int.class, 3); // O(N);

        array[0] = 1;                                                                    // O(1);
        mArrays.print(array);                                                            // O(N);
    }

    private static void createAndPrintComplexArray() {                                          // Space: O(N) | Time: O(N)         
        CustomArrays mArrays = new CustomArrays();                                              // O(1);
        int[] array = (int[]) mArrays.simpleArrayInstanciation(int.class, 10);       // O(N);

        for(int i = 0; i < array.length; i++) {                                                 // O(N)     
            array[i] = i * i;                                                                   // O(1);   
        }

        mArrays.print(array);                                                                   // O(N);
    }
        */
}
