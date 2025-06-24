import java.util.Scanner;

class Person {
    String name;
    int age;
}

class Employee extends Person {
    String empId;
    String department;
}

class Salary extends Employee {
    double basicPay;
    double HRA;
    double DA;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine();
        empId = sc.nextLine();
        department = sc.nextLine();
        basicPay = sc.nextDouble();
        HRA = sc.nextDouble();
        DA = sc.nextDouble();
    }

    void calculateSalary() {
        double total = basicPay + HRA + DA;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + department);
        System.out.println("Total Salary: " + total);
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Salary s = new Salary();
        s.inputDetails();
        s.calculateSalary();
    }
}
