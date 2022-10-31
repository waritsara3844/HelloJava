public class CEO extends Staff {

    protected int experience;
    protected int experienceRate;
    @Override
    public int getPayment() {
        return this.salary + (this.experience * this.experienceRate);
    }

    @Override
    public float getTax() {
        return this.salary * 0.03f;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperienceRate() {
        return experienceRate;
    }

    public void setExperienceRate(int experienceRate) {
        this.experienceRate = experienceRate;
    }

    public CEO(String name, int salary, int experience, int experienceRate) {
        super(name, salary);
        this.experience = experience;
        this.experienceRate = experienceRate;
    }
}
