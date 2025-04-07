package Object;


class Student{
    String name;
    int id;
    int age;
}

public class object {
    public static void main(String[] args) throws Throwable {
    Student obj1 = new Student();
    
    Student obj2 = (Student) Class.forName("Student").newInstance();
    
    obj1.name="Syed";
    obj2.name="Arham";

    
}
}