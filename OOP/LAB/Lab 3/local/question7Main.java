package huzaifaalab3;

public class question7Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java: A Beginner's Guide","Herbert Scheldt",100.95);
        book1.details();

        Book book2 = new Book();
        book2.setAuthor("Huzaifa Shahid");
        book2.setBookTitle("Learning is easy process");
        book2.setPrice(200.30);


        book2.details();

    }
}
