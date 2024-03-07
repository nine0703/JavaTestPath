package com.test.main;

public class ClassWork {
    public static void main(String[] args) {
        int [] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum = 0;
        for (int j : arr){
            sum +=  j;
        }
        System.out.println(sum/arr.length);

    }   //  method main end.
}   // class end.
