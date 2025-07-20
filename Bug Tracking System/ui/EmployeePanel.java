package ui;

import dao.BugDAO;
import model.BugReport;
import java.util.Scanner;

public class EmployeePanel {

    Scanner sc = new Scanner(System.in);
    BugDAO bugDAO = new BugDAO();

    public void showMenu() {
        while (true) {
            System.out.println("\n=== Employee Panel ===");
            System.out.println("1. View All Bug Reports");
            System.out.println("2. Update Bug Status");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> viewBugs();
                case 2 -> updateBugStatus();
                case 3 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void viewBugs() {
        bugDAO.getAllBugs().forEach(b -> {
            System.out.println("Bug No: " + b.getBugNo());
            System.out.println("Code: " + b.getBugCode());
            System.out.println("Project ID: " + b.getProjectID());
            System.out.println("Tester: " + b.getTesterCode());
            System.out.println("Assigned To: " + b.getEmployeeCode());
            System.out.println("Status: " + b.getStatus());
            System.out.println("Desc: " + b.getBugDescription());
            System.out.println("------------------------------");
        });
    }

    private void updateBugStatus() {
        System.out.print("Enter Bug No to update: ");
        int bugNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter New Status: ");
        String status = sc.nextLine();
        bugDAO.updateBugStatus(bugNo, status);
    }
}
