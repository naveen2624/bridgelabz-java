package thisstaticfinalkeywords;
public class BankAccount {

    // Static variable (shared across all accounts)
    static String bankName = "ABC Bank";
    private static int totalAccounts = 0;

    // Final variable (cannot be changed once assigned)
    final int accountNumber;

    // Instance variable
    String accountHolderName;

    // Constructor using 'this' to resolve ambiguity
    BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    // Static method to display total number of accounts
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method to display account details using instanceof
    void displayAccountDetails(Object obj) {
        if (obj instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
        } else {
            System.out.println("Object is not a BankAccount");
        }
    }
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Naveen");
        BankAccount acc2 = new BankAccount(102, "Arjun");

        acc1.displayAccountDetails(acc1);
        System.out.println();
        acc2.displayAccountDetails(acc2);

        System.out.println();
        BankAccount.getTotalAccounts();
    }
}

