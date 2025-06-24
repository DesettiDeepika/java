import java.util.*;

abstract class User {
    abstract void login();
}

interface CourseContent {
    void accessContent();
}

class Student extends User implements CourseContent {
    void login() {
        System.out.println("Student logged in");
    }
    public void accessContent() {
        System.out.println("Accessing course content");
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Student s = new Student();
        s.login();
        s.accessContent();
    }
}
