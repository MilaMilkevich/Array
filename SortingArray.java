package com.cursor;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{2, 3, 1, 7, 11};

        Arrays.sort(array, Collections.reverseOrder());

        for (Integer element : array) {
            System.out.println(element);
        }
    }
}
