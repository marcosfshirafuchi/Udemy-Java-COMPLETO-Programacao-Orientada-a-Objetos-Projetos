package entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;

    public Account(){

    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount){

    }

    public void withdraw(double amount){

    }
}
