
import java.util.*;

class Students {
    String name;
    int ID;
    double gpa;

    Students() {
        System.out.println("Default Student profile Created");
        name = "Default Student";
        System.out.println("Name = " + name);
        System.out.println("ID = " + ID);
        System.out.println("GPA = " + gpa);
    }

    Students(String name, int id, double gpa) {
        this.name = name;
        this.ID = id;
        this.gpa = gpa;
        System.out.println("New Student Profile Created");
        System.out.println("Name = " + name);
        System.out.println("ID = " + id);
        System.out.println("GPA = " + gpa);

    }

    @Override
    protected void finalize() {
        if (this.ID == 0 && this.name.equals("Default Student")) {
            System.out.println("Default Student Profile Deleted : " + ID + " " + name);
        } else {
            System.out.println("Student Record Deleted: " + ID + " " + name);
        }
    }

}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();
        s1 = new Students("Arham", 2551, 3.49);
        s1 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}