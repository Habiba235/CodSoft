package task3codsoft;

public class account extends atm {

    private double balance ;
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public account(double balance) {
    
        this.balance = balance;
    }

}
