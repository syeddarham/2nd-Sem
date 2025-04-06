package Q8;

public class Main {
    public static void main(String[] args) {
        Account a1=new Account(3055);
        a1.ShowAccDetails();
        a1.calculateInterest();
        Account a2=new Account(2551);
        a2.ShowAccDetails();
        a2.calculateInterest();
        SecureTranscation s1=new SecureTranscation();
        s1.processTransaction();
    }

}
