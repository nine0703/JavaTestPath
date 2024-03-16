package BlackMotherSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_Teacher_Utils {
    static Logger logger =  LoggerFactory.getLogger("Student_Teacher_Utils");
    private Student_Teacher_Utils() {
    }
    public static void addStudent(ArrayList<Student> list) {
        logger.info("addStudent() start");
        Scanner sc = new Scanner(System.in);
        System.out.println("开始添加学生：");
        System.out.println("请输入学生id：");
        int id = sc.nextInt();
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        try {
            list.add(new Student(id, name, age));
            System.out.println("创建成功！");
            logger.info("addStudent() COMPLETE");
        } catch (Exception e) {
            logger.error("addStudent() ERROR");
            logger.error(e.getMessage());
        }
    }   //  添加学生方法 end.

    public static void delStudent(ArrayList<Student> list) {
        logger.info("delStudent() start");
        System.out.println("选择功能：");
        System.out.println("1.根据id删除学生");
        System.out.println("2.根据名字删除学生");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch(input){
            case 1:
                System.out.println("请输入id：");
                int id = sc.nextInt();

                for (Student student : list){
                    if (student.getId() == id){
                        list.remove(student);
                        System.out.println("删除成功！");
                        logger.info("delStudent() COMPLETE(ID)");
                        return;
                    }
                }
                System.out.println("找不到对象，检出id");
                logger.info("delStudent() ERROR(ID)");
                break;
            case 2:
                System.out.println("请输入名字：");
                String name = sc.next();

                for (Student student : list){
                    if (student.getName().equals(name)){
                        list.remove(student);
                        System.out.println("删除成功！");
                        logger.info("delStudent() COMPLETE(NAME)");
                        return;
                    }
                }
                System.out.println("找不到对象，检查名字");
                logger.info("delStudent() ERROR(NAME)");
                break;
        }
    }   //  删除学生方法 end.

    public static void changeStudent(ArrayList<Student> list) {
        logger.info("changeStudent() start");
        System.out.println("选择你想操作的业务：");
        System.out.println("1.根据id修改");
        System.out.println("2.根据名字修改");
        System.out.println("输入您选择的选项：");
        Student s = null;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch(input){
            case 1:
                System.out.println("请输入id：");
                int id = sc.nextInt();

                for (Student j : list){
                    if (j.getId() == id){
                        s = j;
                        break;
                    }
                }
                System.out.println("找不到对象，检查id");
                break;
            case 2:
                System.out.println("请输入名字：");
                String name = sc.next();
                for (Student j : list){
                    if (j.getName().equals(name)){
                        s = j;
                        break;
                    }
                }
                break;
            default:
                System.out.println("找不到对象，检查名字");
            }
            if (s != null) {
                boolean flag = true;    // 信号位
                while (flag){
                    System.out.println("请输入您想修改的数据：");
                    System.out.println("1.id");
                    System.out.println("2.name");
                    System.out.println("3.age");
                    System.out.println("4.查看当前信息");
                    System.out.println("5.退出");
                    input = sc.nextInt();
                    switch (input){
                        case 1:
                            System.out.println("请输入id：");
                            int id = sc.nextInt();
                            logger.info("changeStudent() changeId");
                            s.setId(id);
                            break;
                        case 2:
                            System.out.println("请输入name：");
                            String name = sc.next();
                            logger.info("changeStudent() changeName");
                            s.setName(name);
                            break;
                        case 3:
                            System.out.println("请输入age：");
                            int age = sc.nextInt();
                            logger.info("changeStudent() changeAge");
                            s.setAge(age);
                            break;
                        case 4:
                            System.out.println(s);
                            break;
                        case 5:
                            System.out.println("修改成功，再见");
                            flag = false;
                            logger.info("changeStudent() COMPLETE");
                            break;
                        default:
                            System.out.println("输入不合法");
                        }

                }
            }
        logger.info("changeStudent() COMPLETE");
    }   //  method end.
    

    public static void showStudent(ArrayList<Student> list) {
        System.out.println("ID\t\t姓名\t\t年龄");
        System.out.println("------------------");
        list.forEach(student -> System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge()));
        System.out.println("------------------");
        logger.info("showStudent() COMPLETE");
    }   //  method end.

    public static void serialize(ArrayList<Student> list) {
        logger.info("serialize() start");   // 序列化 保存对象到文件
        File f = new File("src/BlackMotherSystem/res/userinfo");
        if (!f.exists()){
            logger.warn("userinfo is absent or null , makefile.");  //  log
            try {
                boolean isFile = f.createNewFile();
                if (isFile){
                    logger.info("userinfo make success.");
                }else {
                    logger.error("userinfo make failed.");
                }
            } catch (IOException e) {
                logger.error("userinfo make failed.");
            }
        }
        if (f.exists()) {
            try (
                    FileOutputStream fos = new FileOutputStream(f);
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(list);  // 写出对象，传入列表
            } catch (FileNotFoundException e) {
                logger.error("serialize() ERROR(FileNotFoundException)");
                logger.error(e.getMessage());
            } catch (IOException e) {
                logger.error("serialize() ERROR(IOException)");
                logger.error(e.getMessage());
            }
        }
        logger.info("serialize() COMPLETE");
    }   //  method end.

    public static ArrayList<Student> deSerialize() {
        logger.info("deSerialize() start");
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("正在进行反序列化...");
        File f = new File("src/BlackMotherSystem/res/userinfo");
        if (!f.exists() || f.length() == 0 || f.length() == -1) {   // 非空，长度等于0 长度等于-1 立刻返回list
            logger.warn("userinfo is absent or null , return list.");  //  log
            return list;
        }   //  判断文件是否不存在或为空逻辑
        try (
            FileInputStream fos = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fos)) {
            ArrayList<Student> ca = (ArrayList<Student>)ois.readObject();
            list.addAll(ca);
        } catch (Exception e) {
            logger.error("deSerialize() ERROR(Unknown)");
            logger.error(e.getMessage());
        }
        logger.info("deSerialize() COMPLETE");
        return list;

    }   //  method end.


}   // class end.
