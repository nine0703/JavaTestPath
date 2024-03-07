package com.test.main.strutils;

public class StrUtils {
    public static String compareLength(String a,String b) {
        if (a.length()==b.length()){
            return a;
        }
        return a.length() > b.length() ? a : b;
    }   //  method end.

    public static String [] toCollection(String a) {
        String [] s = new String[a.length()];
        for (int i = 0; i < a.length() ;i++){
            char ch = a.charAt(i);
            s[i] = String.valueOf(ch);
        }
        return s;
    }   //  method end.

}   // class end.
