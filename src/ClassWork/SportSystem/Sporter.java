package ClassWork.SportSystem;

public class Sporter {
    private int id ;
    private String name ;
    private char gender ;
    private int age ;
    private String classpath ;

    public Sporter() {
    }

    public Sporter(int id, String name, char gender, int age, String classpath) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.classpath = classpath;
    }
    public void eat(){
        System.out.println("吃营养餐");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClasspath() {
        return classpath;
    }

    public void setClasspath(String classpath) {
        this.classpath = classpath;
    }

    @Override
    public String toString() {
        return "Sporter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", classpath='" + classpath + '\'' +
                '}';
    }
}   // class end.
