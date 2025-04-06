package Q7;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Department {
    private String departmentName;
    private String location;

    public Department(String departmentName, String location) {
        this.departmentName = departmentName;
        this.location = location;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getLocation() {
        return location;
    }
}

class Doctor extends Person {
    private String specialization;
    private int doctorID;
    private Department department;

    public Doctor(String name, int age, String specialization, int doctorID, String departmentName, String location) {
        super(name, age);
        this.specialization = specialization;
        this.doctorID = doctorID;
        this.department = new Department(departmentName, location);
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public Department getDepartment() {
        return department;
    }

    public void displayDoctorDetails() {
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("Doctor ID: " + getDoctorID());
        System.out.println("Department Name: " + getDepartment().getDepartmentName());
        System.out.println("Location: " + getDepartment().getLocation());
    }
}

class Patient extends Person {
    private int patientID;
    private String disease;
    private Doctor doctor;

    public Patient(String name, int age, int patientID, String disease, Doctor doctor) {
        super(name, age);
        this.patientID = patientID;
        this.disease = disease;
        this.doctor = doctor;
    }

    public int getPatientID() {
        return patientID;
    }

    public String getDisease() {
        return disease;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void displayPatientDetails() {
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Patient ID: " + getPatientID());
        System.out.println("Disease: " + getDisease());
        getDoctor().displayDoctorDetails();
    }
}

class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Syed Arham", 18, "Dermatologist", 123, "Cardiology Department", "Karachi");
        Patient patient = new Patient("Xaryab Awan", 18, 456, "Acne", doctor);
        patient.displayPatientDetails();
    }
}

