public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        this.balance -= amount;
        System.out.println("Remaining balance: " + this.balance);
    }

    public void accountSummary() {
        System.out.println("Account Summary:");
        System.out.println("Account Id: " + this.accountID);
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Balance: " + this.balance);
    }
}
