package com.test.main.bubbleSort;

import java.util.Arrays;

public class BubTest {
    public static void main(String[] args) {
        // 冒泡排序
        int[] arr = {12,19,2,34,78,12,22,11,42,68,75};
        System.out.println("排序前："+ Arrays.toString(arr));
        for (int i = 0; i < arr.length -1 ; i++) {
            // 第一层for
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }   // 第二层for
        }   // 第一层for
        System.out.println("排序后："+ Arrays.toString(arr));


    }   //  method main end.

}   // class end.
