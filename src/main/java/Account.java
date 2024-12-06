public interface Account {

    String bankName = "Bank of ZébuLove";

    public void deposit(double amount);
    public void withdraw(double amount);
    public double getBalance();

    public default double addInterestRate(double rate){

        System.out.println("Adding interest rate: " + rate + " on balance " + getBalance());
        return getBalance() * rate;
    }

}
