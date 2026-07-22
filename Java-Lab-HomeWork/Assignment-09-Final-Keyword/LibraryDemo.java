class Book {
    final String isbn;
    String title;
    String author;
    double price;

    Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book book = new Book("978-93-12345-67-8", "Java Programming", "James Gosling", 599.0);

        book.display();

        // book.isbn = "111-22-333"; // Error: final variable cannot be changed
    }
}