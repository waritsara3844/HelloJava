public class Electicity implements IPayment{

    protected int unit;
    protected int rate;

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Electicity(String name, int unit, int rate) {
        this.name = name;
        this.unit = unit;
        this.rate = rate;
    }

    public int getPayment(){
        return this.unit * rate;
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
