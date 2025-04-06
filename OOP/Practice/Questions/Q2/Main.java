package Q2;

import java.util.ArrayList;

class Professor{
    String name;
    String expertise;

    public Professor(String name, String expertise) {
        this.name = name;
        this.expertise = expertise;
    }

}

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Course(String courseName, String ProfessorName, String ProfessorExpertise) {
        this.courseName = courseName;
        this.professor = new Professor(ProfessorName, ProfessorExpertise);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public void displayDetails() {
        System.out.println("Name: " + this.courseName);
        System.out.println("Course Name : " + this.courseName);
        System.out.println("Proffesor Name :"+this.professor.name);
        System.out.println("Proffessor Expertise :"+this.professor.expertise);
        System.out.println("Students : ");
        for (Student student : students) {
            student.displayDetails();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Syed Arham", 2551);
        Student s2 = new Student("Malik Xaryab Awan", 3055);
        Student s3 = new Student("Saad Naeem",3074);
        Course c = new Course("Software Engineering","Sir Nadeem","OOP");
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        c.displayDetails();
    }
}
