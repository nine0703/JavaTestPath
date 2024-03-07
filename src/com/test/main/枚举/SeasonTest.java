package com.test.main.枚举;

import java.util.Scanner;

public class SeasonTest {
    public static void main(String[] args) {
        System.out.println("=== 枚举类测试 ===");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        print(Season.valueOf(input));

    }

    public static void print(Season s){
        switch (s){
            case Spring -> System.out.println("Spring参数");
            case autumn -> System.out.println("1");
        }
    }
}
