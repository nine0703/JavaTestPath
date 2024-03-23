package ClassWork;

import java.io.IOException;

public class ClassWork {
    public static void main(String[] args) throws IOException {
     /*请计算3的5次幂
  请计算3.2向上取整的结果
  请计算3.8向下取整的结果
  请计算5.6四舍五入取整的结果*/
        double pow = Math.pow(3, 5);
        System.out.println(pow);
        double ceil = Math.ceil(3.2);
        System.out.println(ceil);
        double floor = Math.floor(3.8);
        System.out.println(floor);
        long round = Math.round(5.49);
        System.out.println(round);

    }   //  method main end.
}   // class end.