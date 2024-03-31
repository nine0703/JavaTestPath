# 注意！！！全部作业均由本人独立完成，只有readme文件的生成使用了ChatGPT
# 多线程文件复制

这个Java程序演示了如何使用继承Thread和实现Runnable两种方式创建多线程来复制文件。

## 功能

- 使用继承Thread方式创建多线程，复制`d:\abc\xyz.png`图片到`e:\abc\xyz2.png`。
- 使用实现Runnable方式创建多线程，复制`d:\abc\xyz.png`图片到`e:\abc\xyz3.png`。

## 使用方法

1. 确保源文件`d:\abc\xyz.png`存在，目标目录`e:\abc\`已创建。
2. 运行`LoginController.java`文件。
3. 程序会启动多线程进行文件复制操作。
4. 复制完成后，检查目标目录中的文件是否与源文件一致。

## 文件结构

- `LoginController.java`: 包含主程序，演示如何使用继承Thread和实现Runnable方式创建多线程。
- `Copy.java`: 继承Thread的多线程类，用于文件复制操作。

## 注意事项

- 确保源文件和目标目录的路径正确，并且源文件存在。
- 使用多线程文件复制可能会提高复制速度，但请注意文件锁和线程安全问题。

**此Readme文件由ChatGPT一键生成。版权所有 © 2024 [Java餐饮]**

**Update Sat Mar 30 22:09:20 CST 2024**
