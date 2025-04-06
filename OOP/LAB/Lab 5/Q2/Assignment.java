import java.util.Date;

public class Assignment {
    private String title;
    private Date dueDate;
    private String description;
    private Course course;

    public Assignment(String title, Date dueDate, String description, Course course) {
        this.title = title;
        this.dueDate = dueDate;
        this.description = description;
        this.course = course;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
