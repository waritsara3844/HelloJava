public class Marketing extends Staff {

    protected  int extraLanguage;
    protected  int getExtraLanguageRate;

    public int getExtraLanguage() {
        return extraLanguage;
    }

    public void setExtraLanguage(int extraLanguage) {
        this.extraLanguage = extraLanguage;
    }

    public int getGetExtraLanguageRate() {
        return getExtraLanguageRate;
    }

    public void setGetExtraLanguageRate(int getExtraLanguageRate) {
        this.getExtraLanguageRate = getExtraLanguageRate;
    }

    public Marketing(String name, int salary, int extraLanguage, int getExtraLanguageRate) {
        super(name, salary);
        this.extraLanguage = extraLanguage;
        this.getExtraLanguageRate = getExtraLanguageRate;
    }

    @Override
    public int getPayment() {
        return this.salary + (this.extraLanguage * this.getExtraLanguageRate);
    }

    @Override
    public float getTax() {
        return this.salary * 0.03f;
    }
}
