package Q8;

public class Bank {
    protected final String BANK_NAME = "Secure Bank";

    public void showBankDetails() {
        System.out.println("Bank Name: " + this.BANK_NAME);
    }
}

final class SecureTransaction {
    public void processTransaction() {
        System.out.println("Transaction Processed Securely");
    }
}

class Account {
    final int accountNumber;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void showAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
    }

    public final void calculateInterest() {
        System.out.println("Interest Calculated");
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber) {
        super(accountNumber);
    }
    //THIS CANNOT BE OVERRIDE
//     public void calculateInterest() { }

    public void showSavingsMessage() {
        System.out.println("This is a savings account.");
    }
}

class Main {
    public static void main(String[] args) {
        Account account = new Account(123456);
        account.showAccountDetails();
        account.calculateInterest();
        SecureTransaction transaction = new SecureTransaction();
        transaction.processTransaction();
        SavingsAccount savingsAccount = new SavingsAccount(654321);
        savingsAccount.showAccountDetails();
        savingsAccount.showSavingsMessage();
    }
}

