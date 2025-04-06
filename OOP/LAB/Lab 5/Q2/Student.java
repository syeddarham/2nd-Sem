import java.util.List;
import java.util.ArrayList;

public class Student {
    private String studentID;
    private String name;
    private List<Assignment> assignments;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.assignments = new ArrayList<>();
    }


    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

}
