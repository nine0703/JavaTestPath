package ClassWork.Sun_Mar_17;

public abstract class staff_member {
    private String name ;
    private int id ;
    private double salary ;

    protected staff_member() {
    }
    protected staff_member(String name ,int id ,double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}   // class end.
