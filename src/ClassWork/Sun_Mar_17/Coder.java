package ClassWork.Sun_Mar_17;

public class Coder extends StaffMember implements STAFF {
    public Coder() {
        super();
    }
    public Coder(String name,int id, double salary) {
        super(name,id,salary);
    }

    @Override
    public void work() {
        System.out.println("工号为"+getId()+
                "基本工资为"+getSalary()
                +"的程序员正在努力的写着代码......");

    }
}   // class end.
