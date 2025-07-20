package ui;

import dao.ProjectDAO;
import dao.BugDAO;
import model.Project;
import model.BugReport;

import java.util.Scanner;

public class ManagerPanel {

    Scanner sc = new Scanner(System.in);
    ProjectDAO projectDAO = new ProjectDAO();
    BugDAO bugDAO = new BugDAO();

    public void showMenu() {
        while (true) {
            System.out.println("\n=== Manager Panel ===");
            System.out.println("1. Add Project");
            System.out.println("2. View All Projects");
            System.out.println("3. Add Bug Report");
            System.out.println("4. View All Bug Reports");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addProject();
                case 2 -> viewProjects();
                case 3 -> addBug();
                case 4 -> viewBugs();
                case 5 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void addProject() {
        Project p = new Project();
        System.out.print("Enter Project ID: ");
        p.setProjectID(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Project Name: ");
        p.setProjectName(sc.nextLine());
        System.out.print("Enter Start Date: ");
        p.setStartDate(sc.nextLine());
        System.out.print("Enter End Date: ");
        p.setEndDate(sc.nextLine());
        System.out.print("Enter Description: ");
        p.setProjectDesc(sc.nextLine());

        projectDAO.addProject(p);
    }

    private void viewProjects() {
        projectDAO.getAllProjects().forEach(p -> {
            System.out.println("Project ID: " + p.getProjectID());
            System.out.println("Name: " + p.getProjectName());
            System.out.println("Start: " + p.getStartDate());
            System.out.println("End: " + p.getEndDate());
            System.out.println("Desc: " + p.getProjectDesc());
            System.out.println("------------------------------");
        });
    }

    private void addBug() {
        BugReport bug = new BugReport();
        System.out.print("Enter Bug No: ");
        bug.setBugNo(sc.nextInt());
        System.out.print("Enter Bug Code: ");
        bug.setBugCode(sc.nextInt());
        System.out.print("Enter Project ID: ");
        bug.setProjectID(sc.nextInt());
        System.out.print("Enter Tester Code: ");
        bug.setTesterCode(sc.nextInt());
        System.out.print("Enter Assigned Employee Code: ");
        bug.setEmployeeCode(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Bug Status: ");
        bug.setStatus(sc.nextLine());
        System.out.print("Enter Description: ");
        bug.setBugDescription(sc.nextLine());

        bugDAO.addBug(bug);
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
}