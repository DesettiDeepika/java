import java.util.Scanner;

class UniversityMember {
    String name;
    String id;
}

class Student extends UniversityMember {
    String course;

    void input() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        id = sc.nextLine();
        course = sc.nextLine();
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
    }
}

class Professor extends UniversityMember {
    String subject;

    void input() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        id = sc.nextLine();
        subject = sc.nextLine();
    }

    void display() {
        System.out.println("Professor Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
    }
}

class Staff extends UniversityMember {
    String role;

    void input() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        id = sc.nextLine();
        role = sc.nextLine();
    }

    void display() {
        System.out.println("Staff Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Role: " + role);
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Student s = new Student();
        Professor p = new Professor();
        Staff st = new Staff();
        s.input();
        s.display();
        p.input();
        p.display();
        st.input();
        st.display();
    }
}
