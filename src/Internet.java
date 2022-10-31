public class Internet implements IPayment{
    protected int monthlyRate;
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(int monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public Internet(String name,int monthlyRate) {
        this.name = name;
        this.monthlyRate = monthlyRate;
    }


    @Override
    public int getPayment() {
        return this.monthlyRate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getTax() {
        return 0;
    }
}
