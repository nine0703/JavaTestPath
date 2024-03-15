package front.Testing;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("李莉","数学",80));
        list.add(new Student("刘刚","语文",75));
        list.add(new Student("何天","英语",95));
        list.add(new Student("赵勇","语文",85));
        list.add(new Student("孙红","语文",55));
        // 集合数据添加 打印
        for (Student j : list ){
            System.out.println(j);
        }

        ArrayList<Student> newList = new ArrayList<>();
        for (Student j : list){
            if (j.getCourse().equals("语文") && j.getScore() > 60){
                newList.add(j);
//                System.out.println("add:" + j);
            }
        }
//        System.out.println(newList);

        int sum = 0,svg;    // 总和，平均数 初始化
        for (Student j : newList){
            sum += j.getScore();
        }

        svg = sum / newList.size(); // 平均数
        System.out.println("语文科目平均值为："+svg);

        System.out.println("以下同学 语文 科目分数到达平均值：");
        for (Student j : newList){
            if (j.getScore() >= svg){
                System.out.println(j);  // 重写了toString
            }
        }

    }   //  method main end.

}   // class end.
