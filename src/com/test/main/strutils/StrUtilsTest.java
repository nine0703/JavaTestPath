package com.test.main.strutils;


import java.util.Arrays;

class StrUtilsTest {
    public static void main(String[] args) {
        String a = "as",b = "ck";
        String re = StrUtils.compareLength(a,b);
        System.out.println(re);

        String [] list = StrUtils.toCollection("asiu123sajd");
        String s = Arrays.toString(list);
        System.out.println(s);

    }   //  method main end.


}