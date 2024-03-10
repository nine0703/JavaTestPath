package front;

public class Teacher {
//    Teacher类包含属性： String name ;  String gender(性别) ; int age;按照标准JavaBean的方式创建出Teacher类
    String name;
    String genter;
    int age;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String genter, int age) {
        this.name = name;
        this.genter = genter;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenter() {
        return genter;
    }

    public void setGenter(String genter) {
        this.genter = genter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", genter='" + genter + '\'' +
                ", age=" + age +
                '}';
    }
}   // class end.
