package work2024_3_30;

public class LoginController{
//能够使用继承Thread和实现Runnable方式创建多线程复制文件
//使用继承Thread方式创建多线程，利用多线程用字节流将d:\abc\xyz.png图片复制到E盘下e:\abc\xyz2.png
//使用实现Runnable方式创建多线程，利用多线程用字节流将d:\abc\xyz.png图片复制到E盘下e:\abc\xyz3.png
    public static void main(String[] args) {

        Copy thread = new Copy();
        thread.start(); // 启动线程

    }   // Method main end.

}   // Class end.
