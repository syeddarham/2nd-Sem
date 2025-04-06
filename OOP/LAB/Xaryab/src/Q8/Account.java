package Q8;

public class Account {
    private final int AccNumber;

    public Account(int accNumber) {
        this.AccNumber = accNumber;
    }
    public void ShowAccDetails()
    {
        System.out.println("AccNumber: "+AccNumber);
    }
    public final void calculateInterest(){
        System.out.println("Interest is Haram thus it wont be calculated");
    }
}
