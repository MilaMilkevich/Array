package com.cursor;

public class SumValues {
    public static void main(String[] args) {
        int[] array = {2, -15, 48, -17, 43};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            } else {
                array[i] = 0;
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
