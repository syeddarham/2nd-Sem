import java.util.ArrayList;
import java.util.List;

class Instructor {
    private String name;
    private String department;

    public Instructor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Instructor [Name: " + name + ", Department: " + department + "]";
    }
}

class Student {
    private String rollNumber;
    private String name;
    private String program;

    public Student(String rollNumber, String name, String program) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.program = program;
    }

    public Student(String string, String string2) {
        //TODO Auto-generated constructor stub
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    @Override
    public String toString() {
        return "Student [Roll No: " + rollNumber + ", Name: " + name + ", Program: " + program + "]";
    }

    public Assignment[] getAssignments() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAssignments'");
    }

    public void addAssignment(Assignment assignment2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAssignment'");
    }
}

class Course {
    private String courseCode;
    private String courseName;
    private Instructor instructor;
    private List<Student> enrolledStudents;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    @Override
    public String toString() {
        String result = "Course Code: " + courseCode +
                "\nCourse Name: " + courseName +
                "\nInstructor: " + instructor.getName() +
                " (" + instructor.getDepartment() + ")\nEnrolled Students:";
        if (enrolledStudents.isEmpty()) {
            result += " None";
        } else {
            for (Student student : enrolledStudents) {
                result += "\n\t" + student.getRollNumber() +
                        " - " + student.getName() +
                        " (" + student.getProgram() + ")";
            }
        }
        return result;
    }

    public Assignment[] getAssignments() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAssignments'");
    }

    public void addAssignment(Assignment assignment2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAssignment'");
    }

    public Student[] getStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudents'");
    }
}

public class CourseManagement {
    private List<Course> courses;

    public CourseManagement() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(String courseCode) {
        courses.removeIf(course -> course.getCourseCode().equals(courseCode));
    }

    public void generateReport() {
        System.out.println("----- Course Report -----");
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (Course course : courses) {
                System.out.println(course);
                System.out.println("----------------------------");
            }
        }
    }

    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Sir Nadeem", "Software Engineering");
        Instructor instructor2 = new Instructor("Ms Rabia Tabbasum", "Physics");
        Student student1 = new Student("S001", "Rafay", "BSSE");
        Student student2 = new Student("S002", "Mr Kotlin", "BSCS");
        Student student3 = new Student("S003", "Taha BaWazu", "BSAI");
        Course course1 = new Course("CS3055", "PF (Progamming Funadamental)", instructor1);
        Course course2 = new Course("MT1003", "MVC (Multi-Variable)", instructor2);
        course1.enrollStudent(student1);
        course1.enrollStudent(student3);
        course2.enrollStudent(student2);
        CourseManagement cms = new CourseManagement();
        cms.addCourse(course1);
        cms.addCourse(course2);
        cms.generateReport();
        System.out.println("\nAfter removing course CS3055:");
        cms.removeCourse("CS101");
        cms.generateReport();
    }
}
