public class Cleaner implements IPayment{

    private int dayOfWork;
    private int rate;
    private String name;

    public int getDayOfWork() {
        return dayOfWork;
    }

    public void setDayOfWork(int dayOfWork) {
        this.dayOfWork = dayOfWork;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getTax() {
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cleaner(String name,int dayOfWork, int rate) {
        this.name = name;
        this.dayOfWork = dayOfWork;
        this.rate = rate;
    }

    public int getPayment(){
        return this.dayOfWork * rate;
    }
}
