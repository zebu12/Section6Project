public class CheckingAccount implements Account {

    public double balance;

    public CheckingAccount(double balance) {
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
        return "CheckingAccount: " +
                "balance= " + balance +" Dollars of " +bankName +" ";
    }
}
