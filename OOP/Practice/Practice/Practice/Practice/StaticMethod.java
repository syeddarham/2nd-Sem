package Practice;

class Math{
    static int add(int a, int b){
        return a+b;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println(Math.add(1,2));
    }
}
