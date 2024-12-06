public class TestAccount {
    public static void main(String[] args) {


        Account sa = new SavingAccount(1000D);
        Account ca = new CheckingAccount(5000D);

        System.out.println();
        System.out.println("Initial balance: " + sa.getBalance());
        System.out.println("Initial balance: " + ca.getBalance());
        System.out.println();

        /**
         * deposit 100 to each account
         */

        System.out.println("Account balance after deposit of 100 dollars");
        System.out.println();

        sa.deposit(100d);
        ca.deposit(100d);

        System.out.println("Updated account balance: " + sa.getBalance());
        System.out.println("Updated account balance: " + ca.getBalance());

        System.out.println();

        /**
         * withdraw 10 percent from both account
         */

        System.out.println("Account balance after withdraw of 10 percent");
        System.out.println();

        sa.withdraw(sa.getBalance() * 0.1);
        ca.withdraw(ca.getBalance() * 0.1);
        System.out.println(sa);
        System.out.println(ca);

        //ca.toString();

    }
}
