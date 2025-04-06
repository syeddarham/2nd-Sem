package Q4;

public class Student {
    private String name;
    private String StdId;
    private double Balance;
    private static final double Sem_fee=5000;
    private Boolean TransportationCard;

    public Student(String name, String stdId) {
        this.name = name;
        this.StdId = stdId;
        this.Balance = 0;
        this.TransportationCard = false;
    }
    public String getName() {
        return name;
    }
    public String getStdId() {
        return StdId;
    }
    public double getBalance() {
        return Balance;
    }
    public Boolean getTransportationCard() {
        return TransportationCard;
    }
    public void register(){
        System.out.println(this.name + " has been registered");
    }
    public void payFee(double Fee){
        if(Fee>=Sem_fee){
            Balance+=Fee;
            TransportationCard=true;
            System.out.println("Fee has been payed for "+this.name);
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
    public void CardStatus(){
        if(TransportationCard){
            System.out.println("Transportation Card is Active");
        }
        else{
            System.out.println("Transportation Card is not Active");
        }
    }
    public void tapCard(Bus bus){
        if(TransportationCard){
        Attendance.RecordAttendance(this,bus);
        }
        else {
            System.out.println("Card Unactive,Kindly Pay Fees");
        }
    }

}
