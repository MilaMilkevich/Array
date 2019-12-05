package com.cursor;

public class MeanArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 5};

        double sum = 0;

        for (int element : arr) {
            sum += element;
        }

        double result = sum / arr.length;
        System.out.println(result);
    }
}
