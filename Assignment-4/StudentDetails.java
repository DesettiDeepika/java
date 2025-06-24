import java.util.Scanner;

class Student {
    int rollno;
    String name;
    int mark1, mark2, mark3;
    int total;
    float average;

    // Function to input data
    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollno = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Mark 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter Mark 2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter Mark 3: ");
        mark3 = sc.nextInt();
    }

    // Function to calculate total and average
    void gettotal() {
        total = mark1 + mark2 + mark3;
        average = total / 3.0f;
    }

    // Function to display student details
    void displaydata() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll No: " + rollno);
        System.out.println("Name   : " + name);
        System.out.println("Mark 1 : " + mark1);
        System.out.println("Mark 2 : " + mark2);
        System.out.println("Mark 3 : " + mark3);
        System.out.println("Total  : " + total);
        System.out.println("Average: " + average);
    }
}

// Main class
public class StudentDetails {
    public static void main(String[] args) {
        Student s = new Student();
        s.getdata();
        s.gettotal();
        s.displaydata();
    }
}
