package Q4;

public class Attendance {
    private int Student_Id;
    private String date;
    private Boolean Status;

    public int getStudent_Id() {
        return Student_Id;
    }

    public String getDate() {
        return date;
    }

    public Boolean getStatus() {
        return Status;
    }

    public Attendance(int Student_Id, String date, Boolean Status) {
        this.Student_Id = Student_Id;
        this.date = date;
        this.Status = Status;

    }
    public static void RecordAttendance(Student student,Bus bus){
        System.out.println(student.getName()+" ID: "+student.getName()+" tapped thier card on bus "+bus.getBus_number());
        System.out.println("Attendance Recorded for "+java.time.LocalDate.now());
    }

}
