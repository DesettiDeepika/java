class Employee {
    int empId;
    String name;
    double salary;

    // Constructor with Employee ID only
    Employee(int id) {
        empId = id;
        name = "Not Assigned";
        salary = 0.0;
    }

    // Constructor with Employee ID and Name
    Employee(int id, String n) {
        empId = id;
        name = n;
        salary = 0.0;
    }

    // Constructor with Employee ID, Name, and Salary
    Employee(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee ID: " + empId + ", Name: " + name + ", Salary: ₹" + salary);
    }
}

public class Employeeconstructor {
    public static void main(String[] args) {
        Employee e1 = new Employee(101);
        Employee e2 = new Employee(102, "Anvitha");
        Employee e3 = new Employee(103, "Anvitha", 50000.0);

        e1.display();
        e2.display();
        e3.display();
    }
}
