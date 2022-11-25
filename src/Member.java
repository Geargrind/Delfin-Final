public abstract class Member {
    private String name;
    private int yeaOfBirth;
    private boolean active;
    private boolean passive;
    private double debt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYeaOfBirth() {
        return yeaOfBirth;
    }

    public void setYeaOfBirth(int yeaOfBirth) {
        this.yeaOfBirth = yeaOfBirth;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isPassive() {
        return passive;
    }

    public void setPassive(boolean passive) {
        this.passive = passive;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }
}
