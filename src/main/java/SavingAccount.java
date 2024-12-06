public class SavingAccount implements Account {

    private double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;

    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;

    }

    @Override
    public double getBalance() {

        return balance;
    }

    @Override
    public String toString() {
        return "SavingAccount: " +
                "balance= " + balance +" Dollars of "+ bankName +" ";
    }
}
