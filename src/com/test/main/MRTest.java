package com.test.main;

import java.util.*;

public class MRTest {
    public static void main(String[] args) {
        Integer [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.forEach(System.out::print);
        method(list,1,2,3,4);   // add method
        list.forEach(System.out::print);


    }   //  method main end.

    public static void method(List<Integer> list,int... a) {
        Integer [] arr = new Integer[a.length];
        for(int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        System.out.println( );
        Collections.addAll(list,arr);
    }   //  method end.


}   // class end.
