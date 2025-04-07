public class Student {
    String name;
    int age;

    public void printDetails() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        this("arham", 18);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Overloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
    }
}
