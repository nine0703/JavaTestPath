package front.FileBehavior;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FilesMake {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/front/FileBehavior/resources/file");
        byte[] bytes = fis.readAllBytes();
        String str = new String(bytes, StandardCharsets.UTF_8); // 指定字符集，通常是UTF-8
        System.out.println(str);

    } // method main end.

}   // class end.
