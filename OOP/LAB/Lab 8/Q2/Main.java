package Q2;

class Person {
    protected String name;
    protected String email;
    protected String phone;

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

class Student extends Person {
    private int studentId;
    private String major;
    private float GPA;

    public Student(String name, String email, String phone, int studentId, String major,float GPA) {
        super(name, email, phone);
        this.studentId = studentId;
        this.major = major;
        this.GPA = GPA;
    }

    public float getGPA() {
        return GPA;
    }
}

class Faculty extends Person {
    private int facultyId;
    private String department;
    private String rank;

    public Faculty(String name, String email, String phone, int facultyId, String department, String rank) {
        super(name, email, phone);
        this.facultyId = facultyId;
        this.department = department;
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}

class Staff extends Person {
    private int staffId;
    private String jobTitle;
    private float salary;

    public Staff(String name, String email, String phone, int staffId, String jobTitle, float salary) {
        super(name, email, phone);
        this.staffId = staffId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }
}

public class Main{
    public static void main(String[] args) {
        Student student = new Student("Arham","contact@syedarham.tech","03002806830",2551,"SE", 3.48F);
        Faculty faculty = new Faculty("Arham","contact@syedarham.tech","03002806830",2551,"SE","S-Rank");
        Staff staff = new Staff("Arham","contact@syedarham.tech","03002806830",2551,"SE",5000000.00F);
        System.out.println(student.getGPA());
        System.out.println(faculty.getRank());
        System.out.println(staff.getSalary());
    }
}