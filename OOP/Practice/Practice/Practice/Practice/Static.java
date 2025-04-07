package Practice;

class B {
    static int count=0;
    B(){
        count++;
    }
}

public class Static {
    public static void main(String[] args) {
        new B();
        new B();
        new B();
        System.out.println(B.count);
    }
}
