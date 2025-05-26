package entities;

public class SavingsAccount extends Account {
    private Double interestRate;
    public SavingsAccount(){
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    //Sobreposição de métodos
    @Override
    public final void withdraw(double amount){
        balance -= amount;
    }
}
