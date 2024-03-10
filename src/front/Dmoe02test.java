package front;

import java.util.ArrayList;
import java.util.Arrays;

public class Dmoe02test {
    public static void main(String[] args) {
    /*18. 定义一个方法，方法接收一个集合对象（泛型为Teacher），方法内部实现，将年龄低于30的并且性别是男的老师找出，
    存到新集合中，方法返回新集合。
    Teacher类包含属性： String name ;  String gender(性别) ; int age;按照标准JavaBean的方式创建出Teacher类
    main方法中实现：创建5个老师对象，把对象保存到集合中。
    调用方法，接收返回的集合，打印筛选后的数据。*/
        Teacher t1 = new Teacher("何波","男",18);
        Teacher t2 = new Teacher("何波","男",18);
        Teacher t3 = new Teacher("何波","男",18);
        Teacher t4 = new Teacher("何波","男",18);
        Teacher t5 = new Teacher("何波","男",131);
        ArrayList<Teacher> list = new ArrayList<>(Arrays.asList(t1,t2,t3,t4,t5));
        ArrayList<Teacher> filteredList = filterAge(list);
        for (Teacher j : filteredList){
            System.out.println(j);
        }

    }   //  method main end.

    public static <E> ArrayList<E> filterAge(ArrayList<E> list) {
        ArrayList<E> newlist = new ArrayList<>();
        if (list != null){
            for (E j : list){
                if (j instanceof Teacher){
                    int age = ((Teacher) j).getAge();
                    if (age < 30){
                        newlist.add(j);
                    }
                }
            }
        }else {
            throw new RuntimeException("集合为null");
        }
        return newlist;
    }   //  method end.

}   // class end.
