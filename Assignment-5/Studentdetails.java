class Student {
    String name;
    int age;
    String dept;

    // No-argument constructor
    Student() {
        name = "Unknown";
        age = 0;
        dept = "Not Assigned";
    }

    // Constructor with one argument
    Student(String n) {
        name = n;
        age = 0;
        dept = "Not Assigned";
    }

    // Constructor with two arguments
    Student(String n, int a) {
        name = n;
        age = a;
        dept = "Not Assigned";
    }

    // Constructor with three arguments
    Student(String n, int a, String d) {
        name = n;
        age = a;
        dept = d;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Dept: " + dept);
    }
}

public class Studentdetails {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Anvitha");
        Student s3 = new Student("Anvitha", 20);
        Student s4 = new Student("Anvitha", 20, "CSE");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
