package entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount() {
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount -10.0;
        }

    }
}
