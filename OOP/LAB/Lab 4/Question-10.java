class Appliance {
    Appliance() {
        System.out.println("Appliance's Default Constructor");
    }

    Appliance(String type) {
        this();
        System.out.println("Appliance Type: " + type);
    }

    Appliance(String type, String brand) {
        this(type);
        System.out.println("Appliance Brand: " + brand);
    }
}

class Electronic extends Appliance {
    Electronic() {
        this("General Electronic");
        System.out.println("Electronic's Default Constructor");
    }

    Electronic(String category) {
        super(category, "Default Brand");
        System.out.println("Electronic Category: " + category);
    }
}

class Laptop extends Electronic {
    Laptop() {
        this("No Brand", 8);
        System.out.println("Laptop's Default Constructor");
    }

    Laptop(String brand) {
        super("Electronic");
        System.out.println("Laptop Brand: " + brand);
    }

    Laptop(String brand, int ram) {
        super("Electronic");
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Laptop RAM: " + ram + "GB");
    }
}

public class Q10 {
    public static void main(String[] args) {
        System.out.println("Creating Laptop Object 1:");
        Laptop l1 = new Laptop();

        System.out.println("\nCreating Laptop Object 2:");
        Laptop l2 = new Laptop("Dell", 16);
    }
}
