package work2024_3_30;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 不测试了，没有那两个文件
public class Copy extends Thread {
    @Override
    public void run() {
        File source = new File("d:\\abc\\xyz.png");
        File target = new File("e:\\abc\\xyz3.png");
        try (   // try-resource无需关流
                FileInputStream fis = new FileInputStream(source);
                FileOutputStream fos = new FileOutputStream(target)) {

            byte[] data = new byte[1024 * 8];
            int len;
            while ((len = fis.read(data)) != - 1) {
                fos.write(data, 0, len);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}   // Class end.
