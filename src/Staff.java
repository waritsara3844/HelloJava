public abstract class Staff implements IPayment, ITax
{
    protected  int salary;
    protected  int overtime;
    protected  int rate;
    String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Staff(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getOvertime() {
        return overtime;
    }
    public int getSalary() {
        return salary;
    }
    public int getRate(){
        return rate;
    }


    public abstract int getPayment();
    public abstract float getTax();

}
