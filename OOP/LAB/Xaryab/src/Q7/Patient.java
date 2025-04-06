package Q7;

public class Patient extends Person{
    protected int patientId;
    protected String Disease;
    protected Doctor doctor=new Doctor("default doctor",30);

    public Patient(String name,int age,int patientId, String disease, Doctor doctor) {
        super(name,age);
        this.patientId = patientId;
        Disease = disease;
        this.doctor = doctor;
    }
    public void Display_Patient_Details(){
        super.Display_Details();
        System.out.println("PatientID: "+patientId);
        System.out.println("Disease: "+Disease);
        doctor.Display_Doc_details();
    }
}
