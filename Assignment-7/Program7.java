class LibraryItem {
    String title;
    String publisher;
    int year;
}

class Book extends LibraryItem {
    String author;

    void setDetails(String t, String p, int y, String a) {
        title = t;
        publisher = p;
        year = y;
        author = a;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Author: " + author);
    }
}

class Magazine extends LibraryItem {
    int issueNumber;

    void setDetails(String t, String p, int y, int i) {
        title = t;
        publisher = p;
        year = y;
        issueNumber = i;
    }

    void display() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Issue Number: " + issueNumber);
    }
}

class Newspaper extends LibraryItem {
    String date;

    void setDetails(String t, String p, int y, String d) {
        title = t;
        publisher = p;
        year = y;
        date = d;
    }

    void display() {
        System.out.println("Newspaper Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Date: " + date);
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setDetails("Java Basics", "TechPub", 2021, "John");

        Magazine m = new Magazine();
        m.setDetails("Tech Monthly", "MediaHouse", 2022, 5);

        Newspaper n = new Newspaper();
        n.setDetails("Daily News", "NewsCorp", 2023, "01-06-2023");

        b.display();
        m.display();
        n.display();
    }
}
