package front.TestWorkDemoRASTBER;

import java.util.ArrayList;

class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张同学",17,33.2));
        list.add(new Student("李同学",18,34.2));
        list.add(new Student("陈同学",19,35.2));
        list.add(new Student("周同学",20,36.2));
        list.add(new Student("江同学",21,37.2));
        double maxScorce = list.get(0).getScore();
        double minScorce = list.get(0).getScore();
        double sumScorce = 0;
        for (Student s : list) {
            if (s.getScore() > maxScorce){
                maxScorce = s.getScore();
            }
        }
        System.out.println(maxScorce);

        for (Student s : list) {
            if (s.getScore() < minScorce){
                minScorce = s.getScore();
            }
        }
        System.out.println(minScorce);

        for (Student s : list) {
            sumScorce += s.getScore();
        }
        double svg = sumScorce / list.size();
        System.out.println("平均分为："+ svg);

    }   //  method main end.


}