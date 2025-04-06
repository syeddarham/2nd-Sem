class Example {
    int a, b, c;

    // Default constructor
    Example() {
        this(10, 20); // Calls the second constructor
        System.out.println("Default constructor");
    }

    // Constructor with two parameters
    Example(int x, int y) {
        this(x, y, 30); // Calls the third constructor
        System.out.println("Two-parameter constructor");
    }

    // Constructor with three parameters
    Example(int x, int y, int z) {
        this.a = x;
        this.b = y;
        this.c = z;
        System.out.println("Three-parameter constructor");
    }

    void display() {
        System.out.println("Values: " + a + ", " + b + ", " + c);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.display();
    }
}
