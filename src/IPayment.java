public interface IPayment extends ITax {
    public int getPayment();
    public String getName();

    @Override
    float getTax();
}
