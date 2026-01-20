package constructorsinstancevariableaccessmodifiers.accessmodifiers;

// Base class
class BankAccount {

    // Public variable
    public int accountNumber;

    // Protected variable
    protected String accountHolder;

    // Private variable
    private double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to access balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount");
        }
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder,
                   double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method demonstrating access to public and protected members
    void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber); // public
        System.out.println("Account Holder : " + accountHolder); // protected
        System.out.println("Balance        : " + getBalance());  // private via getter
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}

// Main class
public class BankAccountManagement {

    public static void main(String[] args) {

        // Creating SavingsAccount object
        SavingsAccount sa =
                new SavingsAccount(1001, "Naveen", 25000, 4.5);

        // Display account details
        sa.displayAccountDetails();

        // Modify balance using public method
        sa.setBalance(30000);

        System.out.println("\nAfter Balance Update:");
        sa.displayAccountDetails();
    }
}
