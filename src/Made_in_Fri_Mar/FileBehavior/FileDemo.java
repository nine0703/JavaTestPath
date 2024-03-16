package Made_in_Fri_Mar.FileBehavior;

import org.apache.commons.io.FileUtils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
//            文件操作： 从一个文本文件中读取内容，统计文件中每个单词的出现次数，并输出结果。
        String filePath = "src/Made_in_Fri_Mar/resources/file";
        String filePath1 = "src/Made_in_Fri_Mar/resources/file1";
        try (
            FileInputStream f = new FileInputStream(filePath);
            BufferedInputStream bis = new BufferedInputStream(f);){

            byte[] bytes = bis.readAllBytes();
            System.out.println(new String(bytes));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        File f = new File(filePath1);
        FileUtils.delete(f);
        System.out.println(f.toPath());


    }   //  method main end.

}   // class end.
