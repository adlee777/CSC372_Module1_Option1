public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setFirstName("Andrew");
        myAccount.setLastName("Lee");
        myAccount.setAccountID(1);

        myAccount.deposit(1000.0);
        myAccount.withdrawal(500.0);

        // Display account summary
        myAccount.accountSummary();

        System.out.println();

        CheckingAccount myCheckingAccount = new CheckingAccount();
        myCheckingAccount.setFirstName("Drew");
        myCheckingAccount.setLastName("Tester");
        myCheckingAccount.setAccountID(2);

        myCheckingAccount.deposit(2000.0);
        myCheckingAccount.processWithdrawal(3000.0);

        myCheckingAccount.accountSummary();
    }
}