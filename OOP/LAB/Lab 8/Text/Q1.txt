package Q1;

class Item{
    protected String title;
    protected String author;
    protected String year;

    public Item(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}

class Book extends Item{
    private String publisher;
    private String ISBN;

    public Book(String title, String author, String year, String publisher) {
        super(title, author, year);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "publisher='" + publisher + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}

class Magzine extends Item{
    private String publisher;
    private String ISBN;

    public Magzine(String title, String author, String year, String publisher, String ISBN) {
        super(title, author, year);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Magzine{" +
                "publisher='" + publisher + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}

class DVD extends Item{
    private String director;
    private String length;

    public DVD(String title, String author, String year, String director, String length) {
        super(title, author, year);
        this.director = director;
        this.length = length;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "director='" + director + '\'' +
                ", length='" + length + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Item book = new Book("Solo-Leveling","2025","Manhwa","81628102");
        Item magzine = new Magzine("Demon Slayer","Arham","2023","MappaStudios","716316391");
        Item dvd = new DVD("Music","Xaryab Awan","2022","Syed Arham","21 Mins");
        System.out.println(book.toString());
        System.out.println(magzine.toString());
        System.out.println(dvd.toString());
    }
}
