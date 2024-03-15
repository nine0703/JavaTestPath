package front.Testing;

public class Student {
    private String name;
    private String course;
    private int score;

    public Student() {
    }

    public Student(String name, String course, int score) {
        this.name = name;
        this.course = course;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", score=" + score +
                '}';
    }
}   // class end.
