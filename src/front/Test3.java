package front;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*    1.创建一个键盘录入对象 (1分)
    2.键盘录入一个字符串(1分)
    3.定义第一个字符串，用于接收反转之后的结果 (1分)
    4.倒过来遍历原字符串，获取每一个字符，拼接到第一个字符串中 (3分)
    5.再定义第二个新的字符串 (1分)
    5.遍历第一个字符串，获取里面的每一个字符 (1分)
    6.判断当前字符是否为小写字母，如果是，则转化为大写字母 (3分)
    7.判断当前字符是否为大写字母，如果是，则转化为小写字母 (3分)
    8.把遍历的字符添加到第二个字符串中(1分)
    9.输出第二个字符串 */
        Scanner sc = new Scanner(System.in);
//        var input = sc.nextLine();
        var input = "IloveJava666";
        String secData = "";    // final data.
        for (int i = input.length() -1; i >= 0; i--) {
            secData += input.charAt(i);
        }
        System.out.println(secData);
        var finData = "";
        for (int i = 0; i < secData.length() ; i++) {
            char ch = secData.charAt(i);
            if (Character.isDigit(ch)){
                finData += ch;
            }else if(Character.isUpperCase(ch)){
                finData += Character.toLowerCase(ch);
            }else if(Character.isLowerCase(ch)){
                finData += Character.toUpperCase(ch);
            }
        }
        System.out.println(finData);
    }   //  method main end.

}   // class end.
