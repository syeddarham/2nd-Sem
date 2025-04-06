package Q7;

public class Main {
    public static void main(String[] args) {
        Doctor D1=new Doctor("Xaryab",18,"Dental",3055,"DentalDept","Karachi");
        Patient P1=new Patient("Arham",10,2551,"dengue",D1);
        P1.Display_Patient_Details();
        D1.Display_Doc_details();
    }
}
