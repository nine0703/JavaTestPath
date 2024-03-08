package com.test.main.Demo01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
    /*
        文件操作： 从一个文本文件中读取内容，统计文件中每个单词的出现次数，并输出结果。
        异常处理： 编写一个处理异常的程序，例如一个除法操作，允许用户输入两个数字，然后进行除法运算。在除数为零时，捕获异常并给出适当的提示。
  */
        //  集合操作： 创建一个列表（List），包含一些整数。然后，编写代码，找出列表中的最大值和最小值。
        List<Integer> intlist = new ArrayList<>(Arrays.asList(1,2,5,12,144,156,34,4637,34526));
        int max = intlist.get(0);
        Iterator<Integer> it = intlist.iterator();

        for (int i = 0; i < intlist.size(); i++) {
            var l = it.next();
            if (l > max){
                max = l;
            }
        }

        System.out.println(max);

//        // 字符串处理： 编写一个程序，接受用户输入的字符串，然后反转字符串中的字符顺序。
//        Scanner sc = new Scanner(System.in);
//        var input = sc.next();
//        if (input == null ){
//            System.out.println("null");
//        }else {
//            StringBuilder sb = new StringBuilder(input);
//            String s = sb.reverse().toString();
//            System.out.println(s);
//        }

        //  日期和时间： 编写一个程序，计算当前日期距离未来某个特定日期的天数，并输出结果。
        long time = System.currentTimeMillis();
        System.out.println(time);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = formatter.format(time);
        System.out.println(s);



    }   //  method main end.

}   // class end.
