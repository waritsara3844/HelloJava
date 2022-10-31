public class Rental implements IPayment{
    protected int rental;
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public int getRental() {
        return rental;
    }

    public void setRental(int rental) {
        this.rental = rental;
    }

    public Rental(String name,int rental) {
        this.name = name;
        this.rental = rental;
    }
    public int getPayment(){
        return this.rental;
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
