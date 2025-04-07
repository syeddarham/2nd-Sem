package gc;

class Example {
    @Override
    protected void finalize() {
        System.out.println("Object destroyed");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Example e1 = new Example();
            e1 = null;
            System.gc();
        } catch (Exception e) {
            System.out.println("");
        }
        finally{
            System.out.println("Done Deleting !");
        }
    }
}

