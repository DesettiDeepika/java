import java.util.*;

final class University {
    String name;
    String location;
}

// class PrivateUniversity extends University {} // This will cause error

public class Assignment4 {
    public static void main(String[] args) {
        University u = new University();
        System.out.println("Cannot extend final class University");
    }
}
