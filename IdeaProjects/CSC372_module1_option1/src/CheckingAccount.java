public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount() {
        super(); // Call the superclass constructor
        this.interestRate = 0.0;
    }

    public void processWithdrawal(double amount) {
        double overdraftFee = 30.0;

        if (amount <= getBalance()) {
            super.withdrawal(amount);
        } else {
           super.withdrawal(amount + overdraftFee);
           System.out.println("An overdraft fee of " + overdraftFee + " has been added");
        }
    }

    @Override
    public void accountSummary() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
