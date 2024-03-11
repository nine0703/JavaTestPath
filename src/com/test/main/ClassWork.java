package com.test.main;

public class ClassWork {
    public static void main(String[] args) {
        String source = "《Head First Java》、《Effective Java》、《Python核心编程》、《Java并发实践》、《Thinking in Java》、《Python编程快速上手》";
        String[] split = source.split("、");
        for (String s : split) {
            if (s.contains("Java")){
                System.out.println(s);
            }
        }
    }   //  method main end.

}   // class end.
