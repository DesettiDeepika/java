import java.util.Scanner;

class Employee {
    int empID;
    String empName;
    int deptID;
    String bloodGroup;
    double salary;

    // Method to read employee details
    void setEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        empID = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Department ID: ");
        deptID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Blood Group: ");
        bloodGroup = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    // Method to display employee details
    void printEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID   : " + empID);
        System.out.println("Name          : " + empName);
        System.out.println("Department ID : " + deptID);
        System.out.println("Blood Group   : " + bloodGroup);
        System.out.println("Salary        : " + salary);
    }
}

// Main class
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeDetails();
        e.printEmployeeDetails();
    }
}
