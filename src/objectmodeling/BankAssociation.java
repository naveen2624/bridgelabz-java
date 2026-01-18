package ObjectModeling;

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer) {
        System.out.println("Account opened for " + customer.name + " in " + bankName);
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + " Balance: " + balance);
    }
}

public class BankAssociation {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Naveen", 5000);

        bank.openAccount(c1);
        c1.viewBalance();
    }
}
