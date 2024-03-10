package front;

import java.util.Arrays;
import java.util.Scanner;

public class Test2Demo {
    /*
        需求：键盘录入一个字符串，实现下面的功能
            1.判断字符串的第一个字符和最后一个字符是否相等，如果不相等，则把字符串反转
            2.创建一个新的字符数组，用来保存字符串中每一个字符
            3.把字符数组中索引为奇数的元素修改为 @
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        //键盘录入字符串
        String s = sc.next();
        char first = s.charAt(0);
        char end = s.charAt(s.length() - 1);
        //判断第一个和最后一个是否相等
        if (!(first == end)) {
            String reverseStr = "";
            //实现字符串反转
            for (int i = s.length()-1; i  >= 0 ; i--) {
                reverseStr += s.charAt(i);
            }
            System.out.println("反转之后的字符串:" + reverseStr);
        }
        //定义数组用来保存字符
        char [] chs = new char[s.length()];
        //遍历字符串，把字符串的每一个字符保存到数组中
        for (int i = 0; i < s.length(); i++) {
            chs[i] = s.charAt(i);
        }
        //把索引为奇数的字符替换为@
        for (int i = 0; i < chs.length ; i++) {
            if (!(i % 2 == 1)){
                chs[i] = '@';
            }
        }
        System.out.println("修改之后的字符数组:" + Arrays.toString(chs));
    }
}
