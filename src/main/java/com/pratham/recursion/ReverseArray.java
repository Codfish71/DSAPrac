package com.pratham.recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(reverseArray(arr, 0, arr.length - 1)));
    }

    public  static int[] reverseArray(int[] arr, int start, int end) {
        if(start > end) {
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverseArray(arr, start + 1, end - 1);
    }
}
