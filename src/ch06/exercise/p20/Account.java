package ch06.exercise.p20;

public class Account {
    private String account;
    private String name;
    private int money = 0;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money += money;
    }

    public void withdrawMoney(int money) {
        this.money -= money;
    }
}
