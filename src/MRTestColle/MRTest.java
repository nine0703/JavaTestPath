package MRTestColle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MRTest {
    public static void main(String[] args) {
        String data = "来黑马程序员学习Java，" +
                "电话：13888888888，1377777777" +
                "或者联系邮箱：boniu@itcast.com.cn" +
                "座机电话：01036517895，010-98951256" +
                "邮箱：bozai@itcast.cn，" +
                "邮箱2：zhangsan0009@163.com，" +
                "热线电话：400-618-9090，400-618-4000，" +
                "4006184000，4006189090";
        Pattern p = Pattern.compile("1[3-9]\\d{9}|0\\d{2}-?[1-9]\\d{7}|400-?\\d{3}-?\\d{4}");
        Matcher m = p.matcher(data);
        while (m.find()){
            String phone = m.group();
            System.out.println(phone);
        }
    }   //  method main end.
}   // class end.