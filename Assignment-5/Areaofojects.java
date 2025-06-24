class Area {

    // Area of a circle
    double calculate(double radius) {
        return 3.14 * radius * radius;
    }

    // Area of a rectangle
    double calculate(double length, double width) {
        return length * width;
    }

    // Area of a triangle
    double calculateTriangle(double base, double height) {
        return 0.5 * base * height;
    }
}

public class Areaofobjects {
    public static void main(String[] args) {
        Area obj = new Area();

        double circleArea = obj.calculate(5.0); // radius
        double rectangleArea = obj.calculate(4.0, 6.0); // length, width
        double triangleArea = obj.calculateTriangle(8.0, 3.0); // base, height

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}
