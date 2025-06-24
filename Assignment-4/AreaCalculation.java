import java.util.Scanner;

class Area {
    final double PI = 3.14; // Constant

    // Method to calculate area of circle
    void areaOfCircle(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    // Method to calculate area of cylinder
    void areaOfCylinder(double radius, double height) {
        double area = 2 * PI * radius * (radius + height);
        System.out.println("Surface Area of Cylinder = " + area);
    }
}

// Main class
public class AreaCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();

        // Circle input
        System.out.print("Enter radius of circle: ");
        double r1 = sc.nextDouble();
        a.areaOfCircle(r1);

        // Cylinder input
        System.out.print("Enter radius of cylinder: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double h = sc.nextDouble();
        a.areaOfCylinder(r2, h);
    }
}
