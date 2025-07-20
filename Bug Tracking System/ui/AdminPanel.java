package ui;

import java.util.Scanner;
import dao.EmployeeDAO;
import model.Employee;

public class AdminPanel {
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO empDao = new EmployeeDAO();

        while (true) {
            System.out.println("\n1. Add Employee\n2. Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                Employee e = new Employee();
                System.out.print("Enter Emp Code: ");
                e.setEmpCode(sc.nextInt());
                sc.nextLine();
                System.out.print("Enter Name: ");
                e.setEmpName(sc.nextLine());
                // (repeat for other fields...)
                empDao.addEmployee(e);
            } else if (ch == 2) {
                break;
            }
        }
    }
}
