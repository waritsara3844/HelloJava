public class Developer extends Staff {


    protected int codingHour;
    protected int codingRate;

    public int getCodingHour() {
        return codingHour;
    }

    public void setCodingHour(int codingHour) {
        this.codingHour = codingHour;
    }

    public int getCodingRate() {
        return codingRate;
    }

    public void setCodingRate(int codingRate) {
        this.codingRate = codingRate;
    }

    public Developer(String name,int salary, int codingHour, int codingRate) {
        super(name,salary);
        this.codingHour = codingHour;
        this.codingRate = codingRate;
    }

    public int getPayment(){
        return this.salary + (this.codingHour * this.codingRate);
    }

    @Override
    public float getTax() {
        return this.salary*0.03f;
    }
}
