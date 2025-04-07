//Constructor Chaining
package Practice;

class A{

    A(int a){
        System.out.println("A-1");
    }

    A(){
        this(2);
        System.out.println("A-2");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        A a = new A();
    }
}
