package Temp.Q2;

public class Pateint {
    private MedicalRecord m;

    Pateint(String illnessHistory, String prescriptions, String doctorNotes, String testResults){
        this.m = new MedicalRecord(illnessHistory,prescriptions,doctorNotes,testResults);       
    }

    public void generateReport(){
        System.out.println("********MEDICAL-REPORT***********");
        m.displayDetails();
        System.out.println("********************************");
    }
}

class Main{
    public static void main(String[] args) {
        Pateint p = new Pateint("none", "High-Fever", "Panadol", "negative");
        p.generateReport();
        
    }
}
