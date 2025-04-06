// class Student {
//     String name;
//     int age;

//     public void printDetails(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
    
//     public Student(){
//     }

//     // //Shallow Copy
//     // Student (Student s){
//     //     this.name = s.name;
//     //     this.age = s.age;
//     // }

//     //Deep Copy
//     Student (Student s){
//         this.name = new String(s.name);
//         this.age = s.age;
//     }

// }

// public class CopyConstructor {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         s1.name = "Syed Arham";
//         s1.age = 18;
//         s1.printDetails();
//         Student s2 = new Student(s1);
//         s2.printDetails();

//         //Shallow Copy
//         s2.name = "Arham";
//         s1.printDetails();
//         s2.printDetails();

//         //Deep Copy
//         s2 = new Student(s1);
//         // s2.name = "Xaryab Awan";
//         s1.printDetails();
//         s2.printDetails();

//     }    
// }

class ABC{
    String name;
    int age;
    float cgpa;

    ABC(){
        this.age=18;
        this.name="Arham";
        this.cgpa=2.5f;
    }

    ABC(ABC a){
        this.age=a.age;
        this.name=a.name;
        this.cgpa=a.cgpa;
    }
}

public class CopyConstructor {
public static void main(String[] args) {
    ABC a1 = new ABC();
    ABC a2 = new ABC(a1);
    System.out.println(a2.name);
}
    
}
