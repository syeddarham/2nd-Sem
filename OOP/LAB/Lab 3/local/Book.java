package huzaifaalab3;

public class Book {
    double price;
    String author;
    String bookTitle;

    Book(){

    }

    public Book(String title, String namee, double pricee){
        price = pricee;
        author = namee;
        bookTitle = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void details(){
        System.out.println("Book Title : " + bookTitle);
        System.out.println("Author : " + author);
        System.out.println("Price : " +price);
        System.out.println();
    }
}
