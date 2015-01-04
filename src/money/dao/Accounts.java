package money.dao;

public class Accounts {
    private float amount;
    private String name;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Accounts() {
    }

    public Accounts(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }
}