package entities;

public class SavingsAccountPlus extends SavingsAccount{
    //Sobreposição de métodos
    @Override
    public void withdraw(double amount){
        balance -= amount + 2.0;
    }
}
