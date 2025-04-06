package Q5;

public class Category {
    private String name;


    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Category: " + name);
    }
}