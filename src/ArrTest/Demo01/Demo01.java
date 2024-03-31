package front.Demo01;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("输入yyyy-MM-dd HH:mm:ss：");
//        String dateTimeStr = sc.next();
        String dateTimeStr = "2024-11-11  12:12:12";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 输入字符串和格式化器对象传入
        // 船新的时间格式化工具对象
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, dtf);
        // 将LocalDateTime对象转换为ZonedDateTime对象，这里使用了系统默认时区
        ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.systemDefault());

        // 将ZonedDateTime对象转换为时间戳
        long timestamp = zonedDateTime.toInstant().toEpochMilli();
        long time = System.currentTimeMillis(); //  获取当前时间毫秒值
        // 初始化SimpleDateFormat对象
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int status = 0;
        String s = null;
        if (timestamp > time){
            s = String.valueOf(timestamp - time);
            status += 1;
        }else if (time > timestamp){
            s = String.valueOf(time - timestamp);
            status -= 1;
        }
        String timestampStr = formatter.format(s);  // 重写时间格式
        if (status > 0 ){
            System.out.println("距离未来还有："+timestampStr);
        }else if (status < 0){
            System.out.println("距离过去："+timestampStr);
        }


    }   //  method main end.

}   // class end.
