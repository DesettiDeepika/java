class Book {
    String title;
    String author;
    double price;

    // Constructor with title only
    Book(String t) {
        title = t;
        author = "Unknown";
        price = 0.0;
    }

    // Constructor with title and author
    Book(String t, String a) {
        title = t;
        author = a;
        price = 0.0;
    }

    // Constructor with title, author, and price
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price);
    }
}

public class Books {
    public static void main(String[] args) {
        Book b1 = new Book("Wings of Fire");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");
        Book b3 = new Book("Atomic Habits", "James Clear", 450.0);

        b1.display();
        b2.display();
        b3.display();
    }
}
