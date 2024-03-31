package MRTestColle;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

class MRTest {
    public static void main(String[] args) {
//使用字节输入流和输出流，读取文件的内容输出到控制台
//
//sg.txt文件内容如下：
        File file = new File("src/Resource/sg.txt");
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[1024 * 8];
            int length;
            while ((length = fis.read(buffer)) != -1){
                System.out.println(new String(buffer,0,length, StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }   // Method main end.
}   // class end.