package BlackMotherSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Scanner;

import static BlackMotherSystem.Student_Teacher_Utils.*;

public class BlackMotherSystem {
    static Logger logger =  LoggerFactory.getLogger("BlackMotherSystem");
    public static void main(String[] args) {
        ArrayList<Student> list = deSerialize();  // 调用反序列化方法,接住list
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===== 黑妈妈学生管理系统 =====");
            System.out.println("操作编号：");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出。");
            System.out.println("输入您选择的选项：");
            int input = sc.nextInt();
            switch(input) {
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    delStudent(list);
                    break;
                case 3:
                    changeStudent(list);
                    break;
                case 4:
                    showStudent(list);
                    break;
                case 5:
                    // 序列化列表中的对象
                    System.out.println("正在保存学生信息，请稍等...");
                    serialize(list);
                    logger.info("exit 0");
                    System.out.println("bye~~ 再见");
                    return;
                default:
                    logger.warn("INPUT "+input);
                    System.out.println("参数错误。");
                    break;
            }
        }


    }   //  method main end.

}   // class end.
