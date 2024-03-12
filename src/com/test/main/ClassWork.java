package com.test.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ClassWork {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ab1","123ad", "bca","dadfadf","dddaaa","你好啊","我来啦","别跑啊"));
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String s = it.next();   // 只能调用一次，所以储存起来
            if (s.length() > 5){
                it.remove();
            }
            if (s.matches(".*\\d+.*")){
                it.remove();
            }
        }
        System.out.println(list);
    }   //  method main end.
}   // class end.
