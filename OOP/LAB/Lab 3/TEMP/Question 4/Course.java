public class Course {
    private String courseCode;
    private String courseName;
    private int creditHours;

    public String getCourseCode() {
        return courseCode;
    }
    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCourseCode(String courseCode) {
        if (courseCode.matches("[A-Z]{2}[0-9]{3}")) {
            this.courseCode = courseCode;
        } else {
            System.out.println("Invalid Formart");
        }
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCreditHours(int creditHours) {
        if (creditHours >= 1 && creditHours <= 4) {
            this.creditHours = creditHours;
        } else {
            System.out.println("Invalid credit hours (1-4)");
        }
    }

    public void displayCourseDetails() {
        System.out.println("Course Code: " + getCourseCode());
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Credit Hours: " + getCreditHours());
    }
}