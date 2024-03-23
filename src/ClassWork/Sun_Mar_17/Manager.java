package ClassWork.Sun_Mar_17;

public class Manager extends StaffMember implements STAFF{
    private double bonus ;

    public Manager() {
        super();
    }

    public Manager(String name,int id, double salary,double bonus) {
        super(name,id,salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("工号为"+getId()+
                "基本工资为"+getSalary()
                +"奖金为"+ getBonus()
                +"的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}   // class end.
