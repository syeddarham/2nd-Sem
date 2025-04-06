public class Student {
    public int Age;
    public String Name;
    public String Course;

    public static void main(String[] args) {
        Student student = new Student();
        student.Name = "Syed Arham";
        student.Age = 18;
        student.Course = "OOP in JAVA";
        System.out.println("My name is " + student.Name + ", I'm " + student.Age + " years old, and I am studying " + student.Course + ".");
    }
}