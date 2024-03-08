import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class UpdateTimeMachine {
    public static void main(String[] args) {
        String s = "Update ";
        SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd ⏱ HH:mm <z> yyyy", Locale.ENGLISH);
        long time = System.currentTimeMillis();
        s += sdf.format(time);
        System.out.println(s);


        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        // 创建字符串选择对象
        StringSelection stringSelection = new StringSelection(s);

        // 将字符串选择对象设置到剪贴板中
        try {
            clipboard.setContents(stringSelection, null);
            System.out.println("字符串已成功复制到剪贴板！");
        } catch (Exception e) {
            System.err.println("无法复制字符串到剪贴板：" + e.getMessage());
        }

    }   //  method main end.

}   // class end.
