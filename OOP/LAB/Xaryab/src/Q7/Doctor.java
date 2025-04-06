package Q7;

public class Doctor extends Person{
    protected String Specialization;
    protected int DoctorID;
    protected Department department;

    public Doctor(String name,int age,String specialization, int doctorID,String Dept,String loc) {
        super(name,age);
        Specialization = specialization;
        DoctorID = doctorID;
        department=new Department(Dept,loc);
    }
    public Doctor(String name,int age){
        super(name,age);
        System.out.println("Default Doc Created!");

    }
    public void Display_Doc_details(){
        super.Display_Details();
        System.out.println("Specialization: "+Specialization);
        System.out.println("Doctor ID: "+DoctorID);
        department.Display_Dept_Details();
    }
}
