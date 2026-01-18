package classandobject.level2;

public class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    public void deposit(double amount){
        balance+=amount;
        System.out.println("Amount Deposited Successfully");
    }
    public void withdraw(double amount){
        if (amount<balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance-=amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public void displayBalance(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Current Balance: "+balance);
    }
    public static void main(String[] args){
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Suresh";
        acc.accountNumber = 1234567890L;
        acc.balance = 5000;

        acc.deposit(2000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}
