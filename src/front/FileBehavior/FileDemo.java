package front.FileBehavior;

import java.io.File;
import java.util.Date;

public class FileDemo {
    public static void main(String[] args) {
//            文件操作： 从一个文本文件中读取内容，统计文件中每个单词的出现次数，并输出结果。
        File f = new File("resources/","a.txt");
        System.out.println(f);
        long time = System.currentTimeMillis();
        System.out.println("Update "+new Date(time));


    }   //  method main end.

}   // class end.
