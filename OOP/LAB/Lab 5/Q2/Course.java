import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseCode;
    private List<Student> students;
    private List<Assignment> assignments;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    
}
