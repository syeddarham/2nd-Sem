class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price;
    }
}

public class q7 {
    public static void main(String[] args) {
        Book book = new Book("Java: A Beginner's Guide", "Herbert Schildt", 100.95);
        System.out.println(book.toString());
    }
}