package gc;

public class A {
    String name;
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Object is deleted !");
    }

    public A(String name){
        System.out.println("Object Created !");
        this.name=name;
    }

}

class deleteObject {
    public static void main(String[] args) {
      A arham = new A("Syed Arham");
        arham = null;
        System.gc();     
    }
}