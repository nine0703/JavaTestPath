package front;

import java.util.Scanner;

public class catchtry {
    public static void main(String[] args) {
//        异常处理： 编写一个处理异常的程序，例如一个除法操作，允许用户输入两个数字，然后进行除法运算。在除数为零时，捕获异常并给出适当的提示。
        Scanner sc = new Scanner(System.in);
        System.out.println("start:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int data = method(a,b);
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }   //  method main end.

    public static int method(int a,int b) {
        if (b == 0){
            throw new RuntimeException("输入的b为零");
        }else {
            return a/b;
        }
    }   //  method end.

}   // class end.
