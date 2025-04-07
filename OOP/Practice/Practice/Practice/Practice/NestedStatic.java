package Practice;

class Outer{
    static class Inner{
        int a =10;
        static void display(){
            System.out.println("Inside Inner Class");
        }
    }
}

class Main{
    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();
        i.display();
        Outer.Inner.display(); // can be done without object
    }
}