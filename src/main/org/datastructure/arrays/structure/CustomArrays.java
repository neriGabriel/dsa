package main.org.datastructure.arrays.structure;

import java.lang.reflect.Array;

public class CustomArrays {

    public Object simpleArrayInstanciation(Class<?> type, int size) {
        Object output; 
        if (type == int.class) {
            output = new int[size];

        } else if (type == String.class) {
            output = new String[size];

        } else if (type == boolean.class) {
            output = new boolean[size];

        } else {
            throw new IllegalArgumentException();
        }

        return output;
    }

    public void print(Object array) {
        if (!array.getClass().isArray()) {
            throw new IllegalArgumentException();
        }

        int length = Array.getLength(array);
        for (int i = 0; i < length; i++) {
            System.out.println("index: " + i + " value: " + Array.get(array, i));
        }
    }
}
