package model.entities;

import model.exceptions.BusinessException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){

    }


    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        if (withdrawLimit <= 0) {
            throw new IllegalArgumentException("Withdraw limit must be greater than zero.");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }
        this.balance += amount;
    }

    public void withdraw(Double amount) throws BusinessException {
        if (amount > withdrawLimit){
            throw new BusinessException("The amount exceeds withdraw limit");
        }
        if (amount > getBalance()){
            throw new BusinessException("Not enough balance");
        }
        this.balance -= amount;
    }
    @Override
    public String toString(){
        return "New balance: " + String.format("%.2f", balance) ;
    }
}
