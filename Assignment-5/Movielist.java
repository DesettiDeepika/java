class Movie {
    String title;
    String genre;
    int year;

    // Constructor with title only
    Movie(String t) {
        title = t;
        genre = "Not Specified";
        year = 0;
    }

    // Constructor with title and genre
    Movie(String t, String g) {
        title = t;
        genre = g;
        year = 0;
    }

    // Constructor with title, genre, and year
    Movie(String t, String g, int y) {
        title = t;
        genre = g;
        year = y;
    }

    void display() {
        System.out.println("Title: " + title + ", Genre: " + genre + ", Year: " + year);
    }
}

public class Movielist {
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception");
        Movie m2 = new Movie("Interstellar", "Sci-Fi");
        Movie m3 = new Movie("Spirited Away", "Fantasy", 2001);

        m1.display();
        m2.display();
        m3.display();
    }
}
