import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Object Oriented Programming", "1001");
        Course course2 = new Course("Multi Variable Calculus", "1002");
        Student student1 = new Student("2551", "Syed Arham");
        Student student2 = new Student("3055", "Malik Xaryab Awan");
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);
        Assignment assignment1 = new Assignment("Assignment 1", new Date(), "Abstraction", course1);
        Assignment assignment2 = new Assignment("Assignment 2", new Date(), "Encapsulation", course1);
        Assignment assignment3 = new Assignment("Assignment 3", new Date(), "Polymorphism", course2);
        course1.addAssignment(assignment1);
        course1.addAssignment(assignment2);
        course2.addAssignment(assignment3);
        student1.addAssignment(assignment1);
        student1.addAssignment(assignment3);
        student2.addAssignment(assignment2);
        System.out.println("Course: " + course1.getCourseName());
        System.out.println("Students enrolled:");
        for (Student student : course1.getStudents()) {
            System.out.println("- " + student.getName());
        }
        System.out.println("Assignments:");
        for (Assignment assignment : course1.getAssignments()) {
            System.out.println("- " + assignment.getTitle() + ": " + assignment.getDescription());
        }
        System.out.println("\nStudent: " + student1.getName());
        System.out.println("Assignments:");
        for (Assignment assignment : student1.getAssignments()) {
            System.out.println("- " + assignment.getTitle() + " for course " + assignment.getCourse().getCourseName());
        }
    }
}
