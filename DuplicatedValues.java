package com.cursor;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatedValues {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 3, 1, 4, 2, 8, 3};

        for (int i = 0; i < array.length; i++) {
            for (int j = 1 + i; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = 0;
                }
            }
            System.out.print(array[i] + " ");
        }

    }
}



