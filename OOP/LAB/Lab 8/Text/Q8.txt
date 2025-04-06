package Q8;

class Account{
    protected float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public void displayBalance(){
        System.out.println(this.balance);
    }
    public void credit(float amount) {
        this.balance += amount;
    }
    public void debit(float amount) {
        this.balance -= amount;
    }
}

class SavingsAccount extends Account{
    private int timeSpan;
    public SavingsAccount(float balance, int timeSpan) {
        super(balance);
        this.timeSpan = timeSpan;
    }

    public float calculateInterest(float interestRate) {
        return interestRate * this.balance *timeSpan;
    }
    @Override
    public void credit(float interestRate) {
        this.balance += calculateInterest(interestRate);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(500, 10);
        savingsAccount.displayBalance();
        savingsAccount.credit(50);
        savingsAccount.displayBalance();
        savingsAccount.debit(50);
        savingsAccount.displayBalance();
    }
}
