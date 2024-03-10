package front;

import java.util.Arrays;
import java.util.Random;


public class Demo01test {
    public static void main(String[] args) {
/*  1).定义一个方法，接收一个数组，方法中实现，统计出数组中有多少个元素大于数的平均值，并且把结果返回
	2).在main方法中创建一个长度为6的数组，使用随机数生成范围在[10,100]之间的随机数，
	给数组的元素进行赋值，输出数组的元素。调用方法，接收方法的返回值，并且输出结果。*/
        double [] arr = new double[6];
        Random rc = new Random();
        for (int i = 0 ; i < 6; i++){
            int num = rc.nextInt(91) + 10;
            arr[i] = num;
        }
        String s = Arrays.toString(arr);
        System.out.println(s);
        int count = averageCount(arr);  // 计数
        System.out.println(count);
    }   //  method main end.

    public static  int averageCount(double[] arr) {
        double sum = arr[0];
        for (double j:arr){
            sum += j;
        }
        double average = sum / arr.length;  // 计算平均数
        int count = 0;
        for (double j : arr){
            if (j > average){
                count ++;
            }
        }
        return count;
    }   //  method end.


}   // class end.
