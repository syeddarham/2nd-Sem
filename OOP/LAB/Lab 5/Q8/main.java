package Q8;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private final MedicalRecord medicalRecord;
    
    public Patient(String name) {
        this.name = name;
        this.medicalRecord = new MedicalRecord(this);
    }
    
    public void addMedicalRecordEntry(String entry) {
        medicalRecord.addEntry(entry);
    }
    
    public void generateReport() {
        System.out.println("==================================");
        System.out.println("Patient Name: " + name);
        System.out.println("Medical History: ");
        medicalRecord.displayMedicalHistory();
        System.out.println("==================================\n");
    }
    
    public void remove() {
        medicalRecord.deleteMedicalRecord();
    }
}

class MedicalRecord {
    private final Patient patient;
    private List<String> medicalHistory;
    
    public MedicalRecord(Patient patient) {
        this.patient = patient;
        this.medicalHistory = new ArrayList<>();
    }
    
    public void addEntry(String entry) {
        medicalHistory.add(entry);
    }
    
    public void displayMedicalHistory() {
        if (medicalHistory.isEmpty()) {
            System.out.println("No medical history available.");
        } else {
            for (String entry : medicalHistory) {
                System.out.println("- " + entry);
            }
        }
    }
    
    public void deleteMedicalRecord() {
        medicalHistory.clear();
    }
}

public class main {
    public static void main(String[] args) {
        Patient patient = new Patient("Syed Arham");
        patient.addMedicalRecordEntry("Fever");
        patient.addMedicalRecordEntry("Headache");
        patient.generateReport();
        patient.remove();
        System.out.println("Medical history deleted.");
        patient.generateReport();
    }
}


