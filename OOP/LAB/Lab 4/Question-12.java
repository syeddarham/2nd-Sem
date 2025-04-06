import java.util.*;

class Books {
    String title;
    String authorName;
    double price;

    Books(String title) {
        this.title = title;
        authorName = "Unknown";
        price = 0.0;
        System.out.println("Book Title: " + title + " Author Name: " + authorName + " Book Price: " + price);
    }

    Books(String title, String authorName, double price) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        System.out.println("Book Title: " + title + " Author Name: " + authorName + " Book Price: " + price);
    }

    Books(String title, String authorName) {
        this.title = title;
        this.authorName = authorName;
        price = 0.0;
        System.out.println("Book Title: " + title + " Author Name: " + authorName + " Book Price: " + price);
    }
}

public class Q12 {
    public static void main(String[] args) {

        Books Book1 = new Books("Cyber Smoke", "James Overton", 500.0);
        Books Book2 = new Books("Distro", "Henry");
        Books Book3 = new Books("Crime and Punishment");

    }
}
