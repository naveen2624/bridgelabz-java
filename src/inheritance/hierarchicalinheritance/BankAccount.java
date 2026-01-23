package inheritance.hierarchicalinheritance;

class BankAccount {
    String accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;
}

class FixedDepositAccount extends BankAccount {
    int tenure;
}
