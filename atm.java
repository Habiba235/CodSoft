package task3codsoft;

public class atm {

    private double balance;

    public atm(double balance) {
        this.balance = balance;
    }

    public atm() {
    }

    public void checkBalance() {

        System.out.println("Your balance is :" + this.balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Your balance has not enough money.");
        } else {
            this.balance -= amount;
            System.out.println("Your balance now is :" + this.balance);
        }
    }

    public void deposit(double amount) {

        this.balance += amount;
        System.out.println("Your balance now is :" + this.balance);
    }

}
